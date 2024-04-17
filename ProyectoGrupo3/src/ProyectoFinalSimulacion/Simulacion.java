package ProyectoFinalSimulacion;

/**
 *
 * @author Grupo 3
 */

public class Simulacion {

    public static void main(String[] args) {
        
        //instancia para llamar al menu de las colas
        MenuCola c =  new MenuCola();
        c.menu();
        
        //instancia para llamar al menu de las pilas
        MenuPila p = new MenuPila();
        p.mostrarMenu();
        
    }
    
}
