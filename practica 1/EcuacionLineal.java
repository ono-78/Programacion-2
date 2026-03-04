public class EcuacionLineal {
    private double a, b, c, d, e, f;

    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    // Main para prueba
    public static void main(String[] args) {
        EcuacionLineal eq = new EcuacionLineal(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        if (eq.isSolvable()) {
            System.out.println("x = " + eq.getX());
            System.out.println("y = " + eq.getY());
        } else {
            System.out.println("El sistema no tiene solución.");
        }
    }
}
