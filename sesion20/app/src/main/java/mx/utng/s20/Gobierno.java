package mx.utng.s20;

public class Gobierno {
    private static Gobierno objGobierno;
    

    private Gobierno(){
        System.out.println("Unica Instancia de gobierno.");
    } 

    public static Gobierno getobjGobierno(){
        if(objGobierno == null){
            objGobierno = new Gobierno();//se crea para que esta instancia y solo esta pueda ser vista por el ciudadano. Y solo se creara una vez, despues retornara 
        }
    return objGobierno;
    }
public void darApoyo(){
    System.out.println("Dando apoyo al ciudadano.");
}
    }
    

