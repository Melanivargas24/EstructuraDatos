package nuevoestructura;

import javax.swing.JOptionPane;

/**
 * Esta clase representa una solicitud realizada en el sistema de gestión de
 * solicitudes. Cada solicitud tiene un identificador único, una ubicación, un
 * pedido, un restaurante, un tipo de pago, un nombre de cliente y un estado que
 * puede ser pendiente, completado o cancelado. Permite al usuario especificar
 * el tipo de pago al momento de realizar la solicitud, seleccionando entre
 * efectivo o tarjeta. La clase proporciona métodos para acceder y modificar los
 * atributos de la solicitud. También proporciona un método para establecer el
 * tipo de pago de la solicitud.
 *
 * @author Grupo 3
 */
public class Solicitud {

    /**
     * Enumeración que representa el estado de una solicitud. Una solicitud
     * puede estar pendiente, completada o cancelada.
     */
    public enum Estado {
        PENDIENTE,
        COMPLETADO,
        CANCELADO
    }

    // Atributos de la solicitud
    int idSolicitud;
    String ubicacion;
    String pedido;
    String restaurante;
    String tipoPago;
    String nomCliente;
    Estado estado; // Pendiente, completado o cancelado

    /**
     * Constructor de la clase Solicitud. Inicializa los atributos de la
     * solicitud con valores predeterminados.
     */
    public Solicitud() {
        this.idSolicitud = 0;
        this.ubicacion = "";
        this.pedido = "";
        this.restaurante = "";
        this.tipoPago = "";
        this.nomCliente = "";
        this.estado = Estado.PENDIENTE;
    }

    /**
     * Método para seleccionar el tipo de pago de la solicitud. Muestra un
     * cuadro de diálogo al usuario para que elija entre efectivo o tarjeta.
     * Establece el tipo de pago seleccionado en el atributo correspondiente de
     * la solicitud.
     */
    public void TipoPago() {
        String[] opciones = {"Efectivo", "Tarjeta"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de pago", "Tipo de Pago",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[0]);

        // Verificamos la opción seleccionada por el usuario
        if (opcion == 0) {
            this.tipoPago = "Efectivo";
        } else if (opcion == 1) {
            this.tipoPago = "Tarjeta";
        } else {
            // En caso de que el usuario cierre la ventana sin seleccionar ninguna opción
            System.out.println("Operación cancelada");
            return;
        }
    }

    // Getters y setters para los atributos de la solicitud
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
