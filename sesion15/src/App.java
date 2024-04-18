import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class App {
    public static void main(String[] args) throws Exception {
      List<String> materias = new ArrayList<>();
      //List<integer>numeros = new ArrayList<>();

      materias.add("POO");
      Collections.addAll(materias,"FSC","BD","MDS","I","IR","FM"); //Metodo de Clase
      System.out.println(materias);
      for(String materia : materias){ //Para listarlas descendentemente //para cada materia, de las materias imprime las materias
        System.out.println(materia);
      }
      System.out.println("/////////////de Regreso//////////////");
      Collections.reverse(materias);
      System.out.println(materias);

    System.out.println("mas Pequeña:"+Collections.min(materias));

    System.out.println("Mas grande:"+Collections.max(materias));
    Collections.sort(materias); //
    System.out.println(materias);

    System.out.println("La materia Metodologia y Modelado se encuantra en la posicion: "
    +(Collections.binarySearch(materias, "MDS")+1)); //+1 por que cuenta el cero

    Collections.addAll(materias,"POO","POO","POO"); //agregar
    System.out.println(materias);

    Collections.shuffle(materias);//Desordenarlas
    System.out.println(materias);

    System.out.println("Hay POO "+Collections.frequency(materias, "POO")+" en la lista");//contar


    














    }
}
