package com.juego.clases;

import com.juego.habilidades.Habilidad;
import java.util.List;
import java.util.ArrayList;

public abstract class Clases {
    protected List<Habilidad> habilidades;

    public Clases() {
        this.habilidades = new ArrayList<>();
        inicializarHabilidades();
    }

    protected abstract void inicializarHabilidades();

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    // Bonificaciones de estadísticas (Tabla A)
    public abstract int getBonoFuerza();
    public abstract int getBonoInteligencia();
    public abstract int getBonoDestreza();
    public abstract int getVidaMaximaClase(); // Tabla A define la vida máxima por clase
}
