package taller1.retos;
import java.util.*;
public class Reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int  cantidad, valor, contador, seguir, valort;
        seguir = 1;
       
        contador = 0;
        
    
 

        for (int x= 1; x<=3; x++) {
            System.out.println("Escriba el valor del producto ");
            valor=lectura.nextInt();
            System.out.println("Escriba la cantidad de productos ");
            cantidad=lectura.nextInt();
            contador=contador+seguir;
           
            valort= valor * cantidad;
            System.out.println("ud debe pagar " + valort);


        lectura.close();
    }
}
}
