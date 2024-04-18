package mx.utng.s14.ej1;

import java.time.LocalDate;

public class Profesorinterino extends Profesor{

    private LocalDate FechaTerminacion;

    public Profesorinterino(String nombre, String apellidos, String idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        FechaTerminacion = fechaTerminacion;
    }
    
    @Override
    public void vivir(){
        super.vivir();
        System.out.println("Como Foraneo.Dios si castiga 2 veces");
    }

    public LocalDate getFechaTerminacion() {
        return FechaTerminacion;
    }

    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        FechaTerminacion = fechaTerminacion;
    }
    @Override 
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("Desempleado a partir de:"+FechaTerminacion);

    }
}
