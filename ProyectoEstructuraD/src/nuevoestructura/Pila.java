/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoestructura;

import javax.swing.JOptionPane;

class Pila {
    private Nodo cima;
    private GrafoMatriz grafo;

    public Pila(GrafoMatriz grafo) {
        this.cima = null;
        this.grafo = grafo;
    }

    public boolean vacia() {
        return cima == null;
    }
    
   public Nodo cima() {
    return cima;
}

    public void apilar() {
        // Solicitamos los datos de la ruta
        String origen = JOptionPane.showInputDialog("Ingrese el origen:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");
        int peso = obtenerEntero("Ingrese el precio:");

        // Creamos una nueva ruta
        Ruta nuevaRuta = new Ruta(origen, destino, peso);

        // Creamos un nuevo nodo y le asignamos la ruta
        Nodo nuevo = new Nodo();
        nuevo.setDatos(nuevaRuta);

        // Insertamos el nodo en la pila
        if (vacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }

        // Agregamos la ruta como arista en el grafo
        grafo.agregarArista(nuevaRuta);
    }

    public void desapilar() {
        if (!vacia()) {
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "La ruta ha sido asignada a una solicitud", "Desapilar",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay rutas para desapilar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar() {
        if (!vacia()) {
            String s = "";
            Nodo aux = cima;
            while (aux != null) {
                Ruta ruta = aux.getDatos();
                s += "Origen: " + ruta.origen + ", Destino: " + ruta.destino + ", Precio: " + ruta.peso + "\n ↓ \n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "\t****Rutas disponibles***\n" + s, "Pila llena",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Imposible mostrar, pila vacía", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para obtener un entero desde un diálogo de entrada
    private static int obtenerEntero(String mensaje) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número entero válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return obtenerEntero(mensaje);
        }
    }
}