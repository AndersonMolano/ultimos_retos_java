package taller1.Trabajos;
import java.util.*;
public class presupuesto {
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner(System.in);
         int butget, spein, seguir, contador, totalg;
        seguir = 1;
        butget=100000;
        contador = 0;
        totalg=0;

        while (seguir == 1) {
            //instrucciones que deseas repetir
            System.out.println("Ingrese el valor del gasto ");
            spein=lectura.nextInt();
            System.out.println("Desea registrar otro gasto 1. si 2. no");
            seguir=lectura.nextInt();
            contador=contador+seguir;
            butget= butget-spein;
            totalg=totalg+spein;
            System.out.println("Su gasto fue de " + spein);
            System.out.println("Y su presupuesto ahora es " + butget);  
            if (contador==3){
            System.out.println("Su proceso termino");
            seguir = 3;
            
            }
            }

            System.out.println("Ya no tienes gastos que registrar");
            System.out.println("El total de tus gastos es " + totalg + " y tu presupuesto es " + butget);

            lectura.close();
    }
}

