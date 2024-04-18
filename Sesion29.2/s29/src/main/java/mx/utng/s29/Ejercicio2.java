package mx.utng.s29;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;



public class Ejercicio2 {
  List<Integer> transformar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
    List<Integer> nuevaLista = new ArrayList<>();
    for (Integer value : conjunto) {
        nuevaLista.add(funcion.apply(value));
        
    }
    return nuevaLista;

  }
  Integer transforarYSumar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){

    Integer Acomulador = 0; 
    for (Integer value :conjunto){
        Acomulador+= funcion.apply(value); 
    

    }
    return Acomulador;
  }
}
