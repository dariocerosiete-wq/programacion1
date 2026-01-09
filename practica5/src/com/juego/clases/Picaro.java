package com.juego.clases;

import com.juego.habilidades.Habilidad;
//Atributos
public class Picaro extends Clases {
    private Integer fuerza;
    private Integer inteligencia;
    private Integer destreza;
    private Integer vida;
    private Habilidad habilidad;
//Contructor
    public Picaro (Integer fuerza, Integer inteligencia, Integer destreza, Integer vida, Habilidad habilidad) {
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vida = vida;
        this.habilidad = habilidad;
    }
}

