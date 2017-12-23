package clases;
/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones WEB (DAW)
 * 12 de diciembre de 2017
 * Ejercicio 3
 * 
 *  Si hay algo típico y entrañable en la época navideña es el nacimiento con La Virgen María, El Niño
      Jesús y San José. Realiza un programa que pinte por pantalla un nacimiento teniendo en cuenta las
      siguientes premisas:
        a) El portal es siempre el mismo, no varía en anchura ni en altura ni en los caracteres que se
      pintan (guiones y asteriscos). Debe salir exactamente igual a como se indica en los ejemplos.
        b) La Virgen María se representa con una V, San José con una S y el Niño Jesús con una o
      minúscula.
        c) Los tres personajes deben aparecer colocados de forma aleatoria en la misma línea, apoyados
      en el suelo (no pueden levitar), en alguna de las 5 posiciones posibles.
        d) Cada uno de los personajes debe aparecer en una posición distinta (no se pueden superponer).
        e) El Niño Jesús siempre debe aparecer en medio de La Virgen y de San José. Sin embargo, tanto
      La Virgen como San José pueden aparecer a la derecha o a la izquierda del Niño Jesús.
      
      Ejemplo: 
      
          * * * * * * *
          *           *
          * V    o S  *
       -------------------
 *  
 * @author David Leń
 */
 
import java.util.Scanner;
public class Belen {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int nino = 0;
    int contador = 1; //l usaremos para contar el número de espacios que estamos insertando
    int espacios = 5; //anchura del belen - 2
    String fig1 = ""; //figura 1
    String fig2 = ""; //figura 2
    
    int aleatorio = (int)(Math.random()*2); // quien dibujamos primero de forma aleatoria
    
    switch(aleatorio) {
      case 0:
        fig1 = "S"; //José
        fig2 = "V"; //María
        break;
        
      case 1:
        fig1 = "V";
        fig2 = "S";
        break;
    }
    System.out.println(fig1);
    System.out.println(fig2);
    System.out.println(aleatorio);
    int posFig1 = 0; //posición de la figura 1 en el belén
    int posFig2 = 0; //posición de la figura 2 en el belén
    
    //una vez sabemos a quién dibujamos primero, le damos valores aleatorios a su posición
    posFig1 = (int)(Math.random()*(5-2) +1); //posición aleatoria de la figura 1
    nino = (int)(Math.random()*(espacios - posFig1 - 1) + (posFig1 + 1)); //posición aleatoria del niño
    posFig2 = (int)(Math.random()*(espacios -  nino) + (nino + 1));  //posición aleatoria de la fig2
    
    //imprimimos la parte superior del belén
    System.out.println("   *******");
    System.out.println("   *     *");
    System.out.print("   *");
    
      for (int i = 1; i <= espacios; i++){
        //con CONTADOR controlamos la posición que estamos dibujando
        if (contador == posFig1){
          System.out.print(fig1);
          
        } else if (contador == posFig2){
          System.out.print(fig2);
     
        } else if (contador == nino){
          System.out.print("o");
        } else {
          System.out.print(" ");
        }
        
        contador++;
      }
      
      System.out.println("*");
    
      //base del belén
    System.out.println("--------------");
    
    System.out.println("\n" + posFig1 + " " + nino + " " + posFig2);
    
  }
}
