import java.util.Scanner;

class Servidor {

    String[] jugadores = new String[10];
    int[] diamantes = new int[10];
    int n = 0;

    // a) Agregar jugador
    void agregarJugador(String nombre, int d){
        if(n < 10){
            jugadores[n] = nombre;
            diamantes[n] = d;
            n++;
        }else{
            System.out.println("Servidor lleno");
        }
    }

    // b) Ver stacks de diamantes
    void verStacks(){
        for(int i=0;i<n;i++){
            int stacks = diamantes[i] / 64;
            System.out.println(jugadores[i] + " tiene " + stacks + " stacks");
        }
    }

    // c) Jugador con más diamantes
    void masDiamantes(){

        int max = diamantes[0];
        String nombre = jugadores[0];

        for(int i=1;i<n;i++){
            if(diamantes[i] > max){
                max = diamantes[i];
                nombre = jugadores[i];
            }
        }

        System.out.println("Jugador con más diamantes: " + nombre);
    }

    // d) Total de diamantes
    void totalDiamantes(){

        int suma = 0;

        for(int i=0;i<n;i++){
            suma = suma + diamantes[i];
        }

        System.out.println("Total de diamantes: " + suma);
    }
}

public class Main2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Servidor s = new Servidor();

        for(int i=0;i<3;i++){
            System.out.print("Nombre del jugador: ");
            String nombre = sc.next();

            System.out.print("Diamantes: ");
            int d = sc.nextInt();

            s.agregarJugador(nombre,d);
        }

        s.verStacks();
        s.masDiamantes();
        s.totalDiamantes();
    }
}
