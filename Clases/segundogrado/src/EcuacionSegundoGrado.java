public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    // Constructor
    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Método calcular el discriminante
    public double calcularDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    // Método  calcular las soluciones
    public double calcularSoluciones() {
        double discriminante = calcularDiscriminante();
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        return x1;
        }
    public double calcularSoluciones2(){
        double discriminante = calcularDiscriminante();
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return x2;
    }
    public void resul(){
        System.out.println("x1 = "+calcularSoluciones());
        System.out.println("x2 = "+calcularSoluciones2());
    }
}



