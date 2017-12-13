/*
 *  @author David León
 */
package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJava {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        String[] piezas = new String[5];
        piezas[0] = "Peon";
        piezas[1] = "Caballo";
        piezas[2] = "Alfil";
        piezas[3] = "Torre";
        piezas[4] = "Dama";
        
        int[] valor = new int[5];
        valor[0] = 1; //peon
        valor[1] = 2; //caballo
        valor[2] = 3; //alfil
        valor[3] = 5; //torre
        valor[4] = 9; //dama
        
        int capturas = (int)(Math.random()*16);
        int piezaAleatoria = 0;
        int suma = 0;
        int contadorPeon = 0;
        int contadorCaballo = 0;
        int contadorAlfil = 0;
        int contadorTorre = 0;
        int contadorDama = 0;
        boolean numeroRepetido = false;
        
        for (int i = 1; i <= capturas; i++) {
            
            numeroRepetido = false;
            
            while (!numeroRepetido) { //se repite si la pieza sacada ya ha llegado a su limite de capturas
                piezaAleatoria = (int)(Math.random()*5); //sacamos una pieza (peón, caballo...)
                
               //comprobamos si la pieza sacada NO ha llegado a su límite de capturas 
                if ((piezaAleatoria == 0) && (contadorPeon < 8)) {
                    numeroRepetido = true; //si NO han salido 8 peones, salimos del WHILE
                } else if ((piezaAleatoria == 1) && (contadorCaballo < 2)) {
                    numeroRepetido = true;
                } else if ((piezaAleatoria == 2) && (contadorAlfil < 2)) {
                    numeroRepetido = true;
                } else if ((piezaAleatoria == 3) && (contadorPeon < 2)) {
                    numeroRepetido = true;
                } else if ((piezaAleatoria == 4) && (contadorPeon < 1)) {
                    numeroRepetido = true;
                }
            }            
            
            switch (piezaAleatoria) {
                case 0:
                    System.out.println(piezas[0] + "  " + valor[0] + " peón");
                    suma+=valor[0];
                    contadorPeon++;
                    break;
                    
                case 1:
                    System.out.println(piezas[1] + "  " + valor[1] + " peones");
                    suma+=valor[1];
                    contadorCaballo++;
                    break;
                    
                case 2: 
                    System.out.println(piezas[2] + "  " + valor[2] + " peones");
                    suma+=valor[2];
                    contadorAlfil++;
                    break;
                    
                case 3:
                    System.out.println(piezas[3] + "  " + valor[3] + " peones");
                    suma+=valor[3];
                    contadorTorre++;
                    break;
                    
                case 4:
                    System.out.println(piezas[4] + "  " + valor[4] + " peones");
                    suma+=valor[4];
                    contadorDama++;
                    break;
            }
            
        }
        
        System.out.println("\nPuntos totales: " + suma + " peones");
        
    }
}
