package meuVetor;
public class Teste1 {
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(10); //capacidade máxima do meu Array
        System.out.println("Vetor recem construido " + v1.getUltimaPos());
        // Pego a última posição do meu Array
        //v1.setUltimaPos(35); // "seto" a última posição do meu Array
        //System.out.println(v1.getUltimaPos()); // Pego a última posição do meu Array
        // if (v1.adiciona(100)) System.out.println("Elemento adicionado com sucesso");
        // else System.out.println("Vetor está chhheeeeiiooooo");

        System.out.println("Vetor depois de inserção: " + v1);

        /* for (int n = 0; n <= v1.getV().length; n++){
            v1.adiciona((n + 1) * 10);
            System.out.println(v1);
        }*/

        for (int i = 0; i <= 100; i++){
            v1.adiciona(i);
            System.out.println("Adicionou " + i + " capacidade: " + v1.getV().length);
        }
        System.out.println("\n<------------------------------------------------------------------------------------->\n");

        while (!v1.estaVazio()){
            System.out.println(v1.remove() + " foi atendido, capacidade: " + v1.getV().length);
        }
    }
}