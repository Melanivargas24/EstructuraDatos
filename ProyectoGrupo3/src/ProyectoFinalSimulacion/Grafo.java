/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinalSimulacion;

import java.time.LocalDateTime;

/**
 *
 * @author XPC
 */
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
            Solicitud solicitud =new Solicitud();
            colaSolicitudes.desencolar(); // Obtener la siguiente solicitud
            for (Ruta ruta : rutas) { // Iterar sobre las rutas disponibles
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
                    System.out.println("Pedido exitoso para el cliente: " + solicitud.getNomCliente()+ ruta.getUbicacionDestino());
                    break; // Salir del bucle una vez que se realiza el reparto
                }
            }
        }
    }
}



