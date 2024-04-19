/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoestructura;

/**
 *
 * @author varga
 */
// Clase NodoCombinado que contiene tanto la información de la solicitud como la de la ruta
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
