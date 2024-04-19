package nuevoestructura;

/**
 *
 * @author Grupo 3
 */
public class NodoC {
     private Solicitud solicitud;
    private NodoC siguiente;

    public NodoC() {
        this.siguiente = null;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
}

