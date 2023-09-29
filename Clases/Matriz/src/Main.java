public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();

        // Establecer valores en la matriz
        matriz.establecerValor(0, 0, 2);
        matriz.establecerValor(0, 1, 0);
        matriz.establecerValor(0, 2, 0);
        matriz.establecerValor(1, 0, 0);
        matriz.establecerValor(1, 1, 3);
        matriz.establecerValor(1, 2, 0);
        matriz.establecerValor(2, 0, 1);
        matriz.establecerValor(2, 1, -7);
        matriz.establecerValor(2, 2, 1);

        System.out.println("Matriz:");
        matriz.imprimirMatriz();
    }
}