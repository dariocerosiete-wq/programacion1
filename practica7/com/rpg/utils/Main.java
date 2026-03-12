package com.rpg.utils;

import com.rpg.handler.RPGDataException;
import com.rpg.services.GestionMundo;

import java.util.List;

public class Main {
    public static void main(String[] args) throws RPGDataException {
        GestionMundo mundo = new GestionMundo();
        mundo.cargarTodo();
        mundo.crearPersonaje("Ango","Elfo",7, List.of("E01","P01"));
        mundo.guardarCambios();
    }
}
