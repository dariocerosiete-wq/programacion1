package com.juego.habilidades;

import com.juego.modelo.Personaje;

public class Dañodistancia extends HabilidadBase {

    public Dañodistancia() {
        super("Ataque a Distancia (ULTIMATE)", 1);
    }

    @Override
    public int usar(Personaje usuario, Personaje objetivo) {
        if (!puedeUsarse()) return 0;

        // AUMENTO DE DAÑO: (Destreza + Inteligencia) * 5
        int dano = (usuario.getDestreza() + usuario.getInteligencia()) * 10;
        
        objetivo.recibirDano(dano);
        consumirUso();
        
        System.out.println("🔥 " + usuario.getNombre() + " lanza su ataque DEFINITIVO a " + objetivo.getNombre() + " causando " + dano + " de daño masivo!");
        return -dano;
    }
}
