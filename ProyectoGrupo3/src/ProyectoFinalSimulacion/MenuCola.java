package ProyectoFinalSimulacion;

/**
 *
 * @author Grupo 3
 */
import javax.swing.JOptionPane;

public class MenuCola {

   int op = 0;
    Cola c = new Cola();
    MenuPila pila = new MenuPila();

    public void menu() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "\t***Menú principal***\n"
                + "\n1= Realizar una solicitud"
                + "\n2= Atender solicitud"
                + "\n3= Solicitudes pendientes"
                + "\n4= Cancelar una solicitud"
                + "\n5= Siguiente"
                 + "\n6= Salir"
                + "\nDigite la opción deseada", "Menú", JOptionPane.QUESTION_MESSAGE));

        switch (op) {
            case 1:
                c.encolar();
                menu();
                break;
            case 2:
                c.desencolar();
                menu();
                break;
            case 3:
                c.mostrar();
                menu();
                break;
            case 4:
                int id= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud a cancelar"));
                c.cancelarSolicitud(id);
                menu();
                break;
            case 5:
                pila.mostrarMenu();
                menu();
                break;
            case 6:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                menu();

        }
    }
    
}