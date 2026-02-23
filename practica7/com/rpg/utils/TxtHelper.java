package com.rpg.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TxtHelper {
public TxtHelper(){

}
    public static void main(String[] args) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get("practica7\\ficheros\\ciudades.txt"));
            for (String linea: lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
    }
    }


