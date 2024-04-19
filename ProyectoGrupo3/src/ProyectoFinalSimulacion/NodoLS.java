package ProyectoFinalSimulacion;

public class NodoLS {
    private ListaSimpleEnlazada solicitud;
    private NodoLS siguiente;

    public NodoLS(ListaSimpleEnlazada solicitud) {
        this.solicitud = solicitud;
        this.siguiente = null;
    }

    public ListaSimpleEnlazada getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(ListaSimpleEnlazada solicitud) {
        this.solicitud = solicitud;
    }

    public NodoLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }
}
