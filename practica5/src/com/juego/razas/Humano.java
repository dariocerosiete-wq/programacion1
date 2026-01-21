package com.juego.razas;
//Implementación de la interfaz Razas
public class Humano implements Razas {
    @Override
    public int getFuerzaBase() { return 5; }
    @Override
    public int getInteligenciaBase() { return 5; }
    @Override
    public int getDestrezaBase() { return 5; }
    @Override
    public int getVidaBase() { return 100; }
    @Override
    public String getEspecialidad() { return "Equilibrado: Versátil para cualquier clase"; }
}
