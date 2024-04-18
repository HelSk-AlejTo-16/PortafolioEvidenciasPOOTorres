package mx.utng.s13.reto13;

   /**
 * @author Leonel Alejandro Torres Perez
 * @category GDS0622
 * @since 07-02-2024
 * 
 * 
 * 
 */

public class Triangulo implements Figura{
    private double base = 8.2;
    private double altura = 7.6;




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
  System.out.println("La formula para calcular un triangulo es (Base*Altura)/2: "+ (base*altura)/2);
}

}

