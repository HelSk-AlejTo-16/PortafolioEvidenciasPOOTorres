package mx.utng.s06;

import java.util.Scanner;

public class Meses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("teclea un mes");
        String mesActual = scanner.nextLine().toLowerCase();
        scanner.close();

        switch (mesActual) {
            case "enero":
                System.out.print(" Febrero,");
                
            case "febrero":
                System.out.print(" Marzo,");
                
            case "Marzo":
                System.out.print(" Abril,");
               
            case "Abril":
                System.out.print(" Mayo,");
              
            case "Mayo":
                System.out.print(" Junio,");
               
            case "Junio":
                System.out.print(" Julio,");
                
            case "Julio":
                System.out.print(" Agosto,");
               
            case "Agosto":
                System.out.print(" Septiembre,");
            
            case "Septiembre":
                System.out.print(" Octubre,");
                
            case "Octubre":
                System.out.print(" Noviembre,");
                
            case "Noviembre":
                System.out.print("Diciembre");
                
    
        
            break;

            default:
                break;
        }

    }

}   