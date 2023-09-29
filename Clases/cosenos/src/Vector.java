import java.lang.Math;
public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double calcularAngulo(Vector v) {
        double productoPunto = this.x * v.getX() + this.y * v.getY();
        double magnitudA = Math.sqrt(this.x * this.x + this.y * this.y);
        double magnitudB = Math.sqrt(v.getX() * v.getX() + v.getY() * v.getY());
        double cosenoTeta = productoPunto / (magnitudA * magnitudB);
        double radianes = Math.acos(cosenoTeta);
        return Math.toDegrees(radianes);
    }
    public double calcularMagnitud(Vector v) {
        double anguloRadianes = Math.toRadians(calcularAngulo(v));
        double magnitudA = Math.sqrt(this.x * this.x + this.y * this.y);
        double magnitudB = Math.sqrt(v.getX() * v.getX() + v.getY() * v.getY());
        double magnitudResultante = Math.sqrt(magnitudA * magnitudA + magnitudB *
                magnitudB - 2 * magnitudA * magnitudB * Math.cos(anguloRadianes));
        return magnitudResultante;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
