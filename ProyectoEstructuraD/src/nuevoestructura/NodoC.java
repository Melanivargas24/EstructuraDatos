package nuevoestructura;

/**
 * Esta clase representa un nodo de una cola de solicitudes. Cada nodo contiene
 * una solicitud y una referencia al siguiente nodo en la cola. Los datos
 * almacenados en el nodo son de tipo Solicitud y la referencia al siguiente
 * nodo es de tipo NodoC. La clase NodoC se utiliza en la implementación de la
 * estructura de datos de cola en la clase Cola.
 *
 * @author Grupo 3
 */
public class NodoC {

    private Solicitud solicitud;
    private NodoC siguiente;

    /**
     * Constructor de la clase NodoC. Inicializa la referencia al siguiente nodo
     * como nula.
     */
    public NodoC() {
        this.siguiente = null;
    }

    /**
     * Obtiene la solicitud almacenada en el nodo.
     *
     * @return La solicitud almacenada en el nodo.
     */
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Establece la solicitud en el nodo.
     *
     * @param solicitud La solicitud a establecer en el nodo.
     */
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    /**
     * Obtiene la referencia al siguiente nodo en la cola.
     *
     * @return La referencia al siguiente nodo en la cola.
     */
    public NodoC getSiguiente() {
        return siguiente;
    }

    /**
     * Establece la referencia al siguiente nodo en la cola.
     *
     * @param siguiente La referencia al siguiente nodo a establecer.
     */
    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
}
