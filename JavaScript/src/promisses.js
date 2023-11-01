//calculo soma de 1 a n para valores positivos, se não erro

const soma = (n) => {
    return n >= 0 ?
        new Promise (sla = (resolve, reject) => {
            let tempo = new Date().getTime() + 2000;
            let s = 0;
            for (let i= 1; i <= n; i++) s += i;
            while (new Date().getTime() <= tempo);
            resolve(s);
        }) : Promise.reject('Valor negativo');

    //if(n >= 0) return Promise.resolve((n * (n + 1)) / 2)
    //else return Promise.reject('Valor negativo')

    //Duas maneiras diferentes de escrever a mesma coisa (operador ternario)
    //return n >= 0 ?
        //Promise.resolve((n * (n + 1)) / 2) :
        //Promise.reject('Valor negativo')
};

soma(10)
    .then(s => console.log(s))
    .catch(erro => console.log(erro));

soma(-10)
    .then(s => console.log(s))
    .catch(erro => console.log(erro));

console.log("oxi");
