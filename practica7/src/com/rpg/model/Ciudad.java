package com.rpg.model;

public class Ciudad {
    String nombre;
    Integer poblacion;
    String clima;
    Integer riesgo;
    public Ciudad (String nombre, Integer poblacion, String clima, Integer riesgo){
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public Integer getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(Integer riesgo) {
        this.riesgo = riesgo;
    }
}
