package ProyectoFinalSimulacion;

import javax.swing.JOptionPane;

public class Pila {

    private NodoP cima;
    private int tamaño;
    private final int capacidad;

    public Pila(int capacidad) {
        this.cima = null;
        this.capacidad = capacidad;
        this.tamaño = 0;
    }

    public Pila() {
        this.cima = cima;
        this.tamaño = tamaño;
        this.capacidad = 0;
    }

   
    
    

    public boolean estaVacia() {
        return cima == null;
    }

    public boolean estaLlena() {
        return tamaño == capacidad;
    }

    public void apilar(Ruta ruta) {
        NodoP nuevo = new NodoP(ruta);
        if (!estaLlena()) {
            nuevo.setSiguiente(cima);
            cima = nuevo;
            tamaño++;
        } else {
            JOptionPane.showMessageDialog(null, "La pila está llena, no se puede apilar más rutas.");
        }
    }

    public Ruta desapilar() {
        if (!estaVacia()) {
            Ruta rutaDesapilada = cima.getRuta();
            cima = cima.getSiguiente();
            tamaño--;
            JOptionPane.showMessageDialog(null, "El elemento fue desapilado", "Desapilar", JOptionPane.WARNING_MESSAGE);
            return rutaDesapilada;
        } else {
            JOptionPane.showMessageDialog(null, "La pila está vacía, no se puede desapilar.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void mostrar() {
        if (!estaVacia()) {
            StringBuilder mensaje = new StringBuilder("\t***Contenido de la pila:***\n");
            NodoP nodoAux = cima;
            while (nodoAux != null) {
                mensaje.append(nodoAux.getRuta()).append("\n↓\n");
                nodoAux = nodoAux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Pila Llena", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Imposible mostrar, la pila está vacía", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Ruta[] Rutas() {
        Ruta[] Rutas = new Ruta[tamaño];
        NodoP nodoAux = cima;
        int posicion = 0;
        while (nodoAux != null) {
            Rutas[posicion] = nodoAux.getRuta();
            nodoAux = nodoAux.getSiguiente();
            posicion++;
        }
        return Rutas;
    }
}
