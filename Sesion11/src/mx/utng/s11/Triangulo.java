package mx.utng.s11;

public class Triangulo extends FiguraPlana { //Extends == Heredea/Es un(a)
    //Constructor
    private final String ESTILO;

    public Triangulo(double base, double altura, String eSTILO) {
        super(base, altura);
        this.ESTILO = eSTILO;
    }

    public double area(){
        return (getBASE()*getALTURA())/2;
    }
    public void mostrarEstilo(){
        System.out.println("Triangulo es: "+ESTILO);
    }
}
