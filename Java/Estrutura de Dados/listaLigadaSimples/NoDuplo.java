package listaLigadaSimples;

public class NoDuplo {
     private int info;
     private NoDuplo anterior;
     private NoDuplo proximo;

     public NoDuplo (int info) {
         setInfo(info);
         setProximo(null);
         setAnterior(null);
     }

     public int getInfo() {
         return info;
     }

     public void setInfo(final int info){
         this.info = info;
     }

     public NoDuplo getProximo(){
         return proximo;
     }

     public void setProximo(final NoDuplo proximo) {
         this.proximo = proximo;
     }

     public NoDuplo getAnterior() {
         return anterior;
     }

     public void setAnterior(final NoDuplo anterior) {
         this.anterior = anterior;
     }

     @Override
    public String toString(){
         return "|" + info + "|";
     }
}
