package mx.utng.s14.ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>(); //hacer una lista, para esto necesitamos importar. Lo que esta dentro de <> es para definir la lista.En este caso en String
System.out.println(listaCadenas.isEmpty());

listaCadenas.add("Venado");
listaCadenas.add("Ornitorrinco");
listaCadenas.add("Gato");
listaCadenas.add("Pejelagarto");
listaCadenas.add("Aguila");
listaCadenas.add("Gato");
//Imprime la lista con todos sus elementos
//Lista
System.out.println("*/*/*/*/*/Listas/*/*/*/*/*/");
System.out.println(listaCadenas);
//imprima cada elemento con un salto de linea 
System.out.println("======For=======");
for(int i = 0; i<listaCadenas.size(); i++){
System.out.println(listaCadenas.get(i)); //.get para ir de elemento en elemento. el i, es para que cuente

}
System.out.println("==========ForEach=========");
//imprime la lista con un foreach
for ( String cadena : listaCadenas) {
    System.out.println(cadena);
    
}
//Uso de un conjunto

System.out.println("=======Uso de Conjunto========");

Set<String> conjuntoCadenas= new HashSet<>();
conjuntoCadenas.add("Venado");
conjuntoCadenas.add("Ornitorrinco");
conjuntoCadenas.add("Gato");
conjuntoCadenas.add("Pejelagarto");
conjuntoCadenas.add("Aguila");
conjuntoCadenas.add("Gato");
System.out.println("=========Mostrando un SET==========");
for (String cadena : conjuntoCadenas){
    System.out.println(cadena);
}
System.out.println("Lista de Numeros");
List<Numero> listaNumeros = new ArrayList<>(); //llamada anonima
listaNumeros.add(new Numero("uno"));
listaNumeros.add(new Numero("dos"));
listaNumeros.add(new Numero("Tres"));
listaNumeros.add(new Numero("Tres"));
listaNumeros.add(new Numero("Tres"));
listaNumeros.add(new Numero("Seis"));
for (Numero numero : listaNumeros){
System.out.println(numero.getNombre());
}
System.out.println("////////////////Lista de Numeros Con Set//////////////////////");
Set<Numero> setNumeros = new HashSet<>(); //llamada anonima
setNumeros.add(new Numero("uno"));
setNumeros.add(new Numero("dos"));
setNumeros.add(new Numero("Tres"));
setNumeros.add(new Numero("Tres"));
setNumeros.add(new Numero("Cinco"));
setNumeros.add(new Numero("Tres"));
for (Numero numero : setNumeros){
System.out.println(numero.getNombre());
}


    }
    
}
