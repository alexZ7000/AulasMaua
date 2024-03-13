package meuVetor;
import java.util.Date;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        System.out.print("Digite um tamanho para o vetor, 0 encerra: ");
        int n = sc.nextInt();
        final MeuVetor v1 = new MeuVetor(n);

        while (n > 0){
            v1.preencheVetor();
            System.out.println("Vetor gerado:\n" + v1);
            final int comparacoes = v1.bubbleSort();
            System.out.println("Vetor Ordenado:\n" + v1);
            System.out.print("Digite um tamanho para o vetor, 0 encerra: ");
            final long inicio = new Date().getTime();
            v1.bubbleSort();
            final long fim = new Date().getTime();
            System.out.println("tamanho = " + n + ", comparações = " + comparacoes);
            System.out.println("tempo = " + (fim - inicio) + "ms");
            System.out.println("Conversor para segundos: " + (fim - inicio) / 1000 + "s");
            System.out.println("Conversor para minutos: " + (fim - inicio) / 60000 + "min");
            System.out.println("Conversor para horas: " + (fim - inicio) / 3600000 + "h");
            System.out.print("Digite um tamanho para o vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
