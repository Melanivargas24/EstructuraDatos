package ProyectoFinalSimulacion;

import javax.swing.JOptionPane;

public class Cola {

    private NodoLS inicio;
    private NodoLS fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void encolar() {
        Solicitud sol = new Solicitud();
        sol.setIdSolicitud(Integer.parseInt(JOptionPane.showInputDialog("ID de la solicitud:")));
        sol.setNomCliente(JOptionPane.showInputDialog("Nombre del cliente:"));
        sol.setUbicacion(JOptionPane.showInputDialog("Ubicación:"));
        sol.setPedido(JOptionPane.showInputDialog("Pedido:"));
        sol.setRestaurante(JOptionPane.showInputDialog("Restaurante:"));
        sol.tipoPago(); // Llamar al método modificado de tipoPago

        NodoLS nuevo = new NodoLS(sol);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public Solicitud desencolar() {
        if (!vacia()) {
            Solicitud solicitudExtraida = inicio.getSolicitud();
            // Comprobamos si la solicitud ha sido completada o cancelada
            if (solicitudExtraida.getEstado() != Estado.COMPLETADO
                    && solicitudExtraida.getEstado() != Estado.CANCELADO) {
                // Cambiar el estado de la solicitud
                solicitudExtraida.setEstado(Estado.COMPLETADO);
            }
            inicio = inicio.getSiguiente();
            return solicitudExtraida;
        } else {
            return null;
        }
    }

    public void cancelarSolicitud(int id) {
        NodoLS aux = inicio;
        while (aux != null) {
            if (aux.getSolicitud().getIdSolicitud() == id) {
                // Si se encuentra la solicitud con el ID dado, se cambia su estado a "Cancelado"
                aux.getSolicitud().setEstado(Estado.CANCELADO);
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

    public void mostrar() {
        if (!vacia()) {
            StringBuilder s = new StringBuilder();
            NodoLS aux = inicio;
            while (aux != null) {
                s.append(aux.getSolicitud()).append(" ↑ \n");
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
