package mx.utng.s27.reto1;

public class retoTest {
    public static void main(String[] args) {
        hilo1 h1 = new hilo1();
        hilo2 h2 = new hilo2();
        hilo1 h3 = new hilo1();

        h2.setDaemon(true); //DEMONS HEE HOO (procesos que se ejecutan en segundo plano)

        h1.start();
        h2.start();
   
    }
}
