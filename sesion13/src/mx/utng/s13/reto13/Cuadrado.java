package mx.utng.s13.reto13;
   /**
 * @author Leonel Alejandro Torres Perez
 * @category GDS0622
 * @since 07-02-2024
 * 
 * 
 * 
 */
public class Cuadrado implements Figura {
    private double lado = 10.0;
   

   


    public double getLado() {
        return lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public void calcularArea(){
      System.out.println("La formula para calcular un Cuadrado es Lado * Lado: "+lado*lado);
    }
    
}
