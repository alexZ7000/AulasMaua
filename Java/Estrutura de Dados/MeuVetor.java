public class MeuVetor {
    private final int[] v;
    private int ultimaPos;

    protected MeuVetor(int capacidade){
        v = new int[capacidade];
        ultimaPos = -1;
    }

    // métodos de acesso (get/set)
    public int getUltimaPos(){
        return ultimaPos;
    }

    public int[] getV(){
        return v;
    }

    public void setUltimaPos(int pos){
        if (pos >= 0 && pos < v.length) ultimaPos = pos;
        else ultimaPos = v.length - 1; //controle de estouro de array
    }

    public boolean estaCheio() {
        return ultimaPos == v.length - 1;
    }

    public boolean adiciona(int e){
        if (estaCheio()) return false;
        v[++ultimaPos] = e;
        return true;
    }
}