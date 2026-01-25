package com.juego.habilidades;

import com.juego.modelo.Personaje;
//Metodos de la interfaz habilidad de los personajes
public interface Habilidad {
    String getNombre();
    int getUsosRestantes();
    int usar(Personaje usuario, Personaje objetivo);
    boolean puedeUsarse();
}
