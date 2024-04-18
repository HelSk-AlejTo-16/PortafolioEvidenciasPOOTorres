package mx.utng.s11.reto1;

import java.time.LocalDate;

public class Persona {
    private String nombre; 
    private byte edad;
    private final LocalDate FECHA_NACIMIENTO;

    public Persona(String nombre, byte edad, LocalDate fECHA_NACIMIENTO) {
        this.nombre = nombre;
        this.edad = edad;
        FECHA_NACIMIENTO = fECHA_NACIMIENTO;

    }

    public String getnombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }
    



    



}
