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

    public void insereInicio(final int i) {
        No noNovo = new No(i);
        if (!estaVazio()) {
            noNovo.setProximo(primeiro);
        }
        primeiro = noNovo;
    }

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
