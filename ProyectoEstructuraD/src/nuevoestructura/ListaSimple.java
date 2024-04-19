package nuevoestructura;

/**
 * Esta clase representa una lista simple que contiene nodos combinados de
 * solicitud y ruta. Cada nodo combinado contiene una solicitud y una ruta
 * asociada. La lista puede crecer dinámicamente al insertar nodos al final y
 * puede eliminar el primer nodo. También puede mostrar su contenido y
 * proporcionar el tamaño actual de la lista.
 *
 * @author varga
 */
public class ListaSimple {

    private NodoCombinado inicio;
    private NodoCombinado fin;

    // Constructor
    public ListaSimple() {
        this.inicio = null;
        this.fin = null;
    }

    // Método para verificar si la lista está vacía
    public boolean vacia() {
        return inicio == null;
    }

    // Método para insertar al final de la lista
    public void insertar(Solicitud solicitud, Ruta ruta) {
        NodoCombinado nuevoNodo = new NodoCombinado(solicitud, ruta);
        if (vacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    // Método para eliminar el primer elemento de la lista
    public void eliminarPrimero() {
        if (!vacia()) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        }
    }

    // Método para mostrar el contenido de la lista
    public void mostrar() {
        if (!vacia()) {
            NodoCombinado actual = inicio;
            while (actual != null) {
                System.out.println("Solicitud: " + actual.getSolicitud() + ", Ruta: " + actual.getRuta());
                actual = actual.getSiguiente();
            }
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    // Método para obtener el tamaño de la lista
    public int tamaño() {
        int tamaño = 0;
        NodoCombinado actual = inicio;
        while (actual != null) {
            tamaño++;
            actual = actual.getSiguiente();
        }
        return tamaño;
    }
}
