package taller1.Trabajos;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) throws Exception {
    Scanner Lectura= new Scanner(System.in);
    System.out.println("dijite dos números");
    double num1 , num2;
    num1= Lectura.nextDouble();
    num2= Lectura.nextDouble();
    double suma , resta , mul;
   System.out.println("1. suma 2.resta  3.multiplicacion 4. division 5. potenciacion 6. radicacion");
   System.out.println("De este menu, elija un numero");
   int operacion;
   operacion= Lectura.nextInt();
   switch (operacion){
    
    case 1:
     suma = num1 + num2;
     System.out.println(" la suma es: " + suma);  
     break;
     
     case 2: 
     resta = num1 - num2;
    System.out.println("la resta es " + resta);
     break;
     
     case 3:
     mul = num1 * num2;
     System.out.println(" la multiplicacion es: " + mul); 
     break;
    
     case 4: 
     double div;
     div = num1 / num2;
    System.out.println("la division  es " + div);
     break;

     case 5:
     double poten;
     poten= Math.pow (num1, num2);  
     System.out.println(" la potenciacion es: " + poten);
     break;
     
     case 6:
     double raiz, raiz2;
     raiz= Math.sqrt (num1);
     raiz2= Math.sqrt (num2);
     System.out.println(" la radicacion del numero uno es= " + raiz + "la radiocacion del numero dos es= " + raiz2); 
     break;
   }
     Lectura.close();
    }
}