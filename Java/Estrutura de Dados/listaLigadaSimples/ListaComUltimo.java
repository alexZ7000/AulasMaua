package listaLigadaSimples;

public class ListaComUltimo extends Lista{
    private No ultimo;
    public No getUltimo() {
        return ultimo;
    }

    @Override
    public void insereInicio(final int i) {
        final No novo = new No(1);
        No primeiro = super.getPrimeiro();
        if (estaVazio()) ultimo = novo;
        else novo.setProximo(primeiro);
        super.setPrimeiro(novo);
    }
}
