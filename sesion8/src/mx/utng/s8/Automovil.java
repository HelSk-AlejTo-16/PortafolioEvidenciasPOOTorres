package mx.utng.s8;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int kilometraje;

    //El chambeador (constructor)
    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje) { 
        //Los que estan adentro del constructor tienen solamente ese rango dentro del mismo bloque.
        //Los this. es una variable mas haya de le clase
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }
@Override /*Sobre escritura "Vas a sobre escribir sobre este objeto" */
public int hashCode() {
    int hash = 0;
    hash = marca.hashCode();
    hash = hash + modelo.hashCode();
    hash = hash + anioFabricacion;
    hash = hash + kilometraje;
    return hash;
}


}
