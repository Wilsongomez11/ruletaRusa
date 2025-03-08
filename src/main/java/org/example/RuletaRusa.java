package org.example;

import java.util.ArrayList;
import java.util.Random;

public class RuletaRusa {
    private ArrayList<String> jugadores;
    private int posicionBala;
    private Random random;


    public RuletaRusa() {
        this.jugadores = new ArrayList<>();
        this.random = new Random();
        nuevoAleatorio();
    }


    public RuletaRusa(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
        this.random = new Random();
        nuevoAleatorio();
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public boolean disparar() {
        int posicionActual = random.nextInt(6);
        System.out.println("Posición de la recámara: " + posicionActual);

        if (posicionActual == posicionBala) {
            System.out.println("Perdiste ");
            return true;
        } else {
            System.out.println("suertudo ");
            nuevoAleatorio();
            return false;
        }
    }

    public void nuevoAleatorio() {
        this.posicionBala = random.nextInt(6);
        System.out.println("Nueva posición de la bala");
    }

    public void agregarJugador(String nombre) {
        this.jugadores.add(nombre);
    }
}


