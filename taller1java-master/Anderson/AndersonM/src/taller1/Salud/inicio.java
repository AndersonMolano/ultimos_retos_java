package taller1.Salud;
import java.util.Scanner;

public class inicio  {
    public static void main(String[] args) {
        
    
    persona nico=new persona();
    nico.pedirDatos();
    nico.mostrarDatos();
    nico.calcularImc(0);
    nico.mayorEdad();
    nico.mostrarDatos2();
    
    empleado hola= new empleado();
    hola.pedirDatosempleado();
    hola.mostrarEmpleado();
    hola.getcalcularHonorarios();
}
}