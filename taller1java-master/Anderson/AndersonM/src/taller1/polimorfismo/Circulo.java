package taller1.polimorfismo;
import java.util.Scanner;
public class Circulo extends Figura {
    private Scanner lectura= new Scanner(System.in);
    double pi, area;
    private float radio;

    public float getRadio(){
        return radio;
    }
    public void setRadio(float radio){
        this.radio=radio;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Ingresa el radio del circulo");
        radio=lectura.nextFloat();
        pi= 3.1416;
        area= pi*(radio*radio);
        System.out.println("El area del circulo es " + area);

    }
    
    
}
