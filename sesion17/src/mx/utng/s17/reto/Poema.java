package mx.utng.s17.reto;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * @author Leonel Alejandro Torres Perez
 *@category GDS0622
 @sinces 16-02-2024
 * 
 * "
 */

public class Poema {
    
    public static void main(String[] args) throws IOException {
        File poema = new File("C:\\Users\\leyot\\Desktop\\POO 2do Cuatri\\sesion17\\src\\mx\\utng\\s17\\reto\\poema.txt");
        FileWriter poemaFileWriter = new FileWriter(poema);
        BufferedWriter bw = new BufferedWriter(poemaFileWriter);
        //System.out.println(filewritter);

        
        bw.write("Poema");
        bw.newLine();
        bw.write("Envidio los edificios que te ven al caminar");
        bw.newLine();
        bw.write("Los caminos que soportan tu correr ");
        bw.newLine();
        bw.write("las brisas que te chocan al bailar");
        bw.newLine();
        bw.newLine();
        bw.write("y ese brillo que te sale natural");
        bw.newLine();
        bw.write("el sonido de tu caminar ");
        bw.newLine();
        bw.write("extraño tus sorbos al tomar");
        bw.newLine();
        bw.write("el aroma que esparce tu piel ");
        bw.newLine();
        
     bw.close();
BufferedReader br = new BufferedReader(new FileReader(poema));

String linea = null;
while ((linea = br.readLine())!=null) {
    System.out.println(linea);
    
}

    
        }
    }

    

