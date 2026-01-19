package com.juego.modelo;
import com.juego.clases.Clases;
//Clase
public abstract class Personaje {
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


//Contructor

    public Personaje( String nombre, int fuerza, int inteligencia, int destreza, int defensa, int velocidad, int vidaMax, Clases clases) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vida = vidaMax;
        this.vidaMax = vidaMax;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.clases = clases;

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

    public String mostrarDatos() {
        return null;
    }

}
