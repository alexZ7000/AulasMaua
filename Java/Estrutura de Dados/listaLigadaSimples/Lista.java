package listaLigadaSimples;

public class Lista {
    private No primeiro;

    // construtor padrão
    public boolean estaVazio() {
        return primeiro==null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(final No primeiro) {
        this.primeiro = primeiro;
    }

    public void insereInicio(final int i) {
        No noNovo = new No(i);
        if (!estaVazio()) {
            noNovo.setProximo(primeiro);
        }
        primeiro = noNovo;
    }

    public void insereFim (final int i) {
        No novo = new No(i);
        if (estaVazio()) primeiro = novo;
        else {
            No temp = primeiro;
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(novo);
        }
    }

    public int removeInicio() {
        int aux = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return aux;
    }

    @Override
    public String toString(){
        String s = "lista: ";
        if (estaVazio()) s += "vazia ";
        else{
            No temp = primeiro;
            while (temp != null){
                s += temp;
                temp = temp.getProximo();
            }
            s += "\\";
        }
        return s + "\n";
    }
}
