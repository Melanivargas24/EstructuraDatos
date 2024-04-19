package ProyectoFinalSimulacion;

import javax.swing.JOptionPane;

public class ListaSimpleEnlazada {

    private NodoLS cabeza;

    public ListaSimpleEnlazada() {
        this.cabeza = null;
    }

    public boolean vacia() {
        return cabeza == null;
    }

    public void insertar() {
        Solicitud solicitud = new Solicitud();
        solicitud.setIdSolicitud(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud:")));
        solicitud.setUbicacion(JOptionPane.showInputDialog("Ingrese la ubicación:"));
        solicitud.setPedido(JOptionPane.showInputDialog("Ingrese el pedido:"));
        solicitud.setRestaurante(JOptionPane.showInputDialog("Ingrese el restaurante:"));
        solicitud.tipoPago(); // Utiliza el método tipoPago() de la solicitud para establecer el tipo de pago

        NodoLS nuevo = new NodoLS();
        nuevo.setSolicitud(solicitud);

        if (vacia()) {
            cabeza = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
    }

    public Solicitud extraer() {
        if (!vacia()) {
            Solicitud solicitudExtraida = cabeza.getSolicitud();
            cabeza = cabeza.getSiguiente();
            return solicitudExtraida;
        } else {
            JOptionPane.showMessageDialog(null, "Error al extraer", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void mostrar() {
        if (!vacia()) {
            StringBuilder s = new StringBuilder();
            NodoLS aux = cabeza;
            while (aux != null) {
                s.append(aux.getSolicitud().toString()).append(" -> ");
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene: " + s.toString(), "Contenido de la lista", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al mostrar", "Lista Vacía", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Getters y setters
    public NodoLS getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoLS cabeza) {
        this.cabeza = cabeza;
    }
}
