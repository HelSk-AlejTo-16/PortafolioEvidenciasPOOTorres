package mx.utng.s10.ej01;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador cont1 = new Contador();
        Contador cont2 = new Contador();
        Contador cont3 = new Contador();
        Contador cont4 = new Contador();
        Contador cont5 = new Contador();
        //El resultado depende de cuantas veces se esta llamando la clase Contador. Es lo que hace el Static
        //El otro solo se esta llamando igualmente 1 vez 
        cont1.setContadorInstancia((short)2);//casting
        cont2.setContadorInstancia((short)3);//casting
        cont3.setContadorInstancia((short)20);//casting
        cont4.setContadorInstancia((short)200);//casting
        cont5.setContadorInstancia((short)400);//casting
        

     System.out.println("Contador1 contador Clase:"+cont1.getContadorClase());
     System.out.println("Contador1 contador instancia:"+cont1.getContadorInstancia());

     System.out.println("Contador2 contador Clase:"+cont2.getContadorClase());
     System.out.println("Contador2 contador instancia:"+cont2.getContadorInstancia());

     System.out.println("Contador3 contador Clase:"+cont3.getContadorClase());
     System.out.println("Contador3 contador instancia:"+cont3.getContadorInstancia());

     System.out.println("Contador4 contador Clase:"+cont4.getContadorClase());
     System.out.println("Contador4 contador instancia:"+cont4.getContadorInstancia());
    }
    
}
