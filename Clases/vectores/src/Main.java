public class Main {
    public static void main(String[] args) {
        double magnitudA = 3.0;
        double magnitudB = 4.0;

        vector vectorA = new vector(magnitudA);
        vector vectorB = new vector(magnitudB);

        System.out.println("Magnitud de Vector A: " + vectorA.getMagnitud());
        System.out.println("Magnitud de Vector B: " + vectorB.getMagnitud());

        double magnitudResultante = vectorA.MagnitudResultante(magnitudA, magnitudB);
        System.out.println("Magnitud Resultante: " + magnitudResultante);
    }
}