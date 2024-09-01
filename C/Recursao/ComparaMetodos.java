import java.util.Date;
import java.util.Scanner;

public class ComparaMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MeuVetor v;
        System.out.println("digite o tamanho, 0 encerra: ");
        int tamanho = scanner.nextInt();
        while (tamanho > 0) {
            v = new MeuVetor(tamanho);

            // v.preencheVetor();
            // //System.out.println(v);
            // long ini = new Date().getTime();
            // v.bubbleSort();
            // long fim = new Date().getTime();
            // //System.out.println("vetor ordenado pelo Bubble:\n" + v);
            // System.out.println("Bubble demorou: " + (fim - ini) + " ms");
            // v.resetVetor();

            v.preencheVetor();
            //System.out.println(v);
            long ini = new Date().getTime();
            v.quicksort(0, tamanho-1);
            long fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo Quick:\n" + v);
            System.out.println("quick demorou: " + (fim - ini) + " ms");

            System.out.println("digite o tamanho, 0 encerra: ");
            tamanho = scanner.nextInt();
        }
        scanner.close();
    }
}
