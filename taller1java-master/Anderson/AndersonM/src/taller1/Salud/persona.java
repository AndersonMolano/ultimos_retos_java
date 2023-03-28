package taller1.Salud;
import java.util.Scanner;

public class persona {
    private Scanner lectura= new Scanner(System.in);
    private String tipoDoc, nombre, apellido, sexo;
    private int documento, edad;
    private Double estatura, imc, peso;

    public String gettipoDoc(){
        return tipoDoc;
    }
    public void settipoDoc(String tipoDoc){
        this.tipoDoc=tipoDoc;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public void setapellido(String apellido){
        this.apellido=apellido;
    }
    public String getsexo(){
        return sexo;
    }
    public void setsexo(String sexo){
        this.sexo=sexo;
    }
    public int getdocumento(){
        return documento;
    }
    public void setdocumento(int documento){
        this.documento=documento;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public double getestatura(){
        return estatura;
    }
    public void setestatura(double estatura){
        this.estatura=estatura;
    }
    public double getimc(){
        return imc;
    }
    public void setimc(double imc){
        this.imc=imc;
    }
    public double getpeso(){
        return peso;
    }
    public void setpeso(double peso){
        this.peso=peso;
    }
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
    public void mostrarDatos2(){
        System.out.println("su tipo de documento es " + tipoDoc);
        System.out.println("su número de documento es " + documento);
        System.out.println("Su nombre es " + nombre + " y su apellido es " + apellido);
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