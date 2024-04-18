package mx.utng.s25.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gimnasio {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 100, nullable = false)
    private String NombreMaestro;
    
    private int CantidadEquipo; 
    private String Region;
    public String getNombreMaestro() {
        return NombreMaestro;
    }
    public void setNombreMaestro(String nombreMaestro) {
        NombreMaestro = nombreMaestro;
    }
    public int getCantidadEquipo() {
        return CantidadEquipo;
    }
    public void setCantidadEquipo(int cantidadEquipo) {
        CantidadEquipo = cantidadEquipo;
    }
    public String getRegion() {
        return Region;
    }
    public void setRegion(String region) {
        Region = region;
    }

    

    
}


