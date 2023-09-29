public class Matriz {
    private int[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new int[filas][columnas];
    }

    public void establecerValor(int fila, int columna, int valor) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            matriz[fila][columna] = valor;
        } else {
            System.out.println("Fila o columna fuera de rango.");
        }
    }

    public int obtenerValor(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return matriz[fila][columna];
        } else {
            System.out.println("Fila o columna fuera de rango.");
            return -1;
        }
    }

    public Matriz sumar(Matriz otraMatriz) {
        if (otraMatriz.filas != filas || otraMatriz.columnas != columnas) {
            System.out.println("No se pueden sumar matrices de tamaños diferentes.");
            return null;
        }

        Matriz resultado = new Matriz(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.establecerValor(i, j, matriz[i][j] + otraMatriz.obtenerValor(i, j));
            }
        }

        return resultado;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz matriz1 = new Matriz(2, 3);
        Matriz matriz2 = new Matriz(2, 3);

        // Llenar las matrices con valores de ejemplo
        for (int i = 0; i < matriz1.filas; i++) {
            for (int j = 0; j < matriz1.columnas; j++) {
                matriz1.establecerValor(i, j, i + j);
                matriz2.establecerValor(i, j, i - j);
            }
        }

        System.out.println("Matriz 1:");
        matriz1.imprimirMatriz();

        System.out.println("\nMatriz 2:");
        matriz2.imprimirMatriz();

        Matriz suma = matriz1.sumar(matriz2);

        if (suma != null) {
            System.out.println("\nMatriz Resultante (Suma de Matriz 1 y Matriz 2):");
            suma.imprimirMatriz();
        }
    }
}
