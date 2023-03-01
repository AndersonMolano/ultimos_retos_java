package taller1.retos;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

     System.out.println("Escriba cuanto pesa el bebe");
     int peso;
     peso= lectura.nextInt();
 
     System.out.println("Escriba cuantos meses tiene el bebe");
     int meses;
     meses= lectura.nextInt();

     int dosis, mesesbb, dosisml, 
         pesobb= peso + 10;
         mesesbb= meses * 10;
         dosis= pesobb / mesesbb;
         dosisml= dosis * 8; 
         System.out.println("la dosis de la vacuna que se tiene que aplicar es " + dosisml);

        lectura.close();
    }
}