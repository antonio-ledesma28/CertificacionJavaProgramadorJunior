//Antonio Yamir Ledesma Briones
package holateclado;

import java.util.Scanner;

public class HolaTeclado {

    public static void main(String[] args) {
        String nombre;
        int edad;        
        Scanner teclado = new Scanner (System.in);
        
        //Ingresa el nombre del usuario
        System.out.print("Dime tu nombre: ");
        nombre = teclado.nextLine();
        
        //Se ingresa la edad del usuario
        System.out.print("Dime tu edad: ");
        edad = teclado.nextInt();
        
        //Se imprimer el resultado
        System.out.println("\nHola, " + nombre + ", tienes " + edad + " años.");
    }
    
}
