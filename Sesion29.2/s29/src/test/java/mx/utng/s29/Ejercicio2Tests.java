package mx.utng.s29;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class Ejercicio2Tests {
    private final List<Integer> CONJUNTO = java.util.Arrays.asList(1,4,2,-7,9);

    @Test
    @DisplayName("Negativos")
    void negatives(){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        List<Integer> real = ejercicio2.transformar(CONJUNTO, s -> -s);

        assertThat(real).containsExactly(-1,-4,-2, 7,-9);

    }
    @Test
    @DisplayName("Cuadrados")
    void squares(){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        List<Integer> real = ejercicio2.transformar(CONJUNTO, s -> s*s);

        assertThat(real).containsExactly(1,16,4,49,81);
    }
@Test
@DisplayName("Transformar y Sumar")
    void transformandAdd(){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Integer real = ejercicio2.transforarYSumar(CONJUNTO, s -> 1);
        System.out.println(real); 
        assertThat(real).isEqualTo(CONJUNTO.size());


    }
}
