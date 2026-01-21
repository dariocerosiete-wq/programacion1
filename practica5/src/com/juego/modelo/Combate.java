package com.juego.modelo;

public class Combate {
    private Personaje luchador1;
    private Personaje luchador2;
//Maximo tiene que jugar dos jugadores que los vamos a llamar luchador1 y luchador2
    public Combate(Personaje p1, Personaje p2) {
        this.luchador1 = p1;
        this.luchador2 = p2;
    }

    public Personaje getLuchador1() {
        return luchador1;
    }

    public Personaje getLuchador2() {
        return luchador2;
    }
    //Aquí preguntamos si siguen vivos
    public boolean combateTerminado() {
        return !luchador1.estaVivo() || !luchador2.estaVivo();
    }
    //Aquí sabemos que personaje a ganado
    public Personaje getGanador() {
        if (luchador1.estaVivo() && !luchador2.estaVivo()) return luchador1;
        if (luchador2.estaVivo() && !luchador1.estaVivo()) return luchador2;
        return null;
    }
}
