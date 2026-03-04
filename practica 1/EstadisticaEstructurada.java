import java.util.Arrays;

public class EstadisticaEstructurada {
    // Método estático para promedio
    public static double promedio(double[] valores) {
        double suma = 0;
        for (double val : valores) {
            suma += val;
        }
        return suma / valores.length;
    }

    // Método estático para desviación estándar
    public static double desviacion(double[] valores) {
        double prom = promedio(valores);
        double sumaCuadrados = 0;
        for (double val : valores) {
            sumaCuadrados += Math.pow(val - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / valores.length);
    }

    // Main para prueba 
    public static void main(String[] args) {
        double[] valores = {1.9, 2.5, 3.7, 2.1, 3, 4, 5, 2};
        System.out.println("Promedio: " + promedio(valores));
        System.out.println("Desviación estándar: " + desviacion(valores));
    }
}
