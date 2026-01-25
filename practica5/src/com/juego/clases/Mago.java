package com.juego.clases;

import com.juego.habilidades.Curacuerpo;
import com.juego.habilidades.Dañocuerpo;
import com.juego.habilidades.Dañodistancia;
//Uniendo la superclase clase
public class Mago extends Clases {
    @Override
    protected void inicializarHabilidades() {
        habilidades.add(new Dañocuerpo());
        habilidades.add(new Curacuerpo());
        habilidades.add(new Dañodistancia());
    }

    @Override
    public int getBonoFuerza() { return 0; }
    @Override
    public int getBonoInteligencia() { return 3; }
    @Override
    public int getBonoDestreza() { return 0; }
    @Override
    public int getVidaMaximaClase() { return 90; }

    @Override
    public String toString() { return "Mago"; }
}
