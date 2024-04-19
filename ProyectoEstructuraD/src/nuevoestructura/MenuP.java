/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoestructura;

import javax.swing.JOptionPane;

/**
 *
 * @author varga
 */
public class MenuP {
     // Crear el grafo
    GrafoMatriz grafo = new GrafoMatriz(5);

    // Crear la pila
    Pila pila = new Pila(grafo);

    // Menú
    public void menuPila(MenuCola menuCola) { // Aceptar una referencia de MenuCola como parámetro
       
        do {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Crear nueva ruta\n" +
                            "2. Asignar ruta\n" +
                            "3. Mostrar rutas\n" +
                            "4. Mostrar matriz de rutas\n" +
                            "5. Regresar"
            );

            switch (opcion) {
                case "1":
                    pila.apilar();
                    break;
                case "2":
                    pila.desapilar();
                    break;
                case "3":
                    pila.mostrar();
                    break;
                case "4":
                    grafo.imprimirMatrizAdyacencia();
                    break;
                case "5":
                    return; 
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (true);
    }
}