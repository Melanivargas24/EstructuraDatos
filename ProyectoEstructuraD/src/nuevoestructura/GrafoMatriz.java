/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoestructura;

class GrafoMatriz {
    private int[][] matrizAdyacencia;
    private String[] vertices;

    public GrafoMatriz(int numVertices) {
        matrizAdyacencia = new int[numVertices][numVertices];
        vertices = new String[numVertices];
    }

    public void agregarArista(Ruta ruta) {
        int indiceOrigen = obtenerIndiceVertice(ruta.origen);
        int indiceDestino = obtenerIndiceVertice(ruta.destino);
        matrizAdyacencia[indiceOrigen][indiceDestino] = ruta.peso;
    }

    private int obtenerIndiceVertice(String vertice) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == null || vertices[i].equals(vertice)) {
                vertices[i] = vertice;
                return i;
            }
        }
        return -1;
    }

    public void imprimirMatrizAdyacencia() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < vertices.length; i++) {
            System.out.print(vertices[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}