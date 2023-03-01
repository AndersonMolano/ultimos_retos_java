package taller1.Trabajos;

import java.util.Scanner;
public class Num {
    public static void main(String[] args) throws Exception {
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Escriba dos numeros");
        int num1, num2;
        num1= Lectura.nextInt();
        num2= Lectura.nextInt();
        int suma;
        if (num1 > num2) {
            suma = num1 + num2;
        System.out.println("la suma de los dos es " + suma);
        System.out.println(" el numero " + num1 + " es mayor que " + num2);
        }else if (num2<num1){
            int resta;
            resta= num2 - num1;
             System.out.println("La resta de los numeros es " + resta);
             System.out.println(" el numero " + num2 + " es mayor que " + num1);
        } else { 
            System.out.println(" el numero " + num1 + " es igual que " + num2);
                int result;
                result = num1 * num2;
                System.out.println(" por ser igual se multiplica y da:" + result);


                }
        Lectura.close(); 
    }
}
