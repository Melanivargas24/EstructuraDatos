package ProyectoFinalSimulacion;

import java.time.LocalDateTime;

public class Grafo {

    private final MatrizAdy matriz; // Usar la matriz de adyacencia para representar el grafo
    
    public Grafo() {

        this.matriz = new MatrizAdy(5);
    }

    // Método para agregar una conexión entre dos nodos
    public void agregarConexion(int origen, int destino) {
        matriz.agregar(origen, destino);
    }

// Método para realizar los repartos
    public void realizarRepartos(Pila pilaRutas, Cola colaSolicitudes) {
        Ruta[] rutas = pilaRutas.Rutas(); // Obtener las rutas de la pila
        Solicitud solicitud=new Solicitud();
        while (!colaSolicitudes.vacia()) {
             colaSolicitudes.desencolar(); // Obtener la siguiente solicitud

            for (Ruta ruta : rutas) {
                if (ruta.getUbicacionInicio().equals(solicitud.getRestaurante()+ruta.getUbicacionDestino())) {
                    // Realizar el reparto
                    System.out.println("Fecha y hora de la recoleccion del pedido: " + LocalDateTime.now());
                    System.out.println("Restaurante: " +ruta.getUbicacionInicio()+"Heredia, plaza del carmen");
                    //Entrega al cliente
                    System.out.println("Entrega al cliente de manera exitosa");
                    System.out.println("Ubicacion destino: " + ruta.getUbicacionDestino()+"Barreal de Heredia");
                    
                    }
                    break; // Salir del bucle una vez que se realiza el reparto
                }
            }
        }
    }

