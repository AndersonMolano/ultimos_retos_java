package taller1.retos;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) throws Exception {
        Scanner Lectura = new Scanner(System.in);
        
       System.out.println("Oprima 3 para lanzar los dados ");
       Lectura.nextInt();
       int suma;
       int numero1 = (int)(Math.random()*6+1);
       System.out.println("Su primer dado fue " + numero1);
       int numero2 = (int)(Math.random()*6+1);

       System.out.println("Su segundo dado fue " + numero2);
       suma = numero1 + numero2;
       if (numero1 == 1 && numero2 == 1) {
         System.out.println("Ud ha ganado");
       } else if (suma == 3) {
         System.out.println("ud ha ganado");
          } else  if (suma == 11) {
          System.out.println("ud ha ganado");
            } else if (suma == 12) {
              System.out.println("ud ha ganado");
                } else if (suma == 7) {
                  System.out.println("ud ha ganado");
                     } else {
                      System.out.println("perdio xd");
                       }
      
        Lectura.close();
       
    }
}
