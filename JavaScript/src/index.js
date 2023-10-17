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
        return res.data
    }).then((res) => {
        return res
    }).then(res => {
        return res.list
    }).then(res => {
        for (let prev of res) {
            console.log(
                `${new Date(prev.dt * 1000)
                .toLocaleString('pt-BR')} -max: ${prev.main.temp_max}\u00B0C - min: ${prev.main.temp_min}°C
                ${'descricao:' + prev.weather[0].description}`
            )
        }
        return res
    }).then(res => {
        const lista = res.filter(t => t.main.feels_like > 25)
        console.log(`${lista.length} previsões com sensação térmica acima de 25°C`)
    }).catch(err => {
        console.log(err)

});
