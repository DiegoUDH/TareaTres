public class Main {
    public static void main(String[] args) {
        Vector vectorA = new Vector(3.0, 4.0);
        Vector vectorB = new Vector(1.0, 2.0);

        System.out.println("Vector A: " + vectorA);
        System.out.println("Vector B: " + vectorB);

        double angulo = vectorA.calcularAngulo(vectorB);
        System.out.println("Ángulo entre Vector A y Vector B: " + angulo + " grados");

        double magnitudResultante = vectorA.calcularMagnitud(vectorB);
        System.out.println("Magnitud Resultante: " + magnitudResultante);
    }
}