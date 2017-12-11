/*
 *  @author David León
 */
package ejerciciosjava;

import java.util.Scanner;

public class ejercicios2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] array = new int[10];
        int[] aux = new int[10];
        int indice = 0;
        int aleatorio = 0;

        System.out.println("           ARRAY ORIGINAL");
        for (int i = 0; i < array.length; i++) {
            array[i] = (i);
            System.out.print(array[i] + " ");
        }

        while (indice < 10) {
            aleatorio = (int) (Math.random() * 10); //saca un índice aleatorio

            if (array[aleatorio] == -1) { //compruebo si ese índice ya ha salido         
            } else {
                aux[indice] = array[aleatorio]; //indice 5 valor 23234234242
                array[aleatorio] = -1; //indice 5 valor 0
                indice++;
            }

        }

        System.out.println("\n             ARRAY BARAJADO");
        for (int i = 0; i < array.length; i++) {
            array[i] = (i);
            System.out.print(aux[i] + " ");
        }
    }
}
