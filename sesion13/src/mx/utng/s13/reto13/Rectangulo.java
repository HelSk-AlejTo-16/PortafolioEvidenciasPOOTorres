package mx.utng.s13.reto13;

   /**
 * @author Leonel Alejandro Torres Perez
 * @category GDS0622
 * @since 07-02-2024
 * 
 * 
 * 
 */
public class Rectangulo implements Figura {
    private double base;
    private double altura;
    {
        base=3.0;
        altura = 4.3;
    }
    
    


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
public void calcularArea(){
  System.out.println("La formula del Rectangulo es Base * Altura: "+base*altura);
}

}
