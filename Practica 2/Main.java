import java.util.Scanner;

class Bus {

    int capacidad;
    int pasajeros;
    double costoPasaje = 1.50;

    // Constructor
    Bus(int capacidad){
        this.capacidad = capacidad;
        pasajeros = 0;
    }

    // a) Subir pasajeros
    void subirPasajeros(int x){
        if(pasajeros + x <= capacidad){
            pasajeros = pasajeros + x;
            System.out.println("Subieron " + x + " pasajeros");
        }else{
            System.out.println("No hay suficientes asientos");
        }
    }

    // b) Cobrar pasaje
    void cobrarPasaje(){
        double total = pasajeros * costoPasaje;
        System.out.println("Total cobrado: " + total + " Bs");
    }

    // c) Asientos disponibles
    void asientosDisponibles(){
        int disponibles = capacidad - pasajeros;
        System.out.println("Asientos disponibles: " + disponibles);
    }
}

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Bus bus = new Bus(20);

        System.out.print("Cuantos pasajeros subirán: ");
        int x = sc.nextInt();

        bus.subirPasajeros(x);
        bus.cobrarPasaje();
        bus.asientosDisponibles();
    }
}
