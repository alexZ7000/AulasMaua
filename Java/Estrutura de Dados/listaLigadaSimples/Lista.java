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
            while (temp.getProximo() != null) { //percorrendo até o último elemento prox != de null
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

    public int removeFim() {
        int aux;
        if (primeiro.getProximo() == null){ //validação para verificar se o primeiro é o único elemento
             aux = primeiro.getInfo();
            primeiro = null; // esvazia a lista
        }
        else {
            No temp = primeiro;
            while (temp.getProximo().getProximo() != null) {
                temp = temp.getProximo();
            }
            aux = temp.getProximo().getInfo();
        }
        return aux;
    }

    @Override
    public String toString(){
        String s = "lista: ";
        if (estaVazio()) s += "vazia ";
        else{
            No temp = primeiro;
            while (temp != null){ //percorre até o final temp =! de null
                s += temp;
                temp = temp.getProximo();
            }
            s += "\\";
        }
        return s + "\n";
    }
}
