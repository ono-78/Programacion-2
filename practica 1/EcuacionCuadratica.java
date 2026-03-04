import java.lang.Math;

public class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método getDiscriminante()
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    // Método getRoot1()
    public double getRoot1() {
        double disc = getDiscriminante();
        if (disc < 0) {
            throw new IllegalArgumentException("Discriminante negativo, no hay raíces reales.");
        }
        return (-b + Math.sqrt(disc)) / (2 * a);
    }

    // Método getRoot2()
    public double getRoot2() {
        double disc = getDiscriminante();
        if (disc < 0) {
            throw new IllegalArgumentException("Discriminante negativo, no hay raíces reales.");
        }
        return (-b - Math.sqrt(disc)) / (2 * a);
    }

    // Main para prueba
    public static void main(String[] args) {
        EcuacionCuadratica eq = new EcuacionCuadratica(1, 3, 1);
        System.out.println("Discriminante: " + eq.getDiscriminante());
        try {
            System.out.println("Raíz 1: " + eq.getRoot1());
            System.out.println("Raíz 2: " + eq.getRoot2());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
