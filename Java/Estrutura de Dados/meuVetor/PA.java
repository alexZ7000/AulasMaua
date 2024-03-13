package meuVetor;
import java.util.Scanner;

public class PA {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        double primeiro_numero = leitor.nextInt();
        System.out.print("Insira o último número: ");
        double ultimo_numero = leitor.nextInt();
        System.out.println("\nResposta: " + (primeiro_numero + ultimo_numero) * ultimo_numero / 2);
    }
}