package taller1.retos;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los grados F°");
        int numF;
        numF=lectura.nextInt();
        System.out.println("Los grados °F ingresados son " + numF);

        double centigrados;
        centigrados= (numF-32) / 1.8;   
        System.out.println("Convirtiendo los grados °F a °C quedaria siendo " + centigrados + "°C");

        
        lectura.close();
    }
}
