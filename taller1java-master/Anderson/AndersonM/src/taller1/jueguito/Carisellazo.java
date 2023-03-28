package taller1.jueguito;
import java.util.Scanner;
public class Carisellazo implements Juego {
      
        Scanner lectura= new Scanner(System.in);
        private String nombre;
        private int moneda;
        private int eleccion;
        private int menor;
        private int numero;
        private int resp;

    @Override
    public void iniciar() {
       System.out.println("Ingrese su nombre");
       nombre=lectura.nextLine();
    }
    @Override
    public void jugar() {
        moneda = (int) Math.floor(Math.random()*2+1);
        System.out.println(this.nombre + "Escoja  1.Cara 2.Sello ");
        eleccion=lectura.nextInt();
    }
    @Override
    public void finalizar() {
         if (eleccion ==1 && moneda == 1) {
            System.out.println(this.nombre + " Salio Cara, escogiste cara tu ganas!!!");
         } else if (eleccion == 2 && moneda == 1 ) { 
            System.out.println(this.nombre + " Salio Sello, escogiste sello tu ganas!!!");
         }else if (eleccion == 1 && moneda ==2  ) { 
            System.out.println(this.nombre + " Salio Sello, escogiste Cara tu pierdes!!!");
    }else if (eleccion == 1 && moneda ==2  ) { 
            System.out.println(this.nombre + " Salio Sello, escogiste Cara tu pierdes!!!");
    }else if (eleccion == 2 && moneda ==1  ) { 
        System.out.println(this.nombre + " Salio Cara, escogiste Sello tu pierdes!!!");
    }
}

   @Override
   public void iniciar1() {
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
   }

   @Override
   public void jugar1() {
      if (menor == 1) {
         System.out.println(" la maquina ha escojido piedra");
         } 
         if (menor == 2) {
         System.out.println(" la maquina ha escojido papel");
         } 
         if (menor == 3) {
         System.out.println(" la maquina ha escojido tijeras ");
         } 
   }

   @Override
   public void finalizar1() {
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
   }
}



