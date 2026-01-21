package com.juego.habilidades;

import com.juego.modelo.Personaje;

public class Curacuerpo extends HabilidadBase {

    public Curacuerpo() {
        super("Curación Divina", 3);
    }

    @Override
    public int usar(Personaje usuario, Personaje objetivo) {
        if (!puedeUsarse()) return 0;

        // AUMENTO DE CURACIÓN: Inteligencia * 4 + 20 base
        int curacion = (usuario.getInteligencia() * 4) + 20; 
        usuario.curar(curacion); 
        consumirUso();
        
        System.out.println("✨ " + usuario.getNombre() + " invoca luz divina y recupera " + curacion + " puntos de vida.");
        return curacion;
    }
}
