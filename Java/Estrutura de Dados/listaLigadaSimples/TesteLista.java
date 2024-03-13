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
    }
}
