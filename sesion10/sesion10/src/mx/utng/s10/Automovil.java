package mx.utng.s10;

import java.util.Arrays;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricante;
    private int kilometraje;
    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();
    

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        Automovil that = (Automovil) obj;
        //se usa diferente porque son String
        if(!that.marca.equals(this.marca)) return false;
        if(!that.modelo.equals(this.modelo)) return false;
        if(that.anioFabricante!=this.anioFabricante)return false;
        if(that.kilometraje!=this.kilometraje)return false;

        
        //array
        if(!Arrays.equals(that.llantas, this.llantas)) return false;
        return that.combustible.equals(this.combustible);
        



       
        
    }
//constructor
    public Automovil(String marca, String modelo, int anioFabricante, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricante = anioFabricante;
        this.kilometraje = kilometraje;

    }

    
/* 
    public Automovil(String marca, String modelo, int anioFabricante, int kilometraje, Llanta[] llantas,
            Combustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricante = anioFabricante;
        this.kilometraje = kilometraje;
        this.llantas = llantas;
        this.combustible = combustible;
    }
*/


    @Override
    public int hashCode() {
        int hash = 0;
        hash += marca.hashCode();
        hash += modelo.hashCode();
        hash += anioFabricante;
        hash += kilometraje;

        return hash;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlanta(Llanta delanteraIzquierda, Llanta delanteraDerecha, Llanta traseraIzquierda,
            Llanta traseraDerecha) {
        llantas[0] = delanteraIzquierda;
        llantas[1] = delanteraDerecha;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;

    }

    public void llenarTanque() {
        combustible.setLitrosActuales(
            combustible.getLitrosMaximos());

    }

    public void avanzar() {
        if(combustible.getLitrosActuales()>0){
            for(Llanta llanta : llantas){
                llanta.rodar();
            }
            combustible.usar();

        }else{
            System.out.println("No hya combustible");
        }

        

}}
