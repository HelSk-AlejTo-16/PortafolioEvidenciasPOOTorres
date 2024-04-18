package mx.utng.s14.ej1;
/* 
 * 
 * @author Leonel Alejandro Torres Perez
*/

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        //Instancia Prof1
        Profesor profa = new Profesor("Paty", "Hernandez Lopez", "UTNG00541");
        profa.vivir();
        profa.mostrarDatos();
        
        Profesor profe = new Profesorinterino("Jose", "Gutierrez Sanchez", "UNTG00551", LocalDate.of(2024, Month.DECEMBER, 21));
        profe.vivir();
        profe.mostrarDatos();
    }
    
}
