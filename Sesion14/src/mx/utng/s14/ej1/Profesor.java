package mx.utng.s14.ej1;

public class Profesor extends Persona{ //Para el extends debe de poner un constructor y uno de los metodos abstractos
    private String idProfesor;

    public Profesor(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos);
        this.idProfesor = idProfesor;
    }

    @Override
    public void vivir() {
      
       System.out.println("Vive sin lujos");

    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
System.out.printf("Profesor: %s%n", idProfesor);
    }
 public String getIdProfesor() {
     return idProfesor;
 }
 
 public void setIdProfesor(String idProfesor) {
     this.idProfesor = idProfesor;
 }
   
    

    
}
