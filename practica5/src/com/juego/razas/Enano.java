package com.juego.razas;
//Implementación de la interfaz Razas
public class Enano implements Razas {
    @Override
    public int getFuerzaBase() { return 7; }
    @Override
    public int getInteligenciaBase() { return 4; }
    @Override
    public int getDestrezaBase() { return 4; }
    @Override
    public int getVidaBase() { return 110; }
    @Override
    public String getEspecialidad() { return "Resistencia: Ideal para Guerreros y Paladines."; }
}
