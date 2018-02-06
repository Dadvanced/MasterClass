
package masterclass;

/**
 *
 * @author dadva
 */
public class Gato {
    private String nombre;
    private String raza;
    private String sexo;
    private int edad;
    
    public Gato() {
    }
    
    public Gato(String adio) {
        this.nombre = adio;
        this.edad = 1;
    }
    
    
    public Gato(String nombre, int age) {
        this.nombre = nombre;
        this.edad = age;
    }
    ////////////////////////////////////////////////////
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getRaza() {
        return this.raza;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public String setNombre(String nombre) {
        return this.nombre = nombre;
    }
    
    public String setSexo(String s) {
        return this.sexo = s;
    }
    
    public int setEdad(int age) {
        return this.edad = age;
    }
    
    public String setRaza(String r) {
        return this.raza = r;
    }
    
    
    public void come() {
        System.out.println(this.nombre + " está comiendo felizmente brocoli");
    }
    
    public void come(String comida) {
        System.out.println(this.nombre + " está comiendo felizmente " + comida);
    }
    
}
