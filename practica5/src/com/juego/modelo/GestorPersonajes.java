package com.juego.modelo;

import com.juego.clases.*;
import com.juego.razas.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPersonajes {
    private List<Personaje> personajes;
//Un array list para guardar datos
    public GestorPersonajes() {
        this.personajes = new ArrayList<>();
        preCargarDatos();
    }
//Aquí tenemos dos personajes precargados
    private void preCargarDatos() {

        personajes.add(new Personaje("Aragorn", new Humano(), new Guerrero()));
        personajes.add(new Personaje("Legolas", new Elfo(), new Picaro()));
    }
//Para crear un personaje que te guste
    public void agregarPersonaje(String nombre, Razas raza, Clases clase) {
        personajes.add(new Personaje(nombre, raza, clase));
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public Personaje getPersonaje(int indice) {
        if (indice >= 0 && indice < personajes.size()) {
            return personajes.get(indice);
        }
        return null;
    }
}
