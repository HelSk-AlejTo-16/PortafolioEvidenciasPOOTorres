package mx.utng.s23.factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //Crear/Declarar un objeto "LoggerFactory"
        LoggerFactory factory = new LoggerFactory();
        //El usuario tecleara el tipo
 Scanner scanner = new Scanner(System.in);
 System.out.println("Teclee el tipo de logger (1)Archivo (2)Consola");
 int type = scanner.nextInt();
 scanner.close();
 //Crear el logger(Instancia) elegido por el usuario
 Logger logger = factory.getLogger(type);
 logger.log("Registro de eventos del sistema");
 
    }

}
