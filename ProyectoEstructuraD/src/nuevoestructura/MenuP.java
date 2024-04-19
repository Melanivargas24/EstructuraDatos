package nuevoestructura;

import javax.swing.JOptionPane;

/**
 * Esta clase representa un menú para interactuar con una pila y un grafo de
 * rutas. Permite al usuario crear nuevas rutas, asignar rutas, mostrar las
 * rutas disponibles, mostrar la matriz de adyacencia del grafo y regresar al
 * menú anterior. Utiliza una instancia de la clase GrafoMatriz para almacenar
 * las rutas y una instancia de la clase Pila para manejar las operaciones de la
 * pila. Recibe una referencia a un objeto MenuCola para permitir la interacción
 * con el menú de la cola.
 *
 * @author varga
 */
public class MenuP {
    // Crear el grafo

    GrafoMatriz grafo = new GrafoMatriz(5);

    // Crear la pila
    Pila pila = new Pila(grafo);

    /**
     * Muestra el menú de la pila y realiza acciones según la elección del
     * usuario.
     *
     * @param menuCola Una referencia al menú de la cola, para permitir la
     * interacción entre menús.
     */
    public void menuPila(MenuCola menuCola) { // Aceptar una referencia de MenuCola como parámetro

        do {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n"
                    + "1. Crear nueva ruta\n"
                    + "2. Asignar ruta\n"
                    + "3. Mostrar rutas\n"
                    + "4. Mostrar matriz de rutas\n"
                    + "5. Regresar"
            );

            switch (opcion) {
                case "1":
                    pila.apilar();
                    break;
                case "2":
                    pila.desapilar();
                    break;
                case "3":
                    pila.mostrar();
                    break;
                case "4":
                    grafo.imprimirMatrizAdyacencia();
                    break;
                case "5":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (true);
    }
}
