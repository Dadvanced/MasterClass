package clases;

/**
 * Programación Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones WEB (DAW) Ejercicio 4 Los
 * Reyes Magos de Oriente se están entrenando para estar en forma cuando tengan que repartir los
 * regalos a los niños. Para ello compiten con frecuencia haciendo carreras de camellos entre ellos.
 * Realiza un simulador de carreras de camellos que cumpla las siguientes condiciones:
 *
 * a) La pista de carreras tiene 8 posiciones (7 guiones y una bandera) b) La carrera se realizará
 * por pasos, en cada paso el programa debe pintar el estado de la carrera. 
 * c) La línea de meta se indica con una banderita (una P mayúscula), que está exactamente en la posición 
 * número 8 de la pista de carreras. 
 * d) En el paso número 1, todos los competidores están en la posición número 1.
 * e) En cada paso, uno de los competidores (elegido de forma aleatoria) avanza un paso. 
 * f) Gana la carrera el Rey Mago que consigue llegar a la línea de meta (donde está la bandera). 
 * g) Los caracteres utilizados y el formato debe ser como el que se muestra en el ejemplo.
 *
 * Ejemplo: 
 * Paso 1     -------P 
 *  Melchor:M 
 *   Gaspar:G 
 * Baltasar:B
 *
 * @author David Leń
 */

public class CarreraCamellos {
  public static void main(String[] args) {
    String eM = ""; //espacios Melchor
    String eG = ""; //espacios Gaspar
    String eB = ""; //espacios Baltasar

    //contadores para comprobar quien y cuando llega a la meta
    int contM = 1; //contador Melchor
    int contG = 1; //contador Gaspar
    int contB = 1; //contador Baltasar

    int paso = 1; //estado de la carreera
    String ganador = ""; //guardaremos el ganador de la carrera
    
    //fase inicial de la carrera
    System.out.println("Paso: " + paso + "  -------P");
    System.out.println(" Melchor:" + eM + "M");
    System.out.println("  Gaspar:" + eG + "G");
    System.out.println("Baltasar:" + eB + "B");
    System.out.println();
    paso++;
    
    //mientras ninguno de los 3 reyes NO lleguen a la meta, se repite el bucle
    while ((contM < 8) && (contG < 8) && (contB < 8)) {

      int a = (int) (Math.random() * 3); //número aleatorio entre 0 y 2 para los reyes magos

      switch (a) {
        case 0: //Melchor
          eM += " "; //aumentamos en 1 sus espacios
          contM++; //incrementamos el contador
          break;

        case 1: //Gaspar
          eG += " ";
          contG++;
          break;

        case 2: //Baltasar
          eB += " ";
          contB++;
          break;
      } //switch
      
      //pintamos la carrera
      System.out.println("Paso: " + paso + "  -------P");
      System.out.println(" Melchor:" + eM + "M");
      System.out.println("  Gaspar:" + eG + "G");
      System.out.println("Baltasar:" + eB + "B");
      System.out.println();
      paso++;
      
      //comprobamos quien ha ganado y lo guardamos en una variable
      if (contM == 8) {
        ganador = "Melchor";
        
      } else if (contG == 8) {
        ganador = "Gaspar";
        
      } else if (contB == 8) {
        ganador = "Baltasar";
      }
      
    }//while

    System.out.println("\n¡Ha ganado "+ ganador + "!");
    
  }
}
