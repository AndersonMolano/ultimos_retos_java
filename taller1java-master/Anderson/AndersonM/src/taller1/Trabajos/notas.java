package taller1.Trabajos;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        double nota, acumNota, finalNota;
        acumNota=0;

        for (int x=1; x<=4; x ++){
            System.out.println("ingrese la nota del taller");
            nota= lectura.nextDouble();
            if (nota>5.1){
                System.out.println("LA NOTA MAXIMA ES 5.0, por favor vuelva a ingresar el dato");
                nota=lectura.nextDouble();
    
            }else if (nota<0.0){
                System.out.println("LA NOTA MINIMA ES 0.0, por favor vuelva a ingresar el dato");
                nota=lectura.nextDouble();

            }
            acumNota=acumNota+nota;
        }
        
        finalNota=acumNota/4;
        System.out.println("Tu nota final fue" + finalNota);
        if (finalNota< 2.9){
            System.out.println("Reprobaste la asignatura");

        }else if ( finalNota< 4.0){
            System.out.println("Pasate raspando la asignatura");
        }else {
            System.out.println("Aprobaste con buenos resultados");
        }
        

        lectura.close();
    }

}