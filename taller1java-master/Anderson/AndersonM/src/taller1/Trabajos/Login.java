package taller1.Trabajos;

import java.util.Scanner;

public class Login {
     
    public static void main(String[] args) throws Exception {
        Scanner Lectura= new Scanner(System.in);
        String user;
        String password; 
        String usuarioR;
        String passwordR;  
        user= "hola";
        password= "123";
       System.out.println("escriba su usuario");
       usuarioR= Lectura.nextLine();
       System.out.println("escriba su contraseña");
       passwordR= Lectura.nextLine();
       if( user.equalsIgnoreCase(usuarioR) && password.equalsIgnoreCase(passwordR) ) {
        System.out.println("Bienvenido al sistema");

           } else if (user.equalsIgnoreCase(usuarioR) ) {
             System.out.println("Se ha olvidado de su contraseña");
          
             }else if (password.equalsIgnoreCase(passwordR) ) {
               System.out.println("Parece que su Usuario es incorrecto");
             }else {
                     System.out.println("Su usuario y contraseña son incorrectos");
      }
        Lectura.close(); 
        
    }
}


