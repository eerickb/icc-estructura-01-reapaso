package Models;

/**
 * Clase Persona que representa una entidad Persona con atributos para nombre y edad.
 */
public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;

    /**
     * Constructor para crear una nueva instancia de Persona con un nombre y edad específicos.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener la representación en cadena de texto de una instancia de Persona.
     * 
     * @return Representación en String de la persona, mostrando su nombre y edad.
     */
    @Override
    public String toString() {
        return nombre + " - " + edad;
    }
}