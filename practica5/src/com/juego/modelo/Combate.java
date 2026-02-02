package com.juego.modelo;

//PASO 1: Creación clase
public class Combate{
    //PASO 2: Creación personajes
    private Personaje luchador1;
    private Personaje luchador2;

    public Combate(Personaje p1, Personaje p2){
        this.luchador1=p1;
        this.luchador2=p2;
    }
    //PASO 3: Llamar a los luchadores para que empiezen
    public Personaje getLuchador1(){
        return this.luchador1;
    }
    public Personaje getLuchador2() {
        return this.luchador2;
    }
    //PASO 4: Metodo INICIARRRRRRR
    public void iniciar(){
        iniciar();
    }
    //PASO 5: Saber quien ha llegado a 0
    public boolean combateTerminado() {
        return !luchador1.estaVivo() || !luchador2.estaVivo();
    }
    //PASO 6: GANADOR
    public Personaje getGanador() {
        if (luchador1.estaVivo() && !luchador2.estaVivo())
            return luchador1;
        if (luchador2.estaVivo() && !luchador1.estaVivo())
            return luchador2;
        return null;
    }
}
