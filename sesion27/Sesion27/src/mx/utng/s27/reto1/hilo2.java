package mx.utng.s27.reto1;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class hilo2 extends Thread {
    @Override
    public void run(){
while(true){
    System.out.println("Hilo 2: Sigue en ejecución");

    try {
        TimeUnit.MILLISECONDS.sleep(500);
    } catch (InterruptedException e) {
        
        e.printStackTrace();
    }
}
    }
}
