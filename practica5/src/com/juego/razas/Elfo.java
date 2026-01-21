package com.juego.razas;
//Implementación de la interfaz Razas
public class Elfo implements Razas {
    @Override
    public int getFuerzaBase() { return 4; }
    @Override
    public int getInteligenciaBase() { return 6; }
    @Override
    public int getDestrezaBase() { return 7; }
    @Override
    public int getVidaBase() { return 90; }
    @Override
    public String getEspecialidad() { return "Agilidad: Ideal para Pícaros, Magos y Bardos."; }
}
