package mx.utng.s06;

import java.util.Scanner;

public class Ciclos {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Que tabla deseas?");
    int n = scanner.nextInt();
    scanner.close();
    
    for (int i = 1; i <= 10; i++) {
        //System.out.println(num);
        /**System.out.println("5x"+num +"="+5*num);**/
        System.out.printf("%dx%d=%d\n",n,i, n*i);
        
    }
    
    short[] valores ={1,2,3,4,5,6,7,9};
    for(int i = 0; i<valores.length; i++){
        System.out.println(valores[i]);
    }
       for(short s : valores){

        System.out.println(s+",");
       } 
       System.out.println("");
       for(short s : valores){

        System.out.printf("%dx%d=i\n",n,s, n*s);
    }
    //While
short i=0;
while(++i<=10){
    System.out.println(i);

}
//Do-While
i = 1;
do{
System.out.println(i);
}while(i++ <10);


    }

}
