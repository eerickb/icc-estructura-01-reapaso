package Views;

import Models.Persona;

public class ViewConsole {

    /**
     * Imprime un arreglo de objetos Persona en la consola.
     * 
     * @param personas Arreglo de personas a imprimir.
     */
    public void printPersonsArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    /**
     * Imprime un mensaje genérico en la consola.
     * 
     * @param message Mensaje a mostrar.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
}