package com.rpg.model;

//Ciudad clase
public class Ciudad {
    //Atributos de ciudad
    String nombre;
    int poblacion;
    String clima;
    int riesgo;
    //Constructor de ciudad

    public Ciudad(String nombre, int poblacion, String clima, int riesgo) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.clima = clima;
        this.riesgo = riesgo;
    }

    //Getters y setters de iteM

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }
}
