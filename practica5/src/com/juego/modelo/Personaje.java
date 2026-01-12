package com.juego.modelo;
import com.juego.clases.Clases;
import com.juego.razas.Razas;
//Clase
public class Personaje implements Razas {
    //Atributos
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int vida;
    private int defensa;
    private int velocidad;
    private int vidaMax;
    private Clases clases;
    private Razas razas;

//Contructor

    public Personaje( String nombre, int fuerza, int inteligencia, int destreza, int defensa, int velocidad, int vidaMax, Clases clases, Razas razas) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vida = vidaMax;
        this.vidaMax = vidaMax;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.clases = clases;
        this.razas = razas;
    }
//GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public Clases getClases() {
        return clases;
    }

    public void setClases(Clases clases) {
        this.clases = clases;
    }

    public Razas getRazas() {
        return razas;
    }

    public void setRazas(Razas razas) {
        this.razas = razas;
    }
}
