//Antonio Yamir Ledesma Briones
package buenosdias;

import java.util.Scanner;

public class BuenosDias {

    public static void main(String[] args) {
        /*Programa Java que lea un nombre y muestre por pantalla "Bunos días 
        nombre_introducido, estás en escuela de código en pilares lomas de zaragoza""*/
        
        //Se crea un objeto de la clase Scanner
        Scanner sc = new Scanner (System.in);
        
        //Se ingresa el valor de 'nombre_intorducido' por teclado
        System.out.print("Ingresa tu nombre: ");
        String nombre_introducido = sc.nextLine();
        
        //Se imprime resultado
        System.out.println("\nBuenos días " + nombre_introducido + 
                ", estás en escuela de código en Pilares Lomas De Zaragoza.");
    }
    
}
