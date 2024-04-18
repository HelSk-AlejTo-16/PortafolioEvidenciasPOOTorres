package mx.utng.s27.reto1;

import java.util.concurrent.TimeUnit;

public class hilo1 extends Thread{
    @Override
    public void run() {///metodo de ejecucion
       for (int i = 0; i <= 10; i++) {
        System.out.println("Hilo 1: "+i);
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        
       }
       
    }

    
}