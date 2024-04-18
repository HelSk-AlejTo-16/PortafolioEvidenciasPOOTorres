package mx.utng.s14.reto1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * @autor Leonel Alejandro Torres Perez
 * @Category GDS0622
 * @since 08-02-2024
 * 
 * 
 * 
 * 
 */

public class Coleccion {
    public static void main(String[] args) {
        List<String> listasFrutas = new ArrayList<>();
        System.out.println(listasFrutas.isEmpty());
        listasFrutas.add("Plátanos");
        listasFrutas.add("Sandía");
        listasFrutas.add("Pera");
        listasFrutas.add("Manzana");
        listasFrutas.add("Naranja");
        listasFrutas.add("Kiwi");
        
        System.out.println("/*/*/*/*/Orden invertido/*/*/*/*");
        Collections.reverse(listasFrutas); //Metodo para invertir una lista
        for (String string : listasFrutas) {
            System.out.println(string);
        }
        System.out.println("================Muestra el elemento más pequeño================"); //Buscar la coleccion mas pequeña
        System.out.println(Collections.min(listasFrutas));
        System.out.println("==================muestra el Elemento más grande================="); ///Busca la coleccion mas grande
        System.out.println(Collections.max(listasFrutas));
        System.out.println("================muestra en orden alfabético===================="); //orden alfabetico
        Collections.sort(listasFrutas);
        for (String string : listasFrutas) {
            System.out.println(string);
        }
        System.out.println("+++++++++++++++Busca Pera y Naranja++++++++++++++++++++");
        System.out.println(Collections.binarySearch(listasFrutas, "Pera"));
        int indice = Collections.binarySearch(listasFrutas, "Pera");
        int indice1 = Collections.binarySearch(listasFrutas, "Naranja");
        if(indice >= 0 && indice1>=0){
            System.out.println("Si, existe Kiwi en: "+ (indice+1));
            System.out.println(" y también Naranja en: "+ (indice1+1));
        }else{
            System.out.println("No existe");
        }

        System.out.println("*************Agrega tres manzanas nuevas***************");
        Collections.addAll(listasFrutas, "Manzana", "Manzana", "Manzana");
        for (String string : listasFrutas) {
            System.out.println(string);
        }

        System.out.println("/*/*/*/*/*/Orden Aleatorio/*/*/*/*/*/");
        Collections.shuffle(listasFrutas);
        for (String string : listasFrutas) {
            System.out.println(string);
        }
        System.out.println("===================Contar Manzana======================");
        System.out.println(Collections.frequency(listasFrutas, "Manzana"));

    }
}
