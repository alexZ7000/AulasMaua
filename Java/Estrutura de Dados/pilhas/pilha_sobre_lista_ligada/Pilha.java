package pilhas.pilha_sobre_lista_ligada;

import lista_ligada.No;

public class Pilha {
    private No topo;
    //construtor padrão 
    public boolean estaVazia() {
        return topo == null;
    }
    public void push(int info) {
        No novo = new No(info);
        if (!estaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }
    public int pop () {
        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("pilha: ");
        if (estaVazia()) {
            s.append("vazia");
        }
        else { 
            No aux = topo;
            while (aux != null) { //percorrer até o final
                s.append(aux).append("\n");
                aux = aux.getProximo();
            }
            s.append("//");
        }
        return s + "\n";
    }
    
}
