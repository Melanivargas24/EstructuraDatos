package ProyectoFinalSimulacion;

public class NodoC {

    private ListaSimpleEnlazada solicitud;
    private NodoC siguiente;

    public NodoC() {
        this.siguiente = null;
    }

    public ListaSimpleEnlazada getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(ListaSimpleEnlazada solicitud) {
        this.solicitud = solicitud;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
}
