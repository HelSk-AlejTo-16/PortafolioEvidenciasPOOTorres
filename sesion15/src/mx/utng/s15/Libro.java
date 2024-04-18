package mx.utng.s15;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private int prioridad;  

    public Libro (String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;

    }
    public String getTitulo(){
        return titulo;
    }
    //Metodo para que implement comparable funcione
    //Libro libro son los que se estan comparandos (btw es muy abstracto)
    @Override
    public int compareTo(Libro libro) { //Comparar para que tenga la misma prioridad
        // TODO Auto-generated method stub
        return this.prioridad - libro.prioridad;
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", prioridad=" + prioridad + "]";
    }
    
}
