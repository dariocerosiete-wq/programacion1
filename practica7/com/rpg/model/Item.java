package com.rpg.model;

import java.util.List;

public class Item {
    List<Personaje> id;
    String nombre;
    String tipo;
    Integer valor;

    public Item(List<Personaje> id, String nombre, String tipo, Integer valor) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    public List<Personaje> getId() {
        return id;
    }

    public void setId(List<Personaje> id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
