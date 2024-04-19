package nuevoestructura;

/**
 * Clase NodoCombinado que contiene tanto la información de la solicitud como la
 * de la ruta. Cada nodo combinado contiene una solicitud, una ruta asociada y
 * una referencia al siguiente nodo combinado en la lista. Los datos almacenados
 * en el nodo son de tipo Solicitud y Ruta, y la referencia al siguiente nodo es
 * de tipo NodoCombinado. Esta clase se utiliza en la implementación de la lista
 * simple en la clase ListaSimple.
 *
 * @author varga
 */
class NodoCombinado {

    private Solicitud solicitud;
    private Ruta ruta;
    private NodoCombinado siguiente;

    // Constructor
    public NodoCombinado(Solicitud solicitud, Ruta ruta) {
        this.solicitud = solicitud;
        this.ruta = ruta;
        this.siguiente = null;
    }

    // Getters y setters
    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public NodoCombinado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCombinado siguiente) {
        this.siguiente = siguiente;
    }
}
