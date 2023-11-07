const protocolo = 'http://';
const host = 'localhost';
const port = 3000;
const url = `${protocolo}${host}:${port}`;
const endPoint = 'filmes';
const api = `${url}/${endPoint}`;

async function getFilmes() {
    const completeUrl = `${api}`;
    const movies = (await axios.get(completeUrl)).data;
    let table = document.querySelector('.filmes');
    let tableBody = table.getElementsByTagName('tbody')[0];
    for (movie of movies) {
        let linha = tableBody.insertRow(0);
        let celulaTitulo = linha.insertCell(0);
        let celulaSinopse = linha.insertCell(1);
        celulaTitulo.innerHTML=movie.titulo;
        celulaSinopse.innerHTML=movie.sinopse;
    }
}

const registerFilmes = async () => {
    const completeUrl = `${api}`;
    let inputTitle = document.querySelector('#tituloInput');
    let inputSinopsis = document.querySelector('#sinopseInput');
    let title = inputTitle.value;
    let sinopsis = inputSinopsis.value;

    await ((title && sinopsis) ?
        async () => {
        inputTitle.value = "";
        inputSinopsis.value = "";
        const movies = (await axios.post(completeUrl, {titulo: title, sinopse: sinopsis})).data;
        let tabela = document.querySelector('.filmes');
        let corpoTabela = tabela.getElementsByTagName('tbody')[0];
        corpoTabela.innerHTML = "";
        for (filme of movies) {
            let linha = corpoTabela.insertRow(0);
            let celulaTitulo = linha.insertCell(0);
            let celulaSinopse = linha.insertCell(1);
            celulaTitulo.innerHTML = filme.titulo;
            celulaSinopse.innerHTML = filme.sinopse;
        }
    } :
        () => {
            let alert = document.querySelector('.alert');
            alert.classList.add('show');
            alert.classList.remove('d-none');
            setTimeout(() => {
                alert.classList.add('d-none');
                alert.classList.remove('show');
                }, 2000);
        }
    )();
};