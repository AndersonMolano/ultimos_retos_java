package taller1.Salud;
import java.util.Scanner;

import taller1.Trabajos.Edad;

public class empleado extends persona {
private String Cargo, departamento;
private int valorhora, horastrabajadas, total;
private double descuento, totalt;
public empleado() {
}
Scanner Lectura= new Scanner (System.in);
public empleado(String Cargo,String departamento,int valorhora, int horastrabajadas ) {
    this.Cargo=Cargo;
    this.departamento=departamento;
    this.horastrabajadas=horastrabajadas;
    this.valorhora=valorhora;
}
public void setCargo(String Cargo){
     this.Cargo=Cargo;
}
public void setDepartamento(String departamento){
    this.departamento=departamento;
}
public void sethorasTrabajadas(int horastrabajadas){
    this.horastrabajadas=horastrabajadas;
}
public void setValorhora(int valorhora){
    this.valorhora=valorhora;
} 
public void setdescuento(double descuento){
    this.descuento=descuento;
} 
public void settotalt(double totalt){
    this.totalt=totalt;
}  
public void settotal(int total){
    this.total=total;
}
public void getcalcularHonorarios() {
       total= valorhora*horastrabajadas;
       descuento= (horastrabajadas * 0.966) / 100 ;
       totalt= total-descuento; 
       System.out.println("Su total a pagar es " + totalt);
}

public String getCargo(){
    return Cargo;
}
public String getDepartamento(){
  return departamento;
}
public int gethorasTrabajadas(){
   return horastrabajadas;
}
public int getValorhora(){
   return valorhora;
} 
public double getdescuento(){
   return descuento;
} 
public double gettotalt(){
   return totalt;
} 
public int gettotal(){
    return total;
 } 
 public void pedirDatosempleado(){
    System.out.println("Por favor ingrese su Cargo");
   Cargo=Lectura.nextLine();
   System.out.println("Por favor ingrese su Departamento");
   departamento=Lectura.nextLine();
   System.out.println("Por favor ingrese sus horas trabajadas");
   horastrabajadas=Lectura.nextInt();
   System.out.println("Escriba el valor de la hora");
   valorhora=Lectura.nextInt();

   }
   public void mostrarEmpleado(){

   System.out.println("Su cargo es " + Cargo);
   System.out.println("Las horas trabajadas son " + horastrabajadas);
   System.out.println("El valor por hora es " + valorhora);
   }
}


    
