package mx.utng.s14.ej2;


public class Numero {
    private String nombre;

    public Numero(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
    if(this==o) return true;
    if(o==null||getClass()!=o.getClass())return false;
    Numero numero = (Numero)o;

        return nombre!=null?nombre.equals(numero.getNombre()):numero.nombre == null;
     
    }
    @Override
    public int hashCode() {
        return nombre!= null?nombre.hashCode():0;
    }
    
}
