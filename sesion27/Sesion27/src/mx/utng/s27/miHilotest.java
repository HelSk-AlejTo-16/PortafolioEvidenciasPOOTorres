package mx.utng.s27;

public class miHilotest {  
    public static void main(String[] args) {
        miHilo hilo1 = new miHilo();
        hilo1.setDaemon(false); //Usuario
        miHilo hilo2 = new miHilo();
        hilo2.setDaemon(true);//BEHOLD MY DEMONS HOOOOOOI

        hilo1.start();
        hilo2.start();
        miHilo.pausarUnSegundo();
        
        hilo1.setParametro("terminar");
    }
}
