package com.juego.habilidades;

import com.juego.modelo.Personaje;

public class Dañocuerpo extends HabilidadBase {

    public Dañocuerpo() {
        super("Ataque Cuerpo a Cuerpo", 5);
    }

    @Override
    public int usar(Personaje usuario, Personaje objetivo) {
        if (!puedeUsarse()) return 0;
        
        // AUMENTO DE DAÑO: Fuerza * 3
        int dano = (usuario.getFuerza() * 5) - objetivo.getDefensa();
        if (dano < 6) dano = 6; // Daño mínimo garantizado
        
        objetivo.recibirDano(dano);
        consumirUso();
        
        System.out.println("⚔️ " + usuario.getNombre() + " golpea brutalmente a " + objetivo.getNombre() + " causando " + dano + " de daño!");
        return -dano;
    }
}
