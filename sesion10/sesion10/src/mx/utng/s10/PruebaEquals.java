package mx.utng.s10;

public class PruebaEquals {
    public static void main(String[] args) {
        Llanta llanta1 = new Llanta(205,16,35);
        Llanta llanta2 = new Llanta(205,16,35);
        Llanta llanta3 = new Llanta(205,16,35);
        Llanta llanta4 = new Llanta(205,16,35);

        Combustible combustible1 = new Combustible((short)40,(short)0);
        
        Automovil automovil1 = new Automovil("Ford", "Fiesta", 2015, 10000);
        automovil1.setCombustible(combustible1);
        automovil1.colocaLlanta(llanta1,llanta2,llanta3,llanta4);
        automovil1.llenarTanque();
    

        Llanta llanta5 = new Llanta(205,16,35);
        Llanta llanta6 = new Llanta(205,16,35);
        Llanta llanta7 = new Llanta(205,16,35);
        Llanta llanta8 = new Llanta(205,16,35);

        Combustible combustible2 = new Combustible((short)40, (short)0);

    Automovil automovil2 = new Automovil("Ford", "Fiesta",2015, 10000);
    automovil2.setCombustible(combustible2);
    automovil2.colocaLlanta(llanta8,llanta5,llanta6,llanta7);
    automovil2.llenarTanque();

    System.out.println(automovil1.equals(automovil2));





    }
}
