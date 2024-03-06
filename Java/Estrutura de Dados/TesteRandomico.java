public class TesteRandomico {
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(10);
        v1.preencheVetor();
        System.out.println("Vetor gerado\n" + v1);
        v1.bubbleSort();
        System.out.println("Vetor ordenado pelo Bubble:\n" + v1);
    }
}
