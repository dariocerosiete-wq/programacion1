package com.rpg.services;

import com.rpg.handler.*;
import com.rpg.model.Ciudad;
import com.rpg.model.Item;
import com.rpg.model.Personaje;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.LoggerCustom;
import com.rpg.utils.TxtHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestionMundo {
    private List<Ciudad> listaCiudades;
    private List<Personaje> listaPersonajes;
    private List<Item> listaItems;
    private HashMap<String,Item> mapaItems;
    private LoggerCustom loggerCustom;

    public GestionMundo(){
        this.loggerCustom = new LoggerCustom();
        this.mapaItems = new HashMap<>();
    }
    public void cargarTodo() throws RPGDataException{
        try{
            TxtHelper txtHelper = new TxtHelper();
            txtHelper.leerCiudades();
            JsonHelper jsonHelper = new JsonHelper();
            listaPersonajes = jsonHelper.leerPersonajes();
            listaCiudades = TxtHelper.leerCiudades();
            listaItems = jsonHelper.leerItems();
            for (Item item: listaItems){
                this.mapaItems.put(item.getId(), item);
            }
            for (int i = 0; i < listaPersonajes.size(); i++) {
                if (listaPersonajes.get(i).getNivel()<0){
                    throw new DatoInvalidoException("Dato Invalido");
                }
            }
        }
        catch (DatoInvalidoException e){
            System.err.println("Nivel Invalido");
            loggerCustom.escribirLog(e.getMessage());
        }
    }

    public void analizarBiomasPersonajes() throws RPGDataException {
        try {
            JsonHelper jsonHelper = new JsonHelper();
            listaPersonajes = jsonHelper.leerPersonajes();
            listaCiudades = TxtHelper.leerCiudades();
            listaItems = jsonHelper.leerItems();

            listaPersonajes.removeIf(p -> p.getRaza().equalsIgnoreCase("Enano") &&
                    listaCiudades.stream().anyMatch(c -> c.getClima().equalsIgnoreCase("Desertico")));

            listaItems.removeIf(item -> item.getTipo().equalsIgnoreCase("HIELO"));

            for (Ciudad c : listaCiudades) {
                if (c.getClima().equalsIgnoreCase("Volcanica")) {
                    for (Item i : listaItems) {
                        if (i.getNombre().toUpperCase().contains("HIELO")) {
                            throw new RPGDataException("¡Item de HIELO en zona Volcánica!");
                        }
                    }
                }
            }

            System.out.println("Mundo validado.");

        } catch (ValidadorBiomas e) {
            loggerCustom.escribirLog("ERROR: " + e.getMessage());
            throw new RPGDataException("Fallo en la carga.");
        }
    }



    public void guardarCambios() throws FormatoInvalidoException {
        JsonHelper jsonHelper = new JsonHelper();
        jsonHelper.escribirJSON("practica7/ficheros/personaje.json", listaPersonajes);
    }
    public List<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public List<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public void setListaCiudades(List<Ciudad> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public void setListaPersonajes(List<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
    }


}
