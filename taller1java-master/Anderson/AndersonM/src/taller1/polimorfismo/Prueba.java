package taller1.polimorfismo;

public class Prueba {
    public static void main(String[] args) {
        
         Cuadrado c1 = new Cuadrado();
        
         c1.setLado(5);
         c1.calcularArea();

         Triangulo c2 = new Triangulo();

         c2.calcularArea();

         Rectangulo c3 = new Rectangulo();

         c3.calcularArea();

         Circulo c4 = new Circulo();

         c4.calcularArea();
           
         Carisellazo l1 = new Carisellazo();
         l1.iniciar();
         l1.jugar();
         l1.finalizar();
         


    }
}
