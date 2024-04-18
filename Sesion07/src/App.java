
import mx.utng.s07.Menu;
import mx.utng.s07.Lector;
import mx.utng.s07.ListasTareas;
//Leonel Alejandro Torres Perez

public class App {
    public static void main(String[] args) throws Exception {
      Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();

        byte opcionSeleccionada = 0;
        do{
            menu.muestraOpciones();
        opcionSeleccionada = lector.leeOpcion();
        System.out.println("\n\n La opcion seleccionada es: "+opcionSeleccionada);
        

            

        
        switch(opcionSeleccionada){
            case 1: 
            lista.crearNuevalista();
            break;
            case 2: 
            lista.verListaTareas();
            break;
            case 3: 
            lista.verListaDeTareas();
            break;
            case 4: 
            lista.actualizarListasTareas();
            break;
            case 5: 
            lista.eliminarListaTaras();
            break;
            case 6: 
            System.out.println("Saliendo de la apilicacion");
            break;

            default: 
            System.out.println("Opcion Desconocida");
            break;
    
        }
    }while(opcionSeleccionada !=6);
    
    }

}
