package mx.utng.sesion19;

import java.util.Scanner;
/*
 * @author Leonel Alejandro Torres Perez
 * @since 22/02/24
 * @category GDS0622
 */
public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println("Escriba un numero para hacerlo binario");
    Scanner usuario = new Scanner(System.in);
    int numero = usuario.nextInt();
    usuario.close();//se tiene que cerrar xd
        //De Entero a binario
        String binario = Integer.toBinaryString(numero);
        System.out.printf("El numero %d es en binario %s",numero,binario);
        

    }
}
