package ProyectoFinalSimulacion;

import java.time.LocalDateTime;

public class Grafo {

    private final MatrizAdy matriz; // Usar la matriz de adyacencia para representar el grafo

    public Grafo(int n) {
        this.matriz = new MatrizAdy(n);
    }

    // Método para agregar una conexión entre dos nodos
    public void agregarConexion(int origen, int destino) {
        matriz.agregar(origen, origen);
    }

    // Método para realizar los repartos
    public void realizarRepartos(Pila pilaRutas, Cola colaSolicitudes) {
        Ruta[] rutas = pilaRutas.Rutas(); // Obtener las rutas de la pila
        while (!colaSolicitudes.vacia()) { // Mientras haya solicitudes en la cola
            Solicitud solicitud; // Obtener la siguiente solicitud
            solicitud = colaSolicitudes.desencolar();

            // Iterar sobre las rutas disponibles
            for (Ruta ruta : rutas) {
                if (ruta.getUbicacionInicio().equals(solicitud.getRestaurante())) {
                    // Si la ruta es del restaurante de la solicitud, realizar el reparto
                    System.out.println("Fecha y hora de recogida: " + LocalDateTime.now());
                    System.out.println("Restaurante: " + ruta.getUbicacionInicio());
                    // Simular la duración del reparto
                    try {
                        Thread.sleep(30 * 60 * 1000); // 30 minutos en milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Pedido exitoso al cliente
                    System.out.println("Pedido exitoso para el cliente: " + solicitud.getNomCliente() + " en " + ruta.getUbicacionDestino());
                    break; // Salir del bucle una vez que se realiza el reparto
                }
            }
        }
    }
}
