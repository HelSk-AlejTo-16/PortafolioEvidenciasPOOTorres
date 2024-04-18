package mx.utng.s8.Reto1;

public class Main {
    public static void main(String[] args) {
        Rectangulo area1 = new Rectangulo(0,0);
        System.out.println("Cuadrado:"+area1.CalcArea());
        Rectangulo area2 = new Rectangulo(2,2);
        System.out.println("Cuadrado 2:"+area2.CalcArea());
        Rectangulo area3 = new Rectangulo(3,2);
        System.out.println("Rectangulo:"+area3.CalcArea());

        


    }
}
