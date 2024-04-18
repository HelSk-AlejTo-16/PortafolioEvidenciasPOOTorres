package mx.utng.s16.ejercicio2;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;


public class Texto {
    public static void main(String[] args) throws IOException {//manejo de excepsiones
        FileWriter filewritter = new FileWriter(System.getProperty("user.home")+"/archivo.txt"); //exepciones no tiene permisos
       System.getProperty("user.home");
        //System.out.println(filewritter);

        BufferedWriter bw = new BufferedWriter(filewritter);
        bw.write("esta linea escribira en el archivo");
        bw.newLine();
        bw.write("Esta es una segundaLinea");
        bw.newLine();
        bw.write("Esta es una tercera Linea ");
        bw.write("\nFeliz 14 de febrero");
        bw.close(); //Esta cosa cierra las acciones

        BufferedReader br =new BufferedReader (new FileReader(System.getProperty("user.home")+"/archivo.txt"));

        //leer todo el archivo
        String linea = null;

        while ((linea = br.readLine())!=null){
            System.out.println(linea);
        }
        
    }
    
}
