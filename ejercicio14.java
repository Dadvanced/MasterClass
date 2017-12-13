/*
 *  @author David León
 */
package ejerciciosjava;

import java.util.Scanner;

public class ejercicios2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String palabra = "";
        String[] colores = new String[5]; //colores predefinidos
        String[] aux = new String[10]; //array donde se ordenará los colores
        int indiceInicial = 0;
        int indiceFinal = 9;
        boolean estaEnArray = false;
        
        colores[0] = "rojo";
        colores[1] = "azul"; 
        colores[2] = "amarillo"; 
        colores[3] = "verde";
        colores[4] = "blanco";      
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca una palabra: ");
            palabra = s.nextLine(); //llenamos el array con palabras que introduzca el usuario
           
            for (int j = 0; j < colores.length; j++) { //recorremos el array de colores
                if (palabra.equals(colores[j])) {
                    estaEnArray = true;
                }
            } //for que recorre los colores
                
                if (estaEnArray) {
                    aux[indiceInicial] = palabra;
                    indiceInicial++;
                } else {
                    aux[indiceFinal] = palabra;
                    indiceFinal--;
                }
                
            System.out.println();
            estaEnArray = false; //resetea el booleano
        }//for 25

        System.out.println("\n                     ARRAY ORDENADO");
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
        
    }
}