package com.juego.habilidades;

import com.juego.modelo.Personaje;

public abstract class HabilidadBase implements Habilidad {
    protected String nombre;
    protected int usosRestantes;
//Aquí ponemos el nombre de la habilidad y los usos que tenga la habilidad
    public HabilidadBase(String nombre, int usosMaximos) {
        this.nombre = nombre;
        this.usosRestantes = usosMaximos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getUsosRestantes() {
        return usosRestantes;
    }

    @Override
    public boolean puedeUsarse() {
        return usosRestantes > 0;
    }
    
    protected void consumirUso() {
        if (usosRestantes > 0) {
            usosRestantes--;
        }
    }
}
