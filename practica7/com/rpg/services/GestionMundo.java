package com.rpg.services;

import com.rpg.handler.DatoInvalidoException;
import com.rpg.handler.FormatoInvalidoException;
import com.rpg.handler.RPGDataException;
import com.rpg.handler.RecursoNoEncontradoException;
import com.rpg.model.Ciudad;
import com.rpg.model.Item;
import com.rpg.model.Personaje;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.LoggerCustom;
import com.rpg.utils.TxtHelper;

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
    public void crearPersonaje(String nombre, String raza, int nivel, List<String> idsItems) throws RPGDataException {
        try{

            for (String id : idsItems) {
                if (!mapaItems.containsKey(id)) {
                    loggerCustom.escribirLog("El Item no Existe");
                    throw new RecursoNoEncontradoException("El Item no Existe");
                }
            }

            Personaje personaje = new Personaje(nombre, raza, nivel, idsItems);
            listaPersonajes.add(personaje);

        }
        catch (Exception e){
            loggerCustom.escribirLog("No se ha podido crear el personaje "+e.getMessage());
        }
    }
    public void guardarCambios() throws FormatoInvalidoException {
        JsonHelper jsonHelper = new JsonHelper();
        jsonHelper.escribirJSON("practica7/ficheros/personajes.json", listaPersonajes);
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
