import java.util.Arrays;

public class Estadistica {
    private double[] valores;

    // Constructor
    public Estadistica(double[] valores) {
        this.valores = valores;
    }

    // Método promedio()
    public double promedio() {
        double suma = 0;
        for (double val : valores) {
            suma += val;
        }
        return suma / valores.length;
    }

    // Método desviacion()
    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (double val : valores) {
            sumaCuadrados += Math.pow(val - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / valores.length);
    }

    // Main para prueba 
    public static void main(String[] args) {
        double[] valores = {1.9, 2.5, 3.7, 2.1, 3, 4, 5, 2};
        Estadistica est = new Estadistica(valores);
        System.out.println("Promedio: " + est.promedio());
        System.out.println("Desviación estándar: " + est.desviacion());
    }
}
