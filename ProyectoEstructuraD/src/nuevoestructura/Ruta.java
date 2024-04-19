package nuevoestructura;

/**
 * Esta clase representa una ruta entre dos ubicaciones. Cada ruta tiene un
 * origen, un destino y un peso asociado que representa el costo o la distancia
 * de la ruta. Se utiliza para almacenar la información de las rutas en el
 * sistema de gestión de solicitudes. La clase Ruta proporciona métodos para
 * acceder y modificar el origen, destino y peso de la ruta.
 */
class Ruta {

    String origen;
    String destino;
    int peso;

    /**
     * Constructor de la clase Ruta. Crea una nueva instancia de Ruta con el
     * origen, destino y peso especificados.
     *
     * @param origen La ubicación de origen de la ruta.
     * @param destino La ubicación de destino de la ruta.
     * @param peso El peso asociado a la ruta, que puede representar el costo o
     * la distancia.
     */
    public Ruta(String origen, String destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    /**
     * Obtiene la ubicación de origen de la ruta.
     *
     * @return La ubicación de origen de la ruta.
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece la ubicación de origen de la ruta.
     *
     * @param origen La nueva ubicación de origen de la ruta.
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene la ubicación de destino de la ruta.
     *
     * @return La ubicación de destino de la ruta.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece la ubicación de destino de la ruta.
     *
     * @param destino La nueva ubicación de destino de la ruta.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene el peso asociado a la ruta.
     *
     * @return El peso asociado a la ruta.
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Establece el peso asociado a la ruta.
     *
     * @param peso El nuevo peso asociado a la ruta.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
}
