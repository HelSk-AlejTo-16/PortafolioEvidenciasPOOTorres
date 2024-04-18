package mx.utng.s13.reto13;
   /**
 * @author Leonel Alejandro Torres Perez
 * @category GDS0622
 * @since 07-02-2024
 * 
 * 
 * 
 */

public class principal {
 public static void main(String[] args) {

    Figura figura;
    figura = new Triangulo();
    figura.calcularArea();

    figura = new Cuadrado();
    figura.calcularArea();

    figura = new Rectangulo();
    figura.calcularArea();

    
    
    
 }
}
