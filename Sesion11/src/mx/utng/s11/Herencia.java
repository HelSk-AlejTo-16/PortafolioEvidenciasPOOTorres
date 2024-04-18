package mx.utng.s11;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4.0, 5.0, "Estilo1");
        System.out.println("Informacion sobre el triangulo");
        triangulo.mostrarEstilo();
        triangulo.mostrarDimension();

        System.out.println("El area del triangulo es: "+triangulo.area());
        Triangulo triangulo1 = new Triangulo(6.0, 10.0, "Estilo2");
        System.out.println("Informacion sobre el triangulo");
        triangulo1.mostrarEstilo();
        triangulo1.mostrarDimension();
        System.out.println("El area del triangulo es: "+triangulo1.area());
    
    Triangulo triangulo2 = new Triangulo(42.0, 6.0, "Estilo2");
        System.out.println("Informacion sobre el triangulo");
        triangulo2.mostrarEstilo();
        triangulo2.mostrarDimension();
        System.out.println("El area del triangulo es: "+triangulo2.area());
    }
    }
    

