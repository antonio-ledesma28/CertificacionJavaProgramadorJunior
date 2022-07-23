
import java.util.Scanner;

//Antonio Yamir Ledesma Briones
public class Main {

    public static void main(String[] args) {
        System.out.println("Impresión serie fibonacci");
        int limite;
        int actual = 0;
        int siguiente = 1;
        int suma;

        //Se pide que ingrese por teclado el número de iteraciones
        System.out.print("¿Cuántos números de la serie fibonacci deseas conocer?: ");
        Scanner input = new Scanner(System.in);
        limite = input.nextInt();

        //Se realiza el ciclo
        for (int i = 1; i <= limite; i++) {
            System.out.println(actual);
            suma = actual + siguiente;
            actual = siguiente;
            siguiente = suma;
        }
    }
}
