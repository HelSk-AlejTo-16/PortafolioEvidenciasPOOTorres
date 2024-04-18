package mx.utng.sesion04;
//Contamos las vocales, numeros, consonantes y simbolos
public class ContadorCaracteres { 
    public boolean isVocal(char caracter){
return (caracter == 'a'||
caracter == 'a'|| //o
caracter == 'e'||
caracter == 'i' ||
caracter =='o'||
caracter == 'u');

    }/* */
    public boolean isNumero(char caracter){
        short codigoAsccii = (short) caracter;
        return (codigoAsccii>=48 &&  codigoAsccii<=57);
           
    }
    public boolean isConsonante(char caracter){
        short codigoAsccii =(short) caracter; 
        return codigoAsccii>=97 && codigoAsccii<=122 && !isVocal(caracter); //! negar una clase
    }
    public boolean isSimbolo(char caracter){
        return !(isVocal(caracter) || isConsonante(caracter)|| isNumero(caracter));
    }
    public int cuentaVocales(String palabra){
        int vocales = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isVocal(caracter)){
                vocales++;
            }
        }
            return vocales;
    }
    public int cuentaConsonantes(String palabra){
        int consonantes = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isConsonante(caracter)){
                consonantes++;
            }
        }
            return consonantes;
    }
    public int cuentaNumeros(String palabra){
        int numeros = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isNumero(caracter)){
                numeros++;
            }
        }
            return numeros;
    }
    public int cuentaSimbolos(String palabra){
        int simbolos = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isSimbolo(caracter)){
                simbolos++;
            }
        }
            return simbolos;
    }

}
