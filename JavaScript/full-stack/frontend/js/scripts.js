const protocolo = 'http://'
const host = 'localhost'
const port = 3000
const url = `${protocolo}${host}:${port}`
const endPoint = 'filmes'
const api = `${url}/${endPoint}`

async function getFilmes() {
    const response = (await axios.get(api)).data
    console.log(response)
}