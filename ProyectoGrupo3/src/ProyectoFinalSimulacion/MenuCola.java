package ProyectoFinalSimulacion;

import javax.swing.JOptionPane;

public class MenuCola {

    int op = 0;
    Cola colaSolicitudes = new Cola();
    MenuPila menuPila = new MenuPila();

    public void menu() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                ***Menu principal***
                                                                
                                                                1= Realizar una solicitud
                                                                2= Atender solicitud
                                                                3= Solicitudes pendientes
                                                                4= Cancelar una solicitud
                                                                5= Siguiente
                                                                6= Salir
                                                                Digite la opción deseada""", "Menú", JOptionPane.QUESTION_MESSAGE));

        switch (op) {
            case 1:
                realizarSolicitud();
                menu();
                break;
            case 2:
                atenderSolicitud();
                menu();
                break;
            case 3:
                mostrarSolicitudes();
                menu();
                break;
            case 4:
                cancelarSolicitud();
                menu();
                break;
            case 5:
                menuPila.mostrarMenu();
                menu();
                break;
            case 6:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                menu();
        }
    }

    public void realizarSolicitud() {
        colaSolicitudes.encolar();
    }

    public void atenderSolicitud() {
        colaSolicitudes.desencolar();
    }

    public void mostrarSolicitudes() {
        colaSolicitudes.mostrar();
    }

    public void cancelarSolicitud() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud a cancelar"));
        colaSolicitudes.cancelarSolicitud(id);
    }
}
