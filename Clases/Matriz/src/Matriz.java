public class Matriz {
    private int[][] matriz;

    public Matriz() {
        matriz = new int[3][3];
    }

    public void establecerValor(int fila, int columna, int valor) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
            matriz[fila][columna] = valor;
        } else {
            System.out.println("Fila o columna fuera de rango.");
        }
    }
    public void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
