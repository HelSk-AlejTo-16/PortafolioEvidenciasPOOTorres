package mx.utng.sesion04;

import java.util.Scanner;

public class Lector {

    private Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

 //Crear un lector de valores desde la terminal
  Scanner lector = new Scanner(System.in);

  System.out.println("Teclea tu nombre: ");

  //Leer lo que el usuario mande como entrada

  String nombre = lector.nextLine();


  //Concatenacion
System.out.println("Hola "+ nombre);
//Interpolacion
int edad = 18;
boolean casado = true;
   System.out.printf("Hola soy %s y tengo %d anios y %s casado\n", 
   nombre, edad, casado==true?"soy":"no soy" ); // La %s es string, ahi no hay que concatenar, pero sin olvidar que es printf
   
}

//Metodo muestra una ccadena dada como parametro
 public void muestraMensaje(String mensaje){
    System.out.println(mensaje);
 }
 //Parametro que lea a partir del escaner

 public String leerEntrada(){
return scanner.nextLine();


 } 

}

