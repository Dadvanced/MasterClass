package examenpoo;

/**
 *
 * @author David León
 */
public class Terminal {
    private String numero;
    private int conversacion;
    private int edad;
    
    
    public Terminal(String n) {
        this.numero = n;
        this.conversacion = 0;
    }
    
    //terminalito.llama(goku, 200);
    //goku = pepi
    //terminalito = this.
    //s = 200
    public void llama(Terminal pepi, int s) {
        this.conversacion += s;
        pepi.conversacion += s;
    }
    
    @Override
   public String toString() {
        String s = "Nº:  " + this.numero + " - " + this.conversacion + "s de conversación";
        return s;
    }
    
}
