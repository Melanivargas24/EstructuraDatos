package ProyectoFinalSimulacion;

public class NodoLS {

    public Solicitud solicitud;
    public NodoLS siguiente;

    public NodoLS() {
        this.siguiente = null;
    }

    public NodoLS(Solicitud solicitud) {
        this.solicitud = solicitud;
        this.siguiente = null;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public NodoLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }
}
