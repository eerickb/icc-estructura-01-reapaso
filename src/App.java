
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25), 
            new Persona("Maria", 30), 
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        vC.printMessage("Arreglo Personas");
        vC.printPersonsArray(personas);
        vC.printMessage("Arreglo personas ordenado");
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);
        vC.printMessage("Buscar Persona con edad 40");
        Persona personaBuscada = pC.buscarPorEdad(personas, 40);
        if(personaBuscada == null){
            vC.printMessage("No se encontro persona con edad 40");
        } else {
            vC.printMessage("Se encontro persona con edad 40");
            vC.printMessage(personaBuscada.toString());
        }
        vC.printMessage("Buscar Persona con edad 99");
        Persona personaBuscadaDos = pC.buscarPorEdad(personas, 99);
        if(personaBuscadaDos == null){
            vC.printMessage("No se encontro persona con edad 99");
        } else {
            vC.printMessage("Se encontro persona con edad 99");
            vC.printMessage(personaBuscadaDos.toString());
        }
    }
}