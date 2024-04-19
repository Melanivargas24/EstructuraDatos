package nuevoestructura;

import javax.swing.JOptionPane;

/**
 * Esta clase representa una pila de rutas. Permite apilar nuevas rutas,
 * desapilar rutas asignadas y mostrar las rutas disponibles. Utiliza una
 * instancia de la clase GrafoMatriz para almacenar las rutas como aristas en el
 * grafo. La pila se implementa utilizando nodos simples enlazados.
 *
 * @author [Nombre del autor o grupo]
 */
class Pila {

    private Nodo cima;
    private GrafoMatriz grafo;

    /**
     * Constructor de la clase Pila. Inicializa la cima de la pila como nula y
     * asigna un grafo para almacenar las rutas.
     *
     * @param grafo El grafo de rutas donde se almacenarán las aristas.
     */
    public Pila(GrafoMatriz grafo) {
        this.cima = null;
        this.grafo = grafo;
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false si contiene elementos.
     */
    public boolean vacia() {
        return cima == null;
    }

    /**
     * Obtiene el nodo en la cima de la pila.
     *
     * @return El nodo en la cima de la pila.
     */
    public Nodo cima() {
        return cima;
    }

    /**
     * Apila una nueva ruta en la pila. Solicita al usuario los datos de la ruta
     * y la agrega como arista en el grafo.
     */
    public void apilar() {
        // Solicitamos los datos de la ruta
        String origen = JOptionPane.showInputDialog("Ingrese el origen:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");
        int peso = obtenerEntero("Ingrese el precio:");

        // Creamos una nueva ruta
        Ruta nuevaRuta = new Ruta(origen, destino, peso);

        // Creamos un nuevo nodo y le asignamos la ruta
        Nodo nuevo = new Nodo();
        nuevo.setDatos(nuevaRuta);

        // Insertamos el nodo en la pila
        if (vacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }

        // Agregamos la ruta como arista en el grafo
        grafo.agregarArista(nuevaRuta);
    }

    /**
     * Desapila una ruta asignada de la pila. Notifica al usuario si la
     * operación fue exitosa o si la pila está vacía.
     */
    public void desapilar() {
        if (!vacia()) {
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "La ruta ha sido asignada a una solicitud", "Desapilar",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay rutas para desapilar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Muestra las rutas disponibles en la pila. Notifica al usuario si la pila
     * está vacía.
     */
    public void mostrar() {
        if (!vacia()) {
            String s = "";
            Nodo aux = cima;
            while (aux != null) {
                Ruta ruta = aux.getDatos();
                s += "Origen: " + ruta.origen + ", Destino: " + ruta.destino + ", Precio: " + ruta.peso + "\n ↓ \n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "\t****Rutas disponibles***\n" + s, "Pila llena",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Imposible mostrar, pila vacía", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método para obtener un entero desde un diálogo de entrada.
     *
     * @param mensaje El mensaje a mostrar al solicitar el entero.
     * @return El entero ingresado por el usuario.
     */
    private static int obtenerEntero(String mensaje) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número entero válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return obtenerEntero(mensaje);
        }
    }
}
