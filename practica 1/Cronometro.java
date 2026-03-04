public class Cronometro {
    private long inicia;
    private long finaliza;

    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }

    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }

    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    public void detiene() {
        this.finaliza = System.currentTimeMillis();
    }

    public long lapseoDeTiempo() {
        return finaliza - inicia;
    }

    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        try {
            Thread.sleep(2000); // Simula 2 segundos de espera
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cronometro.detiene();
        System.out.println("Tiempo transcurrido: " + cronometro.lapseoDeTiempo() + " milisegundos");
    }
}
