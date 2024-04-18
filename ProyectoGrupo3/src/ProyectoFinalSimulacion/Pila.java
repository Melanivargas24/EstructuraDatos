package ProyectoFinalSimulacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 3
 */
public class Pila {

    //atributos
    private NodoP cima;
    private int tamaño;
    private final int capacidad;

    //constructores
    public Pila(int capacidad) {
        this.cima = null;
        this.capacidad = capacidad;
        this.tamaño = 0;
    }

    //============================ FUNCIONALIDADES =============================
    //metodo para verificar si esta vacia
    public boolean estaVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    //metodo para verificar si esta lleno
    public boolean estaLlena() {
        return tamaño == capacidad;
    }

    //metodo para apilar
    public void apilar(Ruta ruta) {
        //se crea un nuevo nodo para asignarle rutas
        NodoP nuevo = new NodoP(ruta);
        //si la pila no esta llena, se inserta la ruta
        if (!estaLlena()) {
            nuevo.setSiguiente(cima);
            cima = nuevo;
            tamaño++;
        } else {
            JOptionPane.showMessageDialog(null, "La pila está llena, no se puede apilar más rutas.");
        }
    }

    //metodo para desapilar
    public Ruta desapilar() {
        //si hay algun elemento dentro de la pila
        if (!estaVacia()) {
            Ruta rutaDesapilada = cima.getRuta();
            cima = cima.getSiguiente();
            tamaño--;
            JOptionPane.showMessageDialog(null, "El elemento fue desapilado", "Desapilar",
                    JOptionPane.WARNING_MESSAGE);
            return rutaDesapilada;
        } else {
            JOptionPane.showMessageDialog(null, "La pila está vacía, no se puede desapilar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    //metodo para mostrar
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
// metodo creado para que el grafo pueda llamar las rutas proporcionadas aqui en pila
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
}//fin de la clase
