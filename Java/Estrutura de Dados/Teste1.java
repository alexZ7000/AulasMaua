import java.util.Arrays;

public class Teste1 {
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(10); //capacidade máxima do meu Array
        System.out.println(v1.getUltimaPos()); // Pego a última posição do meu Array
        v1.setUltimaPos(35); // "seto" a última posição do meu Array
        System.out.println(v1.getUltimaPos()); // Pego a última posição do meu Array
        v1.adiciona(100);
    }
}