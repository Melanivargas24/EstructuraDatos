/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoestructura;

class Nodo {
    private Ruta datos;
    private Nodo siguiente;

    public Nodo() {
        this.datos = null;
        this.siguiente = null;
    }

    public void setDatos(Ruta datos) {
        this.datos = datos;
    }

    public Ruta getDatos() {
        return datos;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}