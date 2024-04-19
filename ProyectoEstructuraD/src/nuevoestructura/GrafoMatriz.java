package nuevoestructura;

/**
 * Esta clase representa un grafo implementado mediante matriz de adyacencia.
 * Los vértices del grafo se almacenan en un arreglo de cadenas, mientras que
 * las aristas se representan mediante una matriz de adyacencia.
 */
class GrafoMatriz {
    private int[][] matrizAdyacencia;
    private String[] vertices;

    /**
     * Constructor de la clase GrafoMatriz.
     * Inicializa la matriz de adyacencia y el arreglo de vértices.
     * @param numVertices El número de vértices del grafo.
     */
    public GrafoMatriz(int numVertices) {
        matrizAdyacencia = new int[numVertices][numVertices];
        vertices = new String[numVertices];
    }

    /**
     * Agrega una arista al grafo entre dos vértices dados.
     * @param ruta La ruta que representa la arista a agregar.
     */
    public void agregarArista(Ruta ruta) {
        int indiceOrigen = obtenerIndiceVertice(ruta.origen);
        int indiceDestino = obtenerIndiceVertice(ruta.destino);
        matrizAdyacencia[indiceOrigen][indiceDestino] = ruta.peso;
    }

    /**
     * Obtiene el índice de un vértice en el arreglo de vértices.
     * Si el vértice no existe en el arreglo, lo agrega y retorna su índice.
     * @param vertice El vértice a buscar.
     * @return El índice del vértice en el arreglo de vértices.
     */
    private int obtenerIndiceVertice(String vertice) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == null || vertices[i].equals(vertice)) {
                vertices[i] = vertice;
                return i;
            }
        }
        return -1;
    }

    /**
     * Imprime la matriz de adyacencia del grafo.
     * La matriz se imprime mostrando los vértices en la primera fila y columna.
     */
    public void imprimirMatrizAdyacencia() {
        System.out.println("Matriz de Adyacencia:");
        // Imprimir los nombres de los vértices en la primera fila
        for (int i = 0; i < vertices.length; i++) {
            System.out.print(vertices[i] + " ");
        }
        System.out.println();
        // Imprimir la matriz de adyacencia
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}
