public class MeuVetor {
    private int[] v;
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

    public boolean estaVazio() {
        return ultimaPos == -1;
    }

    public void adiciona(int e){
        if (estaCheio()) redimensiona(v.length * 2);

        v[++ultimaPos] = e;
    }

    public int remove(){
        if (estaVazio()) return 0;
        int aux = v[ultimaPos--];
        if (ultimaPos <= v.length / 4) redimensiona(v.length / 2);

        return aux;
    }

    private void redimensiona(int novaCapacidade) {
        int[] temp = new int[novaCapacidade];
        for (int i = 0; i < ultimaPos; i++) temp[i] = v[i];
        v = temp;
    }

    @Override
    public String toString() {
        String s = "";
        if (estaVazio()) s = s + "esta vaizo";
        else {
            for (int i= 0; i <= ultimaPos; i++){
                s = s + v[i] + " ";
            }
        }
        return s + "\n";
    }
}