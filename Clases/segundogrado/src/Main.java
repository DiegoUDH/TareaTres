public class Main {
    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1, -3, 2);

        // Calcular el discriminante
        double discriminante = ecuacion.calcularDiscriminante();
        System.out.println("Discriminante: " + discriminante);

        ecuacion.resul();
    }
}
