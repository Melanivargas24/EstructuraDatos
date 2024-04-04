
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varga
 */
public class Menu {

    int op = 0;
    Cola c = new Cola();

    public void menu() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "\t***Menú principal***\n"
                + "\n1= Realizar una solicitud"
                + "\n2= Atender solicitud"
                + "\n3= Solicitudes pendientes"
                + "\n4= Cancelar una solicitud"
                + "\n5= Salir"
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
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                menu();

        }
    }
    
}
