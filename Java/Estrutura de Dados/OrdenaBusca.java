import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args){
        final Scanner leitor = new Scanner(System.in);
        MeuVetor v1;
        System.out.print("\nDigite n, 0 encerra: ");
        int n = leitor.nextInt();
        while (n > 0) {
            v1 = new MeuVetor(n);
            v1.preencheVetor();
            System.out.print("Digite o valor para a busca: ");
            final double x = leitor.nextDouble();
            Retorno r = v1.buscaSimples(x);
            if (r.getAchou()) System.out.println(x + " Encontrado pela busca binária");
            else System.out.println(x + " Não encontrado pela busca simples");
            System.out.println("Busca simples realizou " + r.getCont() + " Comparações");
            System.out.println("\nOrdenando... ");
            v1.bubbleSort(); // ordenar custa caro
            r = v1.buscaBinaria(x);
            if (r.getAchou()) System.out.println(x + " Encontrado pela busca binária");
            else System.out.println(x + " Não encontrado pela busca binária");
            System.out.println("Busca binária realizou " + r.getCont() + " comparações");
            System.out.print("\nDigite n, 0 encerra: ");
            n = leitor.nextInt();
        }
        leitor.close();
    }
}
