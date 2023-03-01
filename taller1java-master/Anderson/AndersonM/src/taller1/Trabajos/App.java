package taller1.Trabajos;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Ingrese un número");
        int numberOne;
        numberOne= lectura.nextInt();
        System.out.println("El numero ingresado es: " +  numberOne);



        System.out.println("Ingrese un segundo número");
        int numberTwo;
        numberTwo= lectura.nextInt();
        int plus;
        plus = numberOne + numberTwo;
         System.out.println("El numero ingresado es: " +  numberOne + " y " + numberTwo+ " y la suma de los dos son " + plus);
        lectura.nextLine(); // Limpieza de buffer 
        System.out.println("Ingrese su nombre");
        String name;
        name = lectura.nextLine();
        

        System.out.println("Su nombre es " + name);

        System.out.println("Hola " + name + " ingresaste los numeros " + numberOne + " y " + numberTwo + " y el resultado de la suma es " + plus);

        lectura.close(); 
    }
}
