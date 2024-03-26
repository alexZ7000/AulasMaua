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
        if (primeiro == null) ultimo = null; // sempre quando eu chamo um método eu jogo ele em cima da pilha de execução tornando a aplicação mais lenta
        else {
            primeiro.setAnterior(null);
        }
        return aux;
    }

    public int removeFim(){
        final int aux = ultimo.getInfo();
        ultimo = ultimo.getAnterior();
        if (ultimo == null) primeiro = null;
        else ultimo.setProximo(null);
        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        if (estaVazia()){
            s += "lista vazia";
        }
        else {
            s += "<= ";
            NoDuplo aux = primeiro;
            while (aux != null){
                s += aux + " = ";
                aux = aux.getProximo();
            }
            s += ">";
        }
        return s;
    }

    public int removePosicao(final int posicao) {
        if (posicao == 1) return removeInicio();
        else {
            int contador = 1;
            NoDuplo aux = primeiro;
            while (contador < posicao) {
                contador++;
                aux = aux.getProximo();
            }
        }
        return 0;
    }
}
