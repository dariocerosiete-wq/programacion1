package com.rpg.utils;

import com.rpg.model.Ciudad;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {
    public TxtHelper(){

    }
    //Metodo leer txt
    public static void leerTxt() {
        try {
            List<String> lineas = Files.readAllLines(Paths.get("practica7\\ficheros\\ciudades.txt"));
            List<Ciudad> listaCiudades = new ArrayList<>();
            System.out.println("-Contenido del fichero ciudades-");
            //Para remover la primera linea
            lineas.remove(0);
            for (String linea: lineas) {
                System.out.println(linea);
                String[] s=linea.split(";");
                Ciudad c= new Ciudad(
                        s[0],
                        Integer.parseInt(s[1]),
                        s[2],
                        Integer.parseInt(s[3])
                );
                listaCiudades.add(c);
                System.out.println("Nombre: " +c.getNombre());
                System.out.println("Población: " +c.getPoblacion());
                System.out.println("Clima: " +c.getClima());
                System.out.println("Riesgo: " +c.getRiesgo());
                System.out.println("Total de lineas: " +lineas.size());
            }
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
    }
}


