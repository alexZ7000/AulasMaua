const fatorialPromisse = (number) => {
    if (number < 0) return Promise.reject('Somente valores positivos'); // é uma promisse que pode rejeitar a entrada do usuario
    let f = 1;
    for (let i = 2; i <= number; i++) f *= i;
    return Promise.resolve(f); //retorna uma promisse
};

//chamadas com encadeamento then catch
const chamaComThenCatch = async () => {
    fatorialPromisse(8)
        .then(f => console.log('o fatorial de 8 é: ' + f))
        .catch(err => console.log(err));

    fatorialPromisse(-8)
        .then(f => console.log('o fatorial de -8 é: ' + f))
        .catch(err => console.log(err));
    //const result = await fatorialPromisse(8)
    //console.log(result)
};

chamaComThenCatch();

const asyncAwaitFunction = async () => {
    const chamada1 = await fatorialPromisse(5);
    console.log('o fatorial de 5 é: ' + chamada1);
    const chamada2 = await fatorialPromisse(-5);
    console.log('o fatorial de -5 é: ' + chamada2);
};

asyncAwaitFunction();