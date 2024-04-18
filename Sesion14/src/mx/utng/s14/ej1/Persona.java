package mx.utng.s14.ej1;
/**
 * @author Leonel Alejandro Torres Perez
 * @category GDS0622
 * @since 08/02/24
 * 
 * 
 * 
 */
public abstract class Persona{ //recuerda que al transformar algo abstracto tambien lo hace la clase 
private String nombre;
private String apellidos;



public Persona(String nombre, String apellidos){
this.nombre = nombre;
this.apellidos = apellidos;


}
public void mostrarDatos(){
    System.out.printf("Persona: Nombre: %s%nApellidos:%s%n",nombre,apellidos); //%s para sustituir a cadena
    
}

public abstract void vivir(); //Puede a ver mas abstractas en una clase




public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellidos() {
    return apellidos;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

}
