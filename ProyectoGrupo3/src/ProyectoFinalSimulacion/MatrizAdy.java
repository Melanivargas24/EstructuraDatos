/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinalSimulacion;

/**
 *
 * @author XPC
 */
public class MatrizAdy {
    private int n;
    private int [][] matriz;

    public MatrizAdy(int n) {
        this.n=n;
        matriz = new int [this.n][this.n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j]=0;
            }
        }
    }
    
    public void agregar(int i, int j){
        matriz[i][j] += 1;
        
    }
    public void remover(int i, int j){
        if (matriz[i][j]<0) {
            matriz[i][j] -= 1;
            
        }
    }
    public void imprimirMatrizAdy(){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.print(matriz[i][j] + "");
           }
           System.out.println("");
       }
        
    }
    
}



