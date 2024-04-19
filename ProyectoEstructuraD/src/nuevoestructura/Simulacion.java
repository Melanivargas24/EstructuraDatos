package nuevoestructura;

/**
 * Esta clase representa la simulación del sistema de gestión de solicitudes.
 * Contiene el método principal `main` que inicia la simulación llamando al menú principal.
 * La simulación consiste en interactuar con el sistema de gestión de solicitudes a través del menú.
 * Permite al usuario realizar diferentes acciones como realizar solicitudes, atenderlas, cancelarlas, etc.
 * Utiliza la clase MenuCola para mostrar el menú principal y gestionar las acciones del usuario.
 * @author Grupo 3
 */
public class Simulacion {

    /**
     * Método principal que inicia la simulación del sistema de gestión de solicitudes.
     * Crea una instancia de la clase MenuCola y llama al método `menu()` para mostrar el menú principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en esta simulación).
     */
    public static void main(String[] args) {
        
        // Instancia para llamar al menú de las colas
        MenuCola c = new MenuCola();
        c.menu();
        
    }
    
}
