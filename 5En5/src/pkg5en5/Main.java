//Antonio Yamir Ledesma Briones
package pkg5en5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String apellidoPaterno;
       String apellidoMaterno;
       String nombre;
       int edad;
       String mensaje = "ESTO ES ESCUELA DE CÓDIGO 'PROGRAMADOR JUNIOR' NO APTO PARA MORTALES...";
       
       Scanner entrada = new Scanner (System.in);
       
       System.out.print("Ingresa tu apellido paterno: ");
       apellidoPaterno = entrada.nextLine();
        
       System.out.print("Ingres tu apellido materno: ");
       apellidoMaterno = entrada.nextLine();
        
       System.out.print("Ingresa tu nombre: ");
       nombre = entrada.nextLine();
        
       System.out.print("Ingresa tu edad: ");
       edad = entrada.nextInt();
        
       System.out.println("\nMI NOMBRE ES " +nombre+ " " + apellidoPaterno + " "+ 
               apellidoMaterno+ " , TENGO " + edad + " AÑOS Y ESTOY EN ESCUELA DE CÓDIGO "
                       + "PROGRAMADOR JUNIOR NO APTO PARA MORTALES...");
    }
    
}
