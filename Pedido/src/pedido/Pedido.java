//Antonio Yamir Ledesma Briones
package pedido;

class Pedido {
    public static void main(String[] args) {
        //Se declaran e inicializan las variables
        double costoArticulo = 30.99;
        boolean listoEnviar = false;
        
        //Se lanza el mensaje de el valor del articulo es alto solo si el costo es mayor a 24
        if(costoArticulo > 24){
            System.out.println("El valor del articulo es alto");
        }
        
        //Se imprime enviado si listoEnviar es igual a true
        if(listoEnviar == true){
            System.out.println("Enviado");
        }
        //Se imprime Pedido no listo si el valor de listoEnviar es igual a false
        else{
            System.out.println("Pedido no listo");
        }
    }
}

