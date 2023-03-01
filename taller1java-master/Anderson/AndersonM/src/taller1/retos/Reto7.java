package taller1.retos;
import java.util.*;
public class Reto7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); 
        System.out.println("Ingresa es valor de tu compra");
        int valorC, descuento, descuentoA, descuentoB;
        valorC=lectura.nextInt();
        int suerte = (int)(Math.random()*4+1);
        if (valorC<50000){
            System.out.println("Su compra es menor que 50000, no tiene descuento");
        } else if (suerte == 1) {
            System.out.println("Has sacado la bolita roja!!! tienes el 10% de descuento");
            descuento= (valorC * 100) / 1000;
            System.out.println("Por lo tanto tu valor a pagar es " + descuento);
        }  else if (suerte == 2) {
            System.out.println("Has sacado la bolita azul!!! tienes el 30% de descuento");
            descuentoA= (valorC * 30) / 100;
            System.out.println("Por lo tanto tu valor a pagar es " + descuentoA);
        }   else if (suerte == 3) {
            System.out.println("Has sacado la bolita amarilla!!! tienes el 50% de descuento");
            descuentoB= valorC / 2;
            System.out.println("Por lo tanto tu valor a pagar es " + descuentoB);
        }   else if (suerte == 4) {
            System.out.println("Has sacado la bolita Blanca!!! tienes el 100% de descuento");
        }

   
        
  






       lectura.close();
    }
}
