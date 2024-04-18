package mx.utng.s8.Reto1;

public class Rectangulo {
    public double alto ;
    public double ancho ;
    private int lado;



    public Rectangulo(int lado) {
       this.lado = lado;


    }
    public Rectangulo(double alto, double ancho) { 
        this.alto = alto;  this.ancho = ancho;
     }
    public Rectangulo(double dato) {
        this.alto = dato;
        this.ancho = dato;
    }
    public double CalcArea(){
        return ancho*alto; 
    }
    @Override

    public int hashCode(){
        int hash = 0;
        hash = ((int)alto);
        hash = ((int)ancho);
        return hash;


    }


    


    
}
