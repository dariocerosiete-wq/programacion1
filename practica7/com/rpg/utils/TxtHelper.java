package com.rpg.utils;

import com.rpg.handler.FormatoInvalidoException;
import com.rpg.handler.RPGDataException;
import com.rpg.model.Ciudad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {
    private static LoggerCustom loggerCustom;
    public TxtHelper(){
        this.loggerCustom = new LoggerCustom();
    }
    public static List<Ciudad> leerCiudades() throws FormatoInvalidoException {
        List<Ciudad> ciudades = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines (Paths.get("practica7//ficheros//ciudades.txt"));
            for (String linea: lineas) {
                String[] s = linea.split(";");
                Ciudad c = new Ciudad(
                        s[0],
                        Integer.parseInt(s[1]),
                        s[2],
                        Integer.parseInt(s[3])
                );
                ciudades.add(c);
            }
        } catch (Exception e) {
            loggerCustom.escribirLog("No se ha podido procesar el fichero: "+ e.getMessage());
            throw new FormatoInvalidoException("No se ha podido procesar el fichero");
        }
        return ciudades;
    }
}

