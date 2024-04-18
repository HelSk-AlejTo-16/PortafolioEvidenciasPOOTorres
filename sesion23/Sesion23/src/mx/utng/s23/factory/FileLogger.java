package mx.utng.s23.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
    @Override
    public void log(String msg) {
        try {//Intenta ejecutar aunque tenga errores
        BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
    //Todo lo que este dentro lo tratara de hacer
    writer.write(msg);
    writer.close();

        } catch (IOException e) {
            // y si no puede, lo hace lo de aquí
            System.out.println("Error de Input/Output: "+e.getMessage());
        }
       
        
    }
}
