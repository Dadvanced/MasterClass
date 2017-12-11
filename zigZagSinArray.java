/*
 *  @author David León
 */
package ejerciciosjava;

import java.util.Scanner;

public class ejercicios2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero = (int) (Math.random() * 10001);
        int digito = 0; //guardaremos el "numero" volteado
        int contadorDigitos = 0; //para saber cuántos dígitos tiene el número
        int contador = 0; //lo usaremos en el bucle para saber cuándo parar de dibujar
        int espacios = 20; //para que empiece a pintar por el medio

        System.out.println(numero); //imprimimos el número que ha salido como aleatorio
        System.out.println();
        System.out.println();

        while (numero >= 1) { //volteamos el número
            digito = (digito * 10) + (numero % 10);
            contadorDigitos++; //contamos cuántos dígitos tiene
            numero /= 10;
        }
        numero *= 10; //hay que hacerlo para añadir la última cifra si o si

        //empezamos el dibujo
        while (contador <= contadorDigitos) {

            for (int j = 1; j <= digito % 10; j++) {
                for (int i = 1; i <= espacios; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                espacios++;
            }

            contador++; //funciona como ALTURA en el ejercicio de las pirámides
            espacios -= 2; //a partir de ahora pintamos hacia la izquierda
            digito /= 10; //ahora vamos a pintar el siguiente número

            for (int j = 1; j <= digito % 10; j++) {
                for (int i = 1; i <= espacios; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                espacios--;
            }
            espacios += 2; //a partir de ahora se pinta hacia la derecha
            digito /= 10;
            contador++;

        }//while

    }
}
