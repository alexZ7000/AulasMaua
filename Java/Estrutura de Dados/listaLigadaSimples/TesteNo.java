package listaLigadaSimples;

public class TesteNo {
    public static void main (String[] args){
        No no1 = new No(10);
        No no2 = new No(20);

        System.out.println("n01: " + no1);
        System.out.println("n02: " + no2);
        no1.setProximo(no2);
        System.out.println("E agora? " + no1.getProximo());
        no2.setProximo(no2);
        System.out.println("E agora? " + no2.getProximo());
    }
}
