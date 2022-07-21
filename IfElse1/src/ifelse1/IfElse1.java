//Antonio Yamir Ledesma Briones
package ifelse1;
import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args){
        //Declaracion de variables iniciales
        String nombre;
        int calificacion1, calificacion2, calificacion3,calificacion;
        //Se crea un objeto de la clase Scanner para ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        //Se pide y se ingresa el nombre del usuario
        System.out.print("Ingresa tu nombre completo: ");
        nombre = entrada.nextLine();
        
        //Se pide y se ingresa la primer calificacion
        System.out.print("Ingresa tu primer calificacion: ");
        calificacion1 = entrada.nextInt();
        
        //Se pide y se ingresa la segunda calificacion
        System.out.print("Ingresa tu segunda calificacion: ");
        calificacion2 = entrada.nextInt();
        
        //Se pide y se ingresa la tercer calificacion
        System.out.print("Ingresa tu tercera calificacion: ");
        calificacion3 = entrada.nextInt();
        
        //Se saca el promedio de las 3 calificaciones
        calificacion = ((calificacion1 + calificacion2 + calificacion3)/3);
        
        //Condicional if se lanza mensaje de aprobado si calificacion es > a 7
        if(calificacion > 7){
            System.out.println(nombre + " tu calificacion es: " + calificacion + ". APROBADO");
        }
        //Condicional else se lanza mensaje de aprobado si calificacion es <= a 7
        else{
            System.out.println(nombre + " tu calificacion es: " + calificacion + ". REPROBADO");
        }
    }
}

