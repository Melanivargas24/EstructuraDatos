package ProyectoFinalSimulacion;

/**
 *
 * @author Grupo 3
 */

public class NodoP {
    
    //atributos
    private final Ruta rutas;
    private NodoP siguiente;
    
    //constructor
    public NodoP (Ruta rutas) {
        this.rutas = rutas;
    }
    
    //encapsuladores getters y setters
    public Ruta getRuta() {
        return rutas;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }
    
}//fin de la clase