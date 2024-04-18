package mx.utng.S05;

public class Primitivos {

    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1;
        float valorFloat = 1.5F; // F de flotante float
        double valorDouble = 1.5;

        System.out.println("byte:" + valorByte);
        System.out.println("short:" + valorShort);
        System.out.println("Int:" + valorInt);
        System.out.println("float:" + valorFloat);
        System.out.println("double:" + valorDouble);

        boolean valorBoolean = true;
        char valorChar = 'B';
        System.out.println("boolean:" + valorBoolean);
        System.out.println("Char:" + valorChar);

        int numInt1 = (int) valorFloat; // Convertir de Float a Int0
        System.out.println("Cast Int: " + numInt1);

        float numFloat1 = numInt1;
        char numChar = 'M';
        int numInt2 = numChar; // Al convertirlo en Int se vuelve su codigo ascci
        System.out.println(numInt2);

        String cadena1 = "56";
        int numInt3 = Integer.parseInt(cadena1);
        System.out.println(numInt3);
        numInt3 = numInt3 + 1; // numInt3++
        System.out.println(numInt3);

        char valorChar2 = (char) --numInt2;
        // * Con un for puedes hacer el abecedario */

        System.out.println(valorChar2);

    }
}
