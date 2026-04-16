public class Main {

    // 🔹 CLASE BASE
    static class CriaturaMarina {
        protected String nombre;

        public CriaturaMarina() {
            this.nombre = "sin nombre";
        }

        public CriaturaMarina(String nombre) {
            this.nombre = nombre;
        }

        public void metodo1() {
            System.out.println("criatura 1");
        }

        public void metodo2() {
            System.out.println("criatura 2");
        }

        public String toString() {
            return "habita en el oceano: " + nombre;
        }
    }

    // 🔹 MAMIFERO
    static class Mamifero extends CriaturaMarina {
        public Mamifero(String nombre) {
            super(nombre);
        }

        public void metodo1() {
            System.out.println("sangre caliente");
        }
    }

    // 🔹 DELFIN
    static class Delfin extends Mamifero {
        public Delfin(String nombre) {
            super(nombre);
        }

        public void metodo1() {
            System.out.println("sopla burbujas");
            super.metodo1(); // inciso c
        }

        public String toString() {
            return "delfin: " + nombre;
        }
    }

    // 🔹 CALAMAR
    static class Calamar extends CriaturaMarina {
        public Calamar(String nombre) {
            super(nombre);
        }

        public void metodo2() {
            System.out.println("tentaculos");
        }

        public String toString() {
            return "calamar: " + nombre;
        }
    }

    // 🔹 BALLENA
    static class Ballena extends Mamifero {
        public Ballena(String nombre) {
            super(nombre);
        }

        public void metodo1() {
            System.out.println("canta canciones");
        }

        public void nadar() {
            System.out.println("nada profundamente");
        }

        public String toString() {
            return "ballena: " + nombre;
        }
    }

    // 🔹 MAIN
    public static void main(String[] args) {

        System.out.println("========== INCISO a ==========");
        CriaturaMarina[] elementos = {
                new Calamar("Calamardo"),
                new Delfin("Flipper"),
                new Mamifero("MamiferoX"),
                new Ballena("Moby"),
                new CriaturaMarina("General")
        };

        for (int i = 0; i < elementos.length; i++) {
            elementos[i].metodo2();
            System.out.println(elementos[i]);
            elementos[i].metodo1();
            System.out.println();
        }

        System.out.println("  INCISO b  ");
        Ballena b = new Ballena("Azul");
        System.out.println(b);
        b.metodo1();
        b.nadar();

        System.out.println("  INCISO c ");
        Delfin d = new Delfin("Flipper");
        d.metodo1();

        System.out.println(" INCISO d ");
        CriaturaMarina cm = new CriaturaMarina("Nemo");
        System.out.println(cm);

        System.out.println(" INCISO e ");
        System.out.println("Todos los objetos ahora usan nombres:");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
    }
}
