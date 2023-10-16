require("dotenv").config();
const axios = require('axios')

const appID = process.env.OPEN_WEATHER_API_KEY

const q = "Sao Caetano do Sul"
const unit = 'metric'
const language = 'pt-BR'
const cnt = '10'

const url = `https://api.openweathermap.org/data/2.5/forecast?q=${q}&units=${unit}&appid=${appID}&lang=${language}&cnt=${cnt}`
axios
    .get(url)
    .then(res=> {
        console.log(res)
        console.log(res.data)
        return res.data
    }).then((resD) => {
    console.log(resD.cnt)
    //return resD
})