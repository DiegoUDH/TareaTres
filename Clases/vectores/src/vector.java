import java.lang.Math;

public class vector {
    private double magnitud;
    public vector(double magnitud) {
        this.magnitud = magnitud;
    }
    public double getMagnitud() {
        return magnitud;
    }
    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;
    }
    public double MagnitudResultante(double a, double b) {
        double anguloRadianes = Math.toRadians(45.0);
        double Resultante = Math.sqrt((a * a + b * b) + 2 * a * b * Math.cos(anguloRadianes));
        return Resultante;
    }
}
