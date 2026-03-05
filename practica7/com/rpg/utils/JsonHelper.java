package com.rpg.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.Item;
import com.rpg.model.Personaje;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonHelper {
    //Metodo leer personaje
    public static void leerPersonajes() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get("practica7\\ficheros\\personaje.json"));
            System.out.println("-Contenido del fichero Json (Personaje)-");
            List<Personaje> lista = new Gson().fromJson(
                    reader,
                    new TypeToken<List<Personaje>>() {
                    }.getType()
            );
            for (Personaje p : lista) {
                System.out.println("Nombre personajes: " + p.getNombre());
                System.out.println("Raza personaje: " + p.getRaza());
                System.out.println("Nivel personaje: " + p.getNivel());
                System.out.println("Equipo personaje: " + p.getEquipo());

            }
        } catch (IOException e) {
            System.out.println("No se ha podido leer el fichero");
        }
    }

    public static void leerItems() {
        try {
            Reader reade = Files.newBufferedReader(Paths.get("practica7\\ficheros\\items.json"));
            System.out.println("-Contenido del fichero Json (Item)-");
            List<Item> lista = new Gson().fromJson(
                    reade,
                    new TypeToken<List<Item>>() {
                    }.getType()
            );
            for (Item i : lista) {
                System.out.println("Id: " + i.getId());
                System.out.println("Nombre: " + i.getNombre());
                System.out.println("Tipo: " + i.getTipo());
                System.out.println("Valor: " + i.getValor());

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

