public class Retorno {
    private int cont;
    private boolean achou;

    public int getCont() {
        return cont;
    }

    public boolean getAchou() {
        return achou;
    }

    public void incrementaContador() {
        cont++;
    }

    public void incrementaContador (final int k) {
        cont += k;
    }

    public void setAchou(boolean achou) {
        this.achou = achou; // o compilador ele olha apenas as variaveis que estão dentro do escopo, ao atribuir achou ele entende que estamos tentando atribuir achou a ele mesmo, para que ele atribua o valor de cima do achou a gnt tem que colocar o this
    }
}
