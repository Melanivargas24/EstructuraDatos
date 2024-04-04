
import javax.swing.JOptionPane;


/**
 *
 * @author Grupo 3
 */
public class Cola {

    private NodoC inicio;
    private NodoC fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia(){
        if(inicio == null){
            return true;
            
        }else{
            return false;
        }
    }

     public void encolar(){
     Solicitud sol = new Solicitud();
     sol.setIdSolicitud(Integer.parseInt(JOptionPane.showInputDialog("ID de la solicitud:")));
     sol.setNomCliente(JOptionPane.showInputDialog("Nombre del cliente:"));
     sol.setUbicacion(JOptionPane.showInputDialog("Ubicación:"));
     sol.setPedido(JOptionPane.showInputDialog("Pedido:"));
     sol.setRestaurante(JOptionPane.showInputDialog("Restaurante:"));
     sol.TipoPago();
     NodoC nuevo= new NodoC();
     nuevo.setSolicitud(sol);
    if(vacia()){
        inicio = nuevo;
        fin= nuevo;
    }else{
        fin.setSiguiente(nuevo);
        fin = nuevo;
    }
    }

    public void desencolar() {
    if (!vacia()) {
        // Obtener la solicitud que se va a desencolar
        Solicitud solicitud = inicio.getSolicitud();
        
        // Comprobamos si la solicitud ha sido completada
        if (!solicitud.getEstado().equals(Solicitud.Estado.COMPLETADO) &&
            !solicitud.getEstado().equals(Solicitud.Estado.CANCELADO)) {
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
