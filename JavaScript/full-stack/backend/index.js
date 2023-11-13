require("dotenv").config({path: "..\\JavaScript\\full-stack\\.env" });
const axios = require('axios');
const express = require('express');
const cors = require('cors');
const jwt = require('jsonwebtoken');
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
    }));

const userSchema = mongoose.Schema({
    user: {type: String, required: true, unique: true},
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
    const filme = new Filme({titulo: titulo, sinopse: sinopse});
    await filme.save();
    const filmes = await Filme.find();
    res.json(filmes);
});

app.get('/signup', async (req, res) => {
    const users = await User.find();
    res.send(users);
});

app.post('/signup', async (req, res) => {
    try {
        const user = req.body.user;
        const password = req.body.password;
        const encryptPassword = await bcrypt.hash(password, 10); //quanto MAIOR o número mais difícil de quebrar e mais demorado para gerar, quanto MENOR mais fácil de quebrar e mais difícil de gerar
        const users = new User({
                user: user,
                password: encryptPassword
            });
        const mongoResponse = await users.save()
        console.log(mongoResponse);
        res.status(201).end();
    } catch (e) {
        console.log(e);
        res.status(409).end();
    }
});

app.post('/login', async (req, res) => {
    const user = req.body.user;
    const password = req.body.password;
    const userFromMongo = await User.findOne({user: user});
    if (userFromMongo) {
        const isPasswordCorrect = await bcrypt.compare(password, userFromMongo.password);
        if (isPasswordCorrect) {
            res.status(200).json({message: "Login successful"});
        } else {
            res.status(401).json({message: "Password incorrect"});
        }
        const token = jwt.sign(
            {
                user: userFromMongo.user
            },
            process.env.JWT_SECRET_KEY, {
                expiresIn: process.env.JWT_EXPIRATION_TIME
            }
        );
        res.status(200).json({
            message: "Login successful",
            token: token
        });
    }
    else {
        res.status(404).json({message: "User not found"});
    }
    res.end();
});

app.listen(3000, () => {
    try{
        connectToMongo();
        console.log('Listening on port 3000...');
    } catch (e) {
        console.log('Error on port 3000... ', e);
    }
});

