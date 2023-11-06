require("dotenv").config();
const axios = require('axios');
const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose'); //pacote que abstrai as requisições pro mongo(programar menos)
const mongoConnection = process.env.DATABASE_DEFAULT_CONNECTION;
const app = express();

app.use(express.json());
app.use(cors());

const Filme = mongoose.model('Filme', mongoose.Schema({
        titulo: {type: String},
        sinopse: {type: String}
    })
);

const connectToMongo = async () => {
    await mongoose.connect(mongoConnection);
    console.log('Connected to MongoDB...');
}

//ponto de acesso para req get teste
app.get('/filmes', async (req, res) => {
    const filmes = await Filme.find();
    res.send(filmes);
});

app.post('/filmes', async (req, res) => {
    const titulo = req.body.titulo;
    const sinopse = req.body.sinopse;
    const filme = new Filme({titulo, sinopse});
    await filme.save();
    const filmes = await Filme.find();
    res.json(filmes);
});

app.listen(3000, () => {
        try{
            connectToMongo();
            console.log('Listening on port 3000...');
        } catch (e) {
            console.log('Error on port 3000... ', e);
        }
    }
);

