package listaLigadaSimples;

public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    // construtor padrão

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereInicio (int i) {
        NoDuplo novo = new NoDuplo(i);
        if (estaVazia()){
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public void insereFim(final int i) {
        NoDuplo novo = new NoDuplo(i);
        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        }
        else{
            novo.setAnterior(ultimo);
            novo.setProximo(novo);
        }
        ultimo = novo;
    }

    public int removeInicio() {
        final int aux = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (estaVazia()) ultimo = null;
        else {
            primeiro.setAnterior(null);
        }
        return aux;
    }

    //fazer o remove fim
}
