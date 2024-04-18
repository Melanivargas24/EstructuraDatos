package ProyectoFinalSimulacion;

import java.awt.HeadlessException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class MenuPila {

    //atributo
    private final Pila pilaRutas;

    //constructor que permite asignar la capacidad de las rutas
    public MenuPila() {
        this.pilaRutas = new Pila(5); //por ejemplo, 5 rutas
    }

    //metodo para mostrar el menu de las pilas
    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            try {
                String opcion = JOptionPane.showInputDialog(null, """
                                                                  Seleccione una opcion:
                                                                  1. Ingresar dirección
                                                                  2. Asignar conductor
                                                                  3. Mostrar rutas en la pila
                                                                  4. Salir""");

                switch (opcion) {
                    case "1" -> {
                        String nombre = JOptionPane.showInputDialog(null, "Introduce la ruta solicitada:");
                        Ruta ruta = new Ruta(nombre, "", "", LocalDateTime.now(), 0);
                        pilaRutas.apilar(ruta);
                        JOptionPane.showMessageDialog(null, "Viaje solicitado con éxito.");
                    }
                    case "2" -> {
                        Ruta rutaAsignada = pilaRutas.desapilar();
                        if (rutaAsignada != null) {
                            JOptionPane.showMessageDialog(null, "Ruta asignada al conductor: " + rutaAsignada.getNombre());
                        }
                    }
                    case "3" ->
                        pilaRutas.mostrar();
                    case "4" ->
                        salir = true;
                    default ->
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//fin del metodo

}//fin de la clase
