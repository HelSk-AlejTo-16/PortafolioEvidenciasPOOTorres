package mx.utng.s8;

public class AutomovilFactory {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", "Shelby",1965 , 25000);
        Automovil auto2 = new Automovil("Bugatti", "Veyron Ble Centeaire", 2009,3754);
        Automovil auto3 = new Automovil("Toyota", "Corolla",1966 , 
        78000);

        System.out.println("Auto 1: hash:"+auto1.hashCode());
        System.out.println("Auto 2: hash:"+auto2.hashCode());
        System.out.println("Auto 3: hash:"+auto3.hashCode());
        //El objeto este es el mismo que el primero. De tal manera que pues mejor pon otra vez auto 1 xd
        Automovil auto4 = auto1;
        System.out.println("Auto 4:hash"+auto4.hashCode());
        if (auto4.equals(auto1)) {//esta madre compara si es igual o no (es positivo si es igual)
            System.out.println("Es igual ES IGUAAAAL");
            
        }
    }
}