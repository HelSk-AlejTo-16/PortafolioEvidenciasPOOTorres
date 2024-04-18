package mx.utng.s11.reto1;
import java.time.LocalDate;
public class Programador extends Empleado {
    private String lenguajePrincipal;
    private String nombre;
    private byte edad;
    private LocalDate FECHA_NACIMIENTO;
    public String getNombre() {
        return nombre;
    }


    public byte getEdad() {
        return edad = (byte)18;
    }


    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO = LocalDate.of(2005, 1, 16);
    }


    public float getSalario() {
        return salario = 4500;
    }
    float salario;
    

    public Programador(String nombre , byte edad, LocalDate FECHA_NACIMIENTO, float salario ,String lenguajePrincipal) {
        super(nombre,edad,FECHA_NACIMIENTO,salario,lenguajePrincipal);
        this.nombre = nombre;
     this.lenguajePrincipal = lenguajePrincipal;
    }
    

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }
    public String getnombre() {
        return nombre;
    }

    
}
