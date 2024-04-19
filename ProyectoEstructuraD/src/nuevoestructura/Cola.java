package nuevoestructura;

import javax.swing.JOptionPane;

/**
 * Esta clase representa una cola de solicitudes. Implementa las operaciones
 * básicas de una cola, como encolar, desencolar y mostrar. Cada solicitud se
 * almacena como un nodo en la cola.
 *
 * @author Grupo 3
 */
public class Cola {

    private NodoC inicio;
    private NodoC fin;

    /**
     * Constructor de la clase Cola. Inicializa los punteros de inicio y fin de
     * la cola como nulos.
     */
    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    /**
     * Comprueba si la cola está vacía.
     *
     * @return true si la cola está vacía, false si contiene elementos.
     */
    public boolean vacia() {
        return inicio == null;
    }

    /**
     * Agrega una nueva solicitud a la cola. Los datos de la solicitud son
     * ingresados mediante diálogos de entrada.
     */
    public void encolar() {
        Solicitud sol = new Solicitud();
        sol.setIdSolicitud(Integer.parseInt(JOptionPane.showInputDialog("ID de la solicitud:")));
        sol.setNomCliente(JOptionPane.showInputDialog("Nombre del cliente:"));
        sol.setUbicacion(JOptionPane.showInputDialog("Ubicación:"));
        sol.setPedido(JOptionPane.showInputDialog("Pedido:"));
        sol.setRestaurante(JOptionPane.showInputDialog("Restaurante:"));
        sol.TipoPago();
        NodoC nuevo = new NodoC();
        nuevo.setSolicitud(sol);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    /**
     * Elimina la solicitud al frente de la cola (la primera en entrar). Si la
     * solicitud no está completada o cancelada, cambia su estado a completada.
     */
    public void desencolar() {
        if (!vacia()) {
            // Obtener la solicitud que se va a desencolar
            Solicitud solicitud = inicio.getSolicitud();

            // Comprobar si la solicitud ha sido completada
            if (!solicitud.getEstado().equals(Solicitud.Estado.COMPLETADO)
                    && !solicitud.getEstado().equals(Solicitud.Estado.CANCELADO)) {
                // Cambiar el estado de la solicitud 
                solicitud.setEstado(Solicitud.Estado.COMPLETADO);
            }

            // Desencolar la solicitud eliminando el primer nodo
            inicio = inicio.getSiguiente();

            JOptionPane.showMessageDialog(null, "Solicitud extraída", "Desencolar", JOptionPane.CLOSED_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer", "Cola vacía", JOptionPane.CLOSED_OPTION);
        }
    }

    /**
     * Cancela una solicitud específica dada su ID.
     *
     * @param id El ID de la solicitud a cancelar.
     */
    public void cancelarSolicitud(int id) {
        NodoC aux = inicio;
        while (aux != null) {
            if (aux.getSolicitud().getIdSolicitud() == id) {
                // Si se encuentra la solicitud con el ID dado, se cambia su estado a "Cancelado"
                aux.getSolicitud().setEstado(Solicitud.Estado.CANCELADO);
                JOptionPane.showMessageDialog(null, "Solicitud cancelada", "Cancelar Solicitud",
                        JOptionPane.INFORMATION_MESSAGE);
                return; // Se sale del método después de cancelar la solicitud
            }
            aux = aux.getSiguiente();
        }
        // Si no se encuentra ninguna solicitud con el ID dado
        JOptionPane.showMessageDialog(null, "No se encontró ninguna solicitud con el ID especificado",
                "Cancelar Solicitud", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra el contenido de la cola en un cuadro de diálogo.
     */
    public void mostrar() {
        if (!vacia()) {
            String s = "";
            NodoC aux = inicio;
            while (aux != null) {
                s += aux.getSolicitud().getIdSolicitud() + " - "
                        + aux.getSolicitud().getNomCliente() + " - "
                        + aux.getSolicitud().getUbicacion() + " - "
                        + aux.getSolicitud().getPedido() + " - "
                        + aux.getSolicitud().getRestaurante() + " - "
                        + aux.getSolicitud().getTipoPago() + " - "
                        + aux.getSolicitud().getEstado() + "\n ↑ \n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s, "Mostrar Datos",
                    JOptionPane.PLAIN_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "La cola está vacía", "Cola vacía",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
