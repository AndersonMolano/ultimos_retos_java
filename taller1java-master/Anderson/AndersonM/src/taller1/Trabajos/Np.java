package taller1.Trabajos;

import java.util.Scanner;

public class Np {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        System.out.println("escriba un numero:");
        int num;
        num= lectura.nextInt();

        if(num > 0){
            System.out.println( "El numero es positivo");
         
        }else if( num < 0)  
            System.out.println( "El numero es negativo");
        
        else{  
        System.out.println("El numero es neutro");
    } 
        

        lectura.close();
        }
    }