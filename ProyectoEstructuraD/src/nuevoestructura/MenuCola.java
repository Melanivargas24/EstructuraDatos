package nuevoestructura;

/**
 *
 * @author Grupo 3
 */
import javax.swing.JOptionPane;

public class MenuCola {
    int op = 0;
    Cola c = new Cola();
    MenuP m = new MenuP();
    ListaSimple l = new ListaSimple();
 
    public void menu() {
    op = Integer.parseInt(JOptionPane.showInputDialog(null, "\t***Menú Usuario***\n"
            + "\n1= Realizar una solicitud"
            + "\n2= Atender solicitud"
            + "\n3= Solicitudes pendientes"
            + "\n4= Cancelar una solicitud"
            + "\n5= Mostrar rutas"
            + "\n6= Historial"
            + "\n7= Salir"
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
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud a cancelar"));
            c.cancelarSolicitud(id);
            menu();
            break;
        case 5:
            m.menuPila(this);
        case 6:
            l.mostrar(); // Mostrar la lista de rutas
            menu();
            break;
        case 7:    
            System.exit(0);
        default:
            JOptionPane.showMessageDialog(null, "Opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            menu();
    }
}

}


