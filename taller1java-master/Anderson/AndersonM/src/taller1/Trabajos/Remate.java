package taller1.Trabajos;

import java.util.Scanner;

public class Remate {

    public static void main(String[] args) throws Exception {
        Scanner Remate = new Scanner(System.in);
        System.out.println("Dijite la cantidad de productos ");
        int cantidadp;
       cantidadp= Remate.nextInt();
       int total;
       total= cantidadp*10000;
       System.out.println("El valor de la compra es " + total);
       System.out.println("Ingrese el valor a pagar ");
       int valorp;
       valorp= Remate.nextInt();
       int cambio;
       cambio= valorp - total;
       System.out.println("su cambio es" + cambio);
       if (cambio < valorp){
        
       }
       







       Remate.close(); 
    }

}
