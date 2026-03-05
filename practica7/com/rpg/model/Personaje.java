package com.rpg.model;
import java.util.List;

//Atributos de personaje
public class Personaje {
    public String nombre;
    public String raza;
    public Integer nivel;
    public List<Item> equipo;
    //Constructor de personajes
    public Personaje(String nombre, String raza, Integer nivel, Item equipo) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.equipo = (List<Item>) equipo;
    }
    //Getters y setters de personajes
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

