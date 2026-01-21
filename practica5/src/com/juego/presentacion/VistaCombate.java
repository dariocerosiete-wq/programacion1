package com.juego.presentacion;

import com.juego.modelo.Personaje;
import com.juego.habilidades.Habilidad;
import java.util.List;
//Metodos interfaz VistaCombate
public interface VistaCombate {
    void mostrarMenuPrincipal();
    int pedirOpcion();
    void mostrarMensaje(String mensaje);
    
    // Selección de personajes
    void mostrarListaPersonajes(List<Personaje> personajes);
    int pedirIndicePersonaje(String etiqueta);
    
    // Creación de personaje
    String pedirNombrePersonaje();
    int pedirOpcionRaza();
    int pedirOpcionClase();
    
    // Combate
    void mostrarEstadoCombate(Personaje p1, Personaje p2);
    void mostrarTurno(Personaje activo);
    int pedirHabilidad(List<Habilidad> habilidades);
    void mostrarResultadoHabilidad(String resultado);
    void mostrarGanador(Personaje ganador);
}
