package listaLigadaSimples;

import java.util.Random;

public class TesteListaDupla {
    public static void main(String[] args){
        Random random = new Random();
        ListaDupla lDupla = new ListaDupla();
        do {
            if (random.nextBoolean()){
                if (random.nextBoolean()){
                    lDupla.insereInicio(random.nextInt(10)); // números aleatórios de 0 a 9
                    System.out.println("Insere Início");
                }
                else {
                    lDupla.insereFim(random.nextInt(10));
                    System.out.println("Insere Fim");
                }
            }
            else {
                if (random.nextBoolean()) {
                    System.out.println(lDupla.removeFim() + " foi removido do fim");
                }
                else{
                    System.out.println(lDupla.removeInicio() + " foi removido no início");
                }
            }
            System.out.println(lDupla);
        } while (!lDupla.estaVazia());
    }
}
