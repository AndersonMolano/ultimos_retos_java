package taller1.Trabajos;


import java.util.Scanner;

public class caja {
    public static void main(String[] args) throws Exception {
        Scanner Lectura= new Scanner(System.in);
        int precio, cantidad, contador, acumulador, subtotal, vueltas, billete;
        String exit;
        
        contador = 0; acumulador = 0;
        for (int x= 1; x<=5; x++) {

            System.out.println("Dijite el precio del producto");
            precio= Lectura.nextInt();

            System.out.println("Dijite la cantidad de productos");
            cantidad= Lectura.nextInt();

            contador = contador + 1;

            subtotal= precio * cantidad;
            acumulador = acumulador + subtotal;
        }
        System.out.println("El valor a pagar es " + acumulador);

        System.out.println("Con cuanto desea cancelar?");
       
        billete= Lectura.nextInt();
        vueltas = billete - acumulador;

        System.out.println("sus vueltas son" + vueltas);

        
       System.out.println(" de casualidad cuenta con telwefonia movil exito");
       Lectura.nextLine();
       exit= Lectura.nextLine();

       if (exit.equalsIgnoreCase("si")) {
       


       }



       Lectura.close();  
    }
}

