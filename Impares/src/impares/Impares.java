//Antonio Yamir Ledesma Briones
package impares;

import java.util.Scanner;
 
public class Impares {
 
    public static void main(String[] args) {
        //Creamos un objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //Inicializamos las variables
        float nImpares;
        float aux = 1;
        
        //Pedimos por teclado el numero de impares que queremos conocer
        System.out.print("Ingresa el numero de impares que deseas conocer: ");
        nImpares = entrada.nextFloat();
        
        //Iteraciones hasta que sean la cantidad de impares que el usuario digito
        for(float i = 1; aux <= nImpares ; i++){
            //Si la division de i entre 2 tiene como residuo 1 se imprime el valor de i
            if((i%2 == 1)){
                System.out.println(i);
                aux++;
            }
        }
    }
}

