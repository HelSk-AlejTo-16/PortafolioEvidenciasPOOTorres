package mx.utng.s11.reto1;

import java.time.LocalDate;

public class maincra {
    public static void main(String[] args) {
         Programador programador1 = new Programador("Leonel Torres",(byte)19, LocalDate.of(2005, 1, 16),20000,"Java");
        System.out.println("El Programador es:");

System.out.println("Nombre del programador: "+programador1.getnombre());
System.out.println("Edad del programador: "+programador1.getEdad());
System.out.println("Fecha de nacimiento del Programador: "+programador1.getFECHA_NACIMIENTO() );
System.out.println("Salario del programador: "+programador1.getSalario());
System.out.println("El lenguaje que usa el programador es:"+programador1.getLenguajePrincipal());
        
DBA dba1 = new DBA("Cristian Garcia ", (byte) 18, LocalDate.of(2005, 2, 14), 20000, "Mysql");

System.out.println("El nombre del programador de base de datos es: ");
System.out.println("Nombre del programador de base de datos: "+dba1.getNombre());
System.out.println("Edad del programador de base de datos: "+dba1.getEdad());
System.out.println("Fecha de nacimiento del programador de base de datos: "+dba1.getFECHA_NACIMIENTO());
System.out.println("Salario del programador de base de datos: "+dba1.getSalario());
System.out.println("La herramienta que usa para programar es:"+dba1.getherramientaConsultas());



    }
}
