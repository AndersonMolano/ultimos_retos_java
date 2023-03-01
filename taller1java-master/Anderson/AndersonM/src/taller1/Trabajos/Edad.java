package taller1.Trabajos;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) throws Exception {
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Escriba su edad ");
        int age;
        age= Lectura.nextInt();
        if (age < 18) { 
            System.out.println("pa la casa bobo ");
        }else{ 
            System.out.println("Bienvenido pa ");
        }

        Lectura.close(); 
    }
}

