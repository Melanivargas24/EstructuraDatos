package ProyectoFinalSimulacion;

public class ListaSimpleEnlazada {

    public Nodo inicio;

    public ListaSimpleEnlazada() {
        this.inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void insertarAlFinal(Solicitud solicitud) {
        Nodo nuevo = new Nodo(solicitud);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Solicitud eliminarAlInicio() {
        if (!estaVacia()) {
            Solicitud solicitudEliminada = inicio.getSolicitud();
            inicio = inicio.getSiguiente();
            return solicitudEliminada;
        }
        return null; // Retorna null si la lista está vacía
    }

    public void mostrar() {
        if (!estaVacia()) {
            Nodo actual = inicio;
            while (actual != null) {
                System.out.println(actual.getSolicitud());
                actual = actual.getSiguiente();
            }
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    public static class Nodo {

        public final Solicitud solicitud;
        public Nodo siguiente;

        public Nodo(Solicitud solicitud) {
            this.solicitud = solicitud;
            this.siguiente = null;
        }

        public Solicitud getSolicitud() {
            return solicitud;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
}
