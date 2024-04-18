package mx.utng.s20;

public class Ciudadano {
    public static void main(String[] args) {
        Gobierno gobierno = Gobierno.getobjGobierno(); 
        gobierno.darApoyo();
        
        Gobierno pseudoOtro = Gobierno.getobjGobierno();
        pseudoOtro.darApoyo();


    }

    
}
