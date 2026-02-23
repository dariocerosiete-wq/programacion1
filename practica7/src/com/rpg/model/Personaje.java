package com.rpg.model;

import java.util.Collections;
import java.util.List;

public class Personaje {
    String nombre;
    String raza;
    Integer nivel;
    List<Item> equipo;

    public Personaje(String nombre, String raza, Integer nivel, Item equipo) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.equipo = (List<Item>) equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public List<Item> getEquipo() {
        return equipo;
    }

    public void setEquipo(Item equipo) {
        this.equipo = (List<Item>) equipo;
    }
}
