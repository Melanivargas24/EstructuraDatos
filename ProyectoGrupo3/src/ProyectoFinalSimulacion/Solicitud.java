package ProyectoFinalSimulacion;

import javax.swing.JOptionPane;

public class Solicitud {

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

    public Solicitud() {
        this.idSolicitud = 0;
        this.ubicacion = "";
        this.pedido = "";
        this.restaurante = "";
        this.tipoPago = "";
        this.nomCliente = "";
        this.estado = Estado.PENDIENTE;
    }

    public void TipoPago() {
        String[] opciones = {"Efectivo", "Tarjeta"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de pago", "Tipo de Pago",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[0]);

        if (opcion == 0) {
            this.tipoPago = "Efectivo";
        } else if (opcion == 1) {
            this.tipoPago = "Tarjeta";
        } else {
            System.out.println("Operación cancelada");
            return;
        }
    }

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
}
