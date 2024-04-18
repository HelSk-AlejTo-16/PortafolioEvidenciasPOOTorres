package mx.utng.s18;
//java.io. *
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Envidio los edificios que te ven al caminar
 * los caminos que soportan tu correr
 * 
 * 
 * 
 * 
 * extraño tu forma de hablar
 * el sonido de tu caminar 
 * extraño tus sorbos al tomar 
 * el aroma que esparce tu piel 
 * 
 */
public class Binarios {
public static void main(String[] args) throws FileNotFoundException, IOException {
    
    //Crear un manejador de entrada de archivos binarios 
    //Archivoentrada
    BufferedInputStream bis = new BufferedInputStream (new FileInputStream("src/mx/utng/s18/foto.png"));
    BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("src/mx/utng/s18/copia_foto.png"));
//archivo salida 


//Comenzar Copia
byte[] buffer = new byte[1024];

int bytesLeidos = 0;

while ((bytesLeidos= bis.read(buffer))>0){
    bos.write(buffer,0,bytesLeidos);
}
bis.close();
bos.close();
 
}


    
}
