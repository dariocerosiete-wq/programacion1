package com.juego.clases;

import com.juego.habilidades.Habilidad;
//Atributos
public class Bardo extends Clases {
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int vida;
    private Habilidad habilidad;
//Constructor
    public Bardo (int fuerza, int inteligencia, int destreza, int vida, Habilidad habilidad) {
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vida = vida;
        this.habilidad = habilidad;
    }
}

