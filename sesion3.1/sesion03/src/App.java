
import mx.utng.sesion03.Autor;
import mx.utng.sesion03.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor(); // con new se manda a llamar un metodo para crear un objeto en la clase
        autor.setNombre("Hermman");
        autor.setApellido("Hesse");
        autor.setEdad(18);
     

        Libro libro = new Libro();
        libro.setTitulo("Siddartha");
        libro.setAutor(autor);
        libro.setNumeroPaginas(123);
        libro.setAnio(1922);
        
        System.out.println("Libro: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor().getNombre()+" "+libro.getAutor().getApellido());







    }
}
