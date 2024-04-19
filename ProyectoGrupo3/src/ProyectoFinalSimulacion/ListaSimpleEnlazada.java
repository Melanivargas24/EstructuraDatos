package ProyectoFinalSimulacion;

import javax.swing.JOptionPane;

public class ListaSimpleEnlazada {

    public enum Estado {
        PENDIENTE,
        COMPLETADO,
        CANCELADO
    }

    private int idSolicitud;
    private String ubicacion;
    private String pedido;
    private String restaurante;
    private String tipoPago;
    private String nomCliente;
    private Estado estado;

    public ListaSimpleEnlazada() {
        this.idSolicitud = 0;
        this.ubicacion = "";
        this.pedido = "";
        this.restaurante = "";
        this.tipoPago = "";
        this.nomCliente = "";
        this.estado = Estado.PENDIENTE;
    }

    public void tipoPago() {
        String[] opciones = {"Efectivo", "Tarjeta"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de pago", "Tipo de Pago",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[0]);

        switch (opcion) {
            case 0:
                this.tipoPago = "Efectivo";
                break;
            case 1:
                this.tipoPago = "Tarjeta";
                break;
            default:
                System.out.println("Operación cancelada");
                return;
        }
    }

    // Getters y setters
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitud{"
                + "idSolicitud=" + idSolicitud
                + ", ubicacion='" + ubicacion + '\''
                + ", pedido='" + pedido + '\''
                + ", restaurante='" + restaurante + '\''
                + ", tipoPago='" + tipoPago + '\''
                + ", nomCliente='" + nomCliente + '\''
                + ", estado=" + estado
                + '}';
    }
}
