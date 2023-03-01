package taller1.retos;
import java.util.Scanner;
public class Reto4 {

      public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
       System.out.println("Para jugar piedra, papel o tijera... identifiquelo con su numero");
       System.out.println("piedra es 1");
       System.out.println("papel es 2");
       System.out.println("tijera es 3");
       int resp;
       resp= lectura.nextInt();
        int menor = 3, numero;
        for( int i =2; i <5; i++) {
            numero = (int) (Math.random() * (3) +1);
           //System.out.println(numero + ",");
            menor = numero;
        }
          if (menor == 1) {
          System.out.println(" la maquina ha escojido piedra");
          } 
          if (menor == 2) {
          System.out.println(" la maquina ha escojido papel");
          } 
          if (menor == 3) {
          System.out.println(" la maquina ha escojido tijeras ");
          } 
          if (menor == resp) {
          System.out.println("Es un empate");
         }
          if (resp == 1 && menor == 3){
          System.out.println("Ud ha ganado ");
         }
          if (resp == 2 && menor == 3){
          System.out.println("Ud pierde");
          }
          if (resp == 2 && menor == 1){
          System.out.println("Ud pierde ");
          }
          if (resp == 1 && menor == 2){
          System.out.println("Ud pierde");
          }
          if (resp == 3 && menor == 2){
          System.out.println("Ud ha ganado ");
          }
          if (resp == 3 && menor == 1){
          System.out.println("Ud pierde");
        }
     lectura.close();
    }
}

