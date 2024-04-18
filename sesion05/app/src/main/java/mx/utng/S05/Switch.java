package mx.utng.S05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Defino objeto scanner
        String mensaje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificacion: ");
        int calif = scanner.nextInt();
        switch (calif) {
            case 10:
                mensaje = "Excelente!";
                break;
            case 9:
            case 8:
                mensaje = "Muy bien!";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            case 5:
                mensaje = "mejor vuelve a intentarlo :3";
                break;
            default:
                mensaje = "Calificacion invalida";
                break;
        }

    }
}
