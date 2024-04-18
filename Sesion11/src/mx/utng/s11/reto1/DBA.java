package mx.utng.s11.reto1;

import java.time.LocalDate;

public class DBA extends Empleado {
    private String herramientaConsultas;
    private String nombre;
    private byte edad;
    private LocalDate FECHA_NACIMIENTO;
    private  float salario;

    public DBA(String nombre, byte edad, LocalDate FECHA_NACIMIENTO, float salario, String herramientaConstulas) {
        super(nombre,edad,FECHA_NACIMIENTO,salario,herramientaConstulas);
        this.herramientaConsultas = herramientaConstulas;
    }
    public String getherramientaConsultas(){
        return herramientaConsultas;
    }
    public String getHerramientaConsultas() {
        return herramientaConsultas;
    }
    public String getNombre() {
        return nombre="Cristian Garcia";
    }
    public byte getEdad() {
        return edad = (byte)18;
    }
    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO = LocalDate.of(2005, 2, 14);
    }
    public float getSalario() {
        return salario = 4500;
    }


}
