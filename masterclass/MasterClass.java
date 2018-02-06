package masterclass;

/**
 *
 * @author David León
 */

import java.util.Scanner;

public class MasterClass {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);        
        
        Gato misifu = new Gato(); 
        
        String hola = "soy el nombre del gato";
        
        misifu.setNombre(hola);
        
        Gato pepi = new Gato(hola);
        
        Gato juani = new Gato(hola, 22);
        
        System.out.print(juani.getNombre());
        
        juani.setNombre("juan");
        
        System.out.println("\n" + juani.getNombre());
        
        
        juani.come();
        
        String comida = "gamba";
        
        juani.come(comida);
        
    }
    
}
