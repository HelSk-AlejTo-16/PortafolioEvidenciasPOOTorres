package mx.utng.S05;

import java.util.Scanner;
//Leonel Alejandro Torres Perez
public class reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su calificacion");
        int calif = scanner.nextInt();

        if (calif == 10) {
            System.out.println("Excelente");

        } else if (calif == 9 || calif == 8) {
            System.out.println("Muy bien");
        } else if (calif == 7) {
            System.out.println("Bien");
        } else if (calif == 6) {
            System.out.println("Pasaste");
        } else {
            System.out.println("Calificacion no valida");
        }

    }

}
