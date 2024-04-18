package mx.utng.s11.reto1;

import java.time.LocalDate;

public class Empleado extends maincra {
    private float salario;

    public Empleado(String nombre, byte edad, LocalDate FECHA_NACIMIENTO ,float salario, String lenguajePrincipal) {
        this.salario= salario;
    }


    public float getSalario() {
        return salario;
    } 
    public void mostrarSalario(){
        System.out.println(20000.0);
    }

        
    }
    

    
    

