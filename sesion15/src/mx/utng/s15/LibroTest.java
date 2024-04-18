package mx.utng.s15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {
    public static void main(String[] args) { //<Parametrisando>>
        //Crear queue
        Queue<Libro> libros = new PriorityQueue<>(); //Priorizada 
        libros.add(new Libro("Cien años de Soledad", 3)); //forma anonima
        libros.add(new Libro("Amor en tiempos de colera", 1));
        libros.add(new Libro("El Coronel que no tenia quien le escribiera", 2));
        //los acomoda
        
        Libro libro = null;
        
        while ((libro = libros.poll())!=null) { //borra el ultimo de la lista
            System.out.println(libro.getTitulo());
          System.out.println(libros);
        }
    
        System.out.println(libros);


    }
    }
    

