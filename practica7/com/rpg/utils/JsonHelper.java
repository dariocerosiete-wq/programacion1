package com.rpg.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.Personaje;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonHelper {
    public static void leerPersonajes(){
        try{
            System.out.println("--Contenido Fichero Json Personaje--");
            Reader reader = Files.newBufferedReader(Paths.get("practica7/ficheros/personaje.json"));
            List<Personaje> listaPersonaje = new Gson().fromJson(
                    reader,
                    new TypeToken<List<Personaje>>(){}.getType()
            );
            for (Personaje p : listaPersonaje){
                System.out.println("Nombre del personaje: " + p.getNombre());
                System.out.println("Raza del personaje: " + p.getRaza());
                System.out.println("Nivel del personaje: " + p.getNivel());
                System.out.println("Id del equipo del personaje :" + p.getEquipo());
            }

        }catch (IOException e){
            System.out.println("No se ha podido abrir el archivo.");
        }


    }


}

