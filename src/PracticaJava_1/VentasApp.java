/**
 * 
 */
package PracticaJava_1;

import java.util.Scanner;
public class VentasApp {
  
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el n�mero de ventas, es un cambio");
        int numVentas=sc.nextInt();
  
        /*Declaramos una variable para sumar las ventas,
         * si lo declaramos dentro del bucle, no podriamos
         * acceder fuera del bucle a la suma de las ventas.
         * Esto es por el �mbito.
         */
        int sumaVentas=0;
        for (int i=0;i<numVentas;i++){
            //indico el numero de venta
            System.out.println("Introduce el precio de la venta "+(i+1));
            int venta=sc.nextInt();
  
            //Acumulamos el valor de la venta
            sumaVentas=sumaVentas+venta;
        }
  
        System.out.println(sumaVentas);
    }
}