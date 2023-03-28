package taller1.polimorfissmo;
public class Cuadrado extends Figuras{
    private float lado;

    public float getLado(){
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
       
        float area=lado*lado;
        System.out.println("El area del cuadrado de lado " + this.lado + " es " + area);
    } 
    
}
