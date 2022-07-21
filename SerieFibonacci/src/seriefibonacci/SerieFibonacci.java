//Antonio Yamir Ledesma Briones
package seriefibonacci;

import java.util.Scanner;
 
public class SerieFibonacci {
 
    public static void main(String[] args) {
       //Se crea un objeto Scanner
        Scanner teclado = new Scanner(System.in);
       
       //Se inicializan variables
        int a = 0, b = 1, c, n;
       
       //Se pide y se ingresa la cantidad de iteraciones deseadas
        System.out.print("Por favor ingrese cantidad de elmentos para la serie: ");
        n = teclado.nextInt();
       
       //Se va sumando el numero actual con el siguiente mientras se va aumentando hasta llegar a las iteraciones elegidas y se imprime
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

}
