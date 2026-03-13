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
        List<Personaje> personajeParaBorrar = new ArrayList<>();
        try {
            JsonHelper jsonHelper = new JsonHelper();
            listaPersonajes = jsonHelper.leerPersonajes();
            listaCiudades = TxtHelper.leerCiudades();
            listaItems = jsonHelper.leerItems();

            for (Personaje p : listaPersonajes) {
                for (Ciudad c : listaCiudades) {
                    if (p.getRaza().equalsIgnoreCase("Enano") && c.getClima().equalsIgnoreCase("Desertico")) {
                        loggerCustom.escribirLog("ERROR: Enano " + p.getNombre() + " no puede estar en clima Desertico (Ciudad: " + c.getNombre() + ")");
                        personajeParaBorrar.add(p);
                        throw new ValidadorBiomas("Un Enano no puede aparecer en un clima Desertico.");
                    }
                }
            }

            for (Ciudad c : listaCiudades) {
                if (c.getClima().equalsIgnoreCase("Volcanica")) {
                    for (Item i : listaItems) {
                        if (i.getTipo().equalsIgnoreCase("HIELO") || i.getNombre().equalsIgnoreCase("HIELO")) {
                            loggerCustom.escribirLog("ERROR: El item " + i.getNombre() + " (HIELO) no puede existir en ciudad Volcanica: " + c.getNombre());
                            throw new ValidadorBiomas("Un item de HIELO no puede existir en una ciudad Volcanica.");
                        }
                    }
                }
            }

            System.out.println("Mundo cargado y validado correctamente.");

        } catch (ValidadorBiomas e) {
            System.err.println("Fallo de validación: " + e.getMessage());
            throw new RPGDataException("Carga abortada por regla Biomas.");
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
