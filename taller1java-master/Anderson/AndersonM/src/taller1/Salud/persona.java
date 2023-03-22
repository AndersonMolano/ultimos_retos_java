package taller1.Salud;
import java.util.Scanner;

public class persona {
    private Scanner lectura= new Scanner(System.in);

    public String tipoDoc, nombre, apellido, sexo;
    public int documento, edad;
    public Double estatura, imc, peso;

  

    public void pedirDatos(){
        System.out.println("Por favor ingrese su tipo de documento");
        tipoDoc= lectura.nextLine();
        System.out.println("Por favor ingrese su documento");
        documento= lectura.nextInt();
        lectura.nextLine();
        System.out.println("Por favor ingrese su nombre");
        nombre= lectura.nextLine();
        System.out.println("Por favor ingrese su apellido");
        apellido= lectura.nextLine();
        System.out.println("Por favor ingrese su peso");
        peso= lectura.nextDouble();
        System.out.println("Por favor ingrese su estatura");
        estatura= lectura.nextDouble();
        System.out.println("Por favor ingrese su edad");
        edad= lectura.nextInt();
        lectura.nextLine();
        System.out.println("Por favor ingrese su sexo");
        sexo= lectura.nextLine();


    }

    public void mostrarDatos(){
        System.out.println(" su tipo de documento es :" + tipoDoc);        
        System.out.println("Su documento es " + documento);    
        System.out.println("Su nombre es " + nombre );
        System.out.println("Su apellido es " + apellido);        
        System.out.println("Su peso es " + peso);        
        System.out.println("Su estatura es " + estatura);
        System.out.println("Su edad es  " + edad );       
        System.out.println("Su sexo es " + sexo);
    }
    
    public void mayorEdad(){
        if(edad<=18){
            System.out.println("usted es menor  de edad");

        }else {
            System.out.println("usted es menor de edad");
        }

    }
    public double calcularImc (double imc) {
        imc= peso  / (estatura * 2);
        if (imc < 20 ) {
            System.out.println("PESOBAJO ");
            } else if (imc > 25) {
                System.out.println(" SOBREPESO ");
            } else {
                System.out.println("PESOIDEAL");
            }
        return imc;
}
}