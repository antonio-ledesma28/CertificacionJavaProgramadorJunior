// Antonio Yamir Ledesma Briones

package declaracionoperadores;
//Se crea la clase DeclaracionOperadores

class DeclaracionOperaciones {
//Se crea la clase principal
    public static void main(String[] args) {
        //incializa la variable a con un tipo de dato int y un valor de 10
        int a = 10;
        //Inicializa la variable b con un tipo de dato int y valor de 5
        int b = 5;
        //Inicializa la variable suma es la suma de la variable a + b y su tipo de dato es int
        int suma = a + b;
        //Inicializa la variable resta es la resta de la variable a - b y su tipo de dato es int
        int resta = a - b;
        /*Inicializa la variable mult es la multiplicacion de la variable a * b y su tipo de 
dato es int*/
        int mult = a * b;
        //Inicializa la variable div es la div de la variable a / b y su tipo de dato es float
        float div = a / b;
        
        /*Se imprime en consola los resultados de cada operacion especificando cuales son los numeros y
        la operacion que se realizo*/
        System.out.println("La suma de "+ a + " mas " + b + " es: " + suma);
        System.out.println("La resta de "+ a + " menos " + b + " es: " + resta);
        System.out.println("La multiplicacion de "+ a + " por " + b + " es: " + mult);
        System.out.println("La division de "+ a + " entre " + b + " es: " + div);

    }
}

