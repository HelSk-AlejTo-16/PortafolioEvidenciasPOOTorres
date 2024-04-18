package mx.utng.s13;

/**
 * @author Leonel Alejandro Torres Perez
 * @category GDS0622
 * @since 07-02-2024
 * 
 * 
 * 
 */

public class Polimorfismo {
    public static void main(String[] args) {
        
    
    Venado v = new Venado();
    Animal a = v;
    Herbivoro h = v;
    Object o = v;

    System.out.println("Venado: "+ (v instanceof Venado ));
    System.out.println("Animal: "+(a instanceof Animal));
    System.out.println("Herbivoro: "+(h instanceof Herbivoro));
    System.out.println("Objeto: "+(o instanceof Object));

/**System.out.println("Scanner: "+ (v instanceof Scanner));**/
    }
    
    
}
