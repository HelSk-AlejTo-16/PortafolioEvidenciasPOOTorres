package mx.utng.s16.ejercicio3;

import java.time.LocalDate;

public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "Bobby";
        final int EDAD = 3;
        final float ESTATURA = 30.5F;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(2020, 8, 13);
        System.out.println("El nombre de mi mascota es: "+NOMBRE+" su edad es de "+EDAD+" años "+"Su estatura es de "+ESTATURA
        +" y nacio "+FECHA_NACIMIENTO);

        System.out.printf("El nombre de mi mascota es:|%8s|  su edad es de %05d años "+"Su estatura es de %.2f y nacio el dia: %4$te del mes %4$tb del %4$tY %n",NOMBRE,EDAD,ESTATURA,FECHA_NACIMIENTO);

        
    }
}
