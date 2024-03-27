package listaLigadaSimples;

import java.util.Random;

public class TesteLista {
    public static void main(String[] args){
        Random r = new Random();
        Lista lista = new Lista();
        System.out.println(lista);
        for (int i = 1; i <= 10; i++){
            lista.insereInicio(r.nextInt(10));
            System.out.println(lista);
        }
        for (int i = 0; i < 6; i++){
            lista.insereFim(i*10+5);
            System.out.println(lista);
        }
        if (lista.estaVazio()) System.out.println("Lista vazia, nao ha o que remover");
        else {
            System.out.println(lista.removeInicio() + " saiu do início");
            System.out.println(lista);
        }
    }

    //DIVERTIMENTOS
    //1. implementar o removeFim para lista ok
    //2. implementar o removeFim para listaComUltimo
    //3. implementar um teste para listaComUltimo
}
