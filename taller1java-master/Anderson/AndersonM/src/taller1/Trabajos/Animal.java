package taller1.Trabajos;
import java.util.Scanner;
public class Animal {
    
       
        Scanner lectura= new Scanner(System.in);



    String nombre;
    int edad;

     public Animal(){

     }


    public Animal(String _nombre, int _edad) {

        edad =_edad;
        nombre =_nombre;
        
    }

    public void  registrarAnimal(){
        //Cuerpo del metodo

        System.out.println("Ingrese el nombre del animal");
        nombre=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        edad= lectura.nextInt();

    }

    public void mostarAnimal(){
        //Cuerpo del metodo
        System.out.println("El nombre del animal es " + nombre + ", Y su edad es " + edad);


    }


       }
