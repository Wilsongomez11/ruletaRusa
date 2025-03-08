package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaJugadores = new ArrayList<>();

        System.out.print("Ingresq el número de jugadores: ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            listaJugadores.add(nombre);
        }

        RuletaRusa ruleta = new RuletaRusa(listaJugadores);
        boolean juegoTerminado = false;
        int turno = 0;

        while (!juegoTerminado) {
            System.out.println("\nTurno de " + listaJugadores.get(turno) + "...");
            System.out.println("dale al enter para disparar");
            scanner.nextLine();

            juegoTerminado = ruleta.disparar();
            if (juegoTerminado) {
                System.out.println("moriste " + listaJugadores.get(turno) + ", has perdido");
            } else {
                turno = (turno + 1) % listaJugadores.size();
            }
        }
        scanner.close();
    }
}
