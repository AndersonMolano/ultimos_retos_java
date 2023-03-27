package taller1.Salud;
import java.util.Scanner;

public class inicio  {
    public static void main(String[] args) {
        
    
    persona nico=new persona();


    nico.pedirDatos();
    
    nico.mostrarDatos();
    nico.calcularImc(0);
    nico.mayorEdad();

    empleado hola= new empleado();
    
    hola.pedirDatosempleado();

    System.out.println(hola.getcalcularHonorarios());
    
}
}