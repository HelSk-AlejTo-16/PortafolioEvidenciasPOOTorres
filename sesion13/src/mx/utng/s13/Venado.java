package mx.utng.s13;

public class Venado extends Animal implements Herbivoro {
    private boolean tieneCuernos;



    @Override
   public void respirar(){
        System.out.println("respiro como venado");
    }
    @Override
    public void comer(){
        System.out.println("Como como venado");
    }
    public boolean isTieneCuernos() {
        return tieneCuernos;
    }
    public void setTieneCuernos(boolean tieneCuernos) {
        this.tieneCuernos = tieneCuernos;
    }
}
