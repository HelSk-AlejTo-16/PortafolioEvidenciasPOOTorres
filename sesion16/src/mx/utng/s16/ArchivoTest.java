package mx.utng.s16;

import java.io.File;
import java.io.IOException;
/*
 * @autor Leonel Alejandro Torres Perez
 * @
 * 
 * 
 * 
 */
public class ArchivoTest {
    public static void main(String[] args) throws IOException {
        File archivos = new File("c:/temp/cursos/cursos.txt");
        //Consultar el nombre, ruta, directorio padre, si esta oculto, 
        //Si existe o no existe
      System.out.println("Nombre del archivo: "+archivos.getName());  //Nombre archivo
      System.out.println("Ruta: "+archivos.getPath()); //Ruta 
      System.out.println("Ruta absoluta "+archivos.getAbsolutePath());//Ruta absoluta
      System.out.println(archivos.getCanonicalPath());
      System.out.println("Directorio donde se encuentra el archivo "+archivos.getParent());//Directorio padre
      System.out.println("Existe? "+ (archivos.exists()?"Si":"No")); //? True == chi  False == ño ternalia
      System.out.println("Es oculto ?"+ (archivos.isHidden()?"Si":"No")); //Oculto

      //Tienes permisos de lectura, escritura , ejecucuion del archivo
      System.out.printf("%s Puede escribirse%n", archivos.canWrite()?"Si":"NO"); //%s pone el si o no 
      System.out.printf("%s Puede leer%n", archivos.canRead()?"Si":"NO");
      System.out.printf("%s Puede ejecutar%n", archivos.canExecute()?"Si":"NO");

      System.out.printf("%s Es directorio?%n ", archivos.isDirectory()?"Si":"NO");
      System.out.printf("%f kilobytes de tamaño", archivos.length()/1024.0); //%float



    }
    
}
