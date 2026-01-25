package com.juego.modelo;

import com.juego.clases.Clases;
import com.juego.razas.Razas;
import com.juego.habilidades.Habilidad;
import java.util.List;

public class Personaje {
    private String nombre;
    private Razas raza;
    private Clases clase;
    
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int vida;
    private int vidaMax;

    public Personaje(String nombre, Razas raza, Clases clase) {
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;
        calcularEstadisticas();
    }
//Calculamos las estadisticas según el personaje
    private void calcularEstadisticas() {
        this.fuerza = raza.getFuerzaBase() + clase.getBonoFuerza();
        this.inteligencia = raza.getInteligenciaBase() + clase.getBonoInteligencia();
        this.destreza = raza.getDestrezaBase() + clase.getBonoDestreza();
        //La vida depende de que clase escogas
        this.vidaMax = clase.getVidaMaximaClase();
        this.vida = this.vidaMax;
    }
//Recibir daño al oponente y por eso se resta vida
    public void recibirDano(int cantidad) {
        this.vida -= cantidad;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
//Curación personaje
    public void curar(int cantidad) {
        this.vida += cantidad;
        if (this.vida > this.vidaMax) {
            this.vida = this.vidaMax;
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
//Lista de habilidades para guardar las habilidades
    public List<Habilidad> getHabilidades() {
        return clase.getHabilidades();
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getFuerza() { return fuerza; }
    public int getInteligencia() { return inteligencia; }
    public int getDestreza() { return destreza; }
    public int getVida() { return vida; }
    public int getVidaMax() { return vidaMax; }
    // Simplificación: defensa 0 o basada en destreza si se requiere
    public int getDefensa() { return 0; }
    //Mostar los datos depende del personaje o elecciones para crearte un nuevo personaje
    public String mostrarDatos() {
        return String.format("%s (%s %s) - HP: %d/%d - FUE: %d INT: %d DES: %d", 
            nombre, raza.getClass().getSimpleName(), clase.toString(), vida, vidaMax, fuerza, inteligencia, destreza);
    }
}
