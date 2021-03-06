/*
 *  @author David León
 */
package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJava {
    public static void main(String[] args) {
    
        Scanner n = new Scanner(System.in);
       int[] array = new int[10];
       int[] aux = new int[10];
       
       for (int i = 0; i < 10; i++) {
           array[i] = Integer.parseInt(n.nextLine());
       }
       
       boolean esPrimo = true;
       int indiceInicial = 0;
       int indiceFinal = 9;
       
       for (int i = 0; i < 10; i++) {
           esPrimo = true;
           
           for (int j = 2; j < array[i]; j++) { //comprobamos si el número del array es primo o no
               if (array[i] % j == 0) {
                   esPrimo = false;
               }
           }
           
           if (esPrimo) {
               aux[indiceInicial] = array[i];
               indiceInicial++;
           } else {
               aux[indiceFinal] = array[i];
               indiceFinal--;
           }
           
       }
        
       for (int i = 0; i < array.length; i++) {
           System.out.print(aux[i] + " ");
       }
       
    }    
}