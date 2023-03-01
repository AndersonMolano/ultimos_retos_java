package taller1.Trabajos;
import java.util.*;

public class acum {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

  String dato; 
  int contadorm ,contadorh ;

  contadorh = 0; contadorm = 0;
  for (int x= 1; x<=10; x++) {
    System.out.println("Escriba si ud es hombre o mujer");
    dato=lectura.nextLine();
     if (dato.equalsIgnoreCase("hombre")){
       contadorh = contadorh + 1;
     } else {
         contadorm = contadorm + 1;
    }
}
    System.out.println("El total de hombres es " + contadorh + " el total de mujeres " + contadorm);

lectura.close();
  
 }
}
