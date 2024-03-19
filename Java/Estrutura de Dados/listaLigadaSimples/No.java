package listaLigadaSimples;

public class No {
    private int info;
    private No proximo;

    public No (final int info){
        setInfo(info);
        proximo = null; // por clareza
    }
    public int getInfo() {
        return info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setInfo(final int info) {
        this.info = info;
    }

    public void setProximo(final No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "|" + info + "|->";
    }
}
