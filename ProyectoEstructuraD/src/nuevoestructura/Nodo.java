package nuevoestructura;
/**
 * Esta clase representa un nodo que contiene datos de tipo Ruta.
 * Cada nodo en una estructura de datos puede contener un objeto de tipo Ruta
 * y una referencia al siguiente nodo en la estructura.
 * Los datos del nodo son de tipo Ruta y la referencia al siguiente nodo es de tipo Nodo.
 */
class Nodo {
    private Ruta datos;
    private Nodo siguiente;

    /**
     * Constructor de la clase Nodo.
     * Inicializa los datos del nodo como nulos y la referencia al siguiente nodo como nula.
     */
    public Nodo() {
        this.datos = null;
        this.siguiente = null;
    }

    /**
     * Establece los datos del nodo.
     * @param datos Los datos de tipo Ruta a establecer en el nodo.
     */
    public void setDatos(Ruta datos) {
        this.datos = datos;
    }

    /**
     * Obtiene los datos almacenados en el nodo.
     * @return Los datos de tipo Ruta almacenados en el nodo.
     */
    public Ruta getDatos() {
        return datos;
    }

    /**
     * Establece la referencia al siguiente nodo.
     * @param siguiente La referencia al siguiente nodo a establecer.
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene la referencia al siguiente nodo.
     * @return La referencia al siguiente nodo.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }
}
