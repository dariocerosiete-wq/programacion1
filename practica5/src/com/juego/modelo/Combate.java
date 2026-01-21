package com.juego.modelo;

import com.juego.habilidades.Habilidad;

public class Combate {
    Personaje p1;
    Personaje p2;

    public Combate (Personaje p1, Personaje p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciarCombate(){
        int cont = 0;
        while (this.p1.getVida() > 0 && this.p2.getVida() > 0){
            System.out.print("Turno" + cont);
            System.out.println(p1.mostrarDatos());
            System.out.println(p2.mostrarDatos());
            // this.efectoHabilidad(h1,h2); //FIXME: h1 and h2 are not defined.
            cont++;
        }
    }

    public int efectoHabilidad(Habilidad h1, Habilidad h2) {
        //TODO: Implementar la logica de efecto de habilidad
        return 0;
    }
}
