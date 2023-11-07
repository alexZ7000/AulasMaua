require("dotenv").config({path: "..\\JavaScript\\full-stack\\.env" });
const axios = require('axios');
const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose'); //pacote que abstrai as requisições pro mongo(programar menos)
const uniqueValidator = require('mongoose-unique-validator');
const bcrypt = require('bcrypt');
const mongoConnection = process.env.DATABASE_DEFAULT_CONNECTION;
const app = express();

app.use(express.json());
app.use(cors());

const Filme = mongoose.model('Filme', mongoose.Schema({
        titulo: {type: String},
        sinopse: {type: String}
    })
);

const userSchema = mongoose.Schema({
    email: {type: String, required: true, unique: true},
    password: {type: String, required: true}
});

userSchema.plugin(uniqueValidator);
const User = mongoose.model('User', userSchema);

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

app.get('/login', async (req, res) => {
    const users = await User.find();
    res.send(users);
});

app.post('/login', async (req, res) => {
    const user = req.body.email;
    const password = req.body.password;
    const encryptPassword = await bcrypt.hash(password, 10); //quanto MAIOR o número mais difícil de quebrar e mais demorado para gerar, quanto MENOR mais fácil de quebrar e mais difícil de gerar
    const users = new User({email: user, password: encryptPassword});
    const mongoResponse = await users.save()
    console.log(mongoResponse);
    res.end();
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

