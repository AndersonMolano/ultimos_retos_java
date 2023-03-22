package taller1.Trabajos;
import java.util.Scanner;




public class Movie {

    Scanner lectura= new Scanner(System.in);

    
    
    private String nombre;
    private double duration;
    String category;
    public String director; 

    public Movie(){

    }
     public Movie(String _name,double _duration, String _category, String _director){
    this.nombre= nombre;
    this.duration=duration;
    this.category= category;
    this.director= director;
   }
    
     public void addMovie(){
     System.out.println("Ingrese el nombre de la pelicula");
     nombre=lectura.nextLine();
    
    System.out.println("Ingrese la duracion de la pelicula");
    duration= lectura.nextDouble();
    lectura.nextLine();
    
    System.out.println("Ingrese la categoria de la pelicula");
    category= lectura.nextLine();
    
    System.out.println("Ingrese el director de la pelicula");
    director=lectura.nextLine();
     }
    
    

    
public void changeMovie(String c){
 
System.out.println("Escriba a que categoria lo desea cambiar");
   
    
  System.out.println("La categoria incial fue" + category + " La categoria actual es " + c);
category=c;
    
 }
}
