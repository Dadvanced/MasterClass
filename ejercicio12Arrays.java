/*
 *  @author David León
 */
package ejerciciosjava;

import java.util.Scanner;

public class ejercicios2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) { //se introducen 10 números por teclado
            array[i] = Integer.parseInt(s.nextLine());
        }
        
        System.out.print("índice    ");
        for (int i = 0; i < array.length; i++) { //imprimimos los números del índice
            System.out.print(i + "     ");
        }
        //system.out.println();
        System.out.print("\n Valor     ");
        for (int i = 0; i < 10; i++) { //imprimimos los valores del array
            System.out.print(array[i] + "     ");
        }
        
        boolean isCorrect = false;
        int inicial = 0;
        int indiceFinal = 0;
        
        while (!isCorrect) {
                System.out.println();
                System.out.println();
                System.out.print("Introduzca el índice INICIAL: ");
                inicial = Integer.parseInt(s.nextLine());

                System.out.println();
                System.out.println();
                System.out.print("Introduzca el índice FINAL");
                indiceFinal = Integer.parseInt(s.nextLine());
                System.out.println();
                
                
            if ((inicial < indiceFinal) && (indiceFinal <= 9) && (inicial >= 0)) {
                isCorrect = true;
            } else {
                System.out.println("Por favor introduzca los datos adecuadamente.");
            }
            
        }
        
        int[] aux = new int[10];
        
        aux[indiceFinal] = array[inicial];
        aux[0] = array[9];
        
        for (int i = 1; i <= inicial; i++) {
            aux[i] = array[i - 1];
        }        
        
        for (int i = inicial +1; i < indiceFinal; i++) {
            aux[i] = array[i];
        }
        
        for (int i = indiceFinal +1; i < 10; i++) {
            aux[i] = array[i - 1];
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.print("índice    ");
        for (int i = 0; i < array.length; i++) { //imprimimos los números del índice
            System.out.print(i + "     ");
        }
        //system.out.println();
        System.out.print("\n Valor     ");
        for (int i = 0; i < 10; i++) { //imprimimos los valores del array
            System.out.print(aux[i] + "     ");
        }
        
        
        
        
        
           
        
    }
}
