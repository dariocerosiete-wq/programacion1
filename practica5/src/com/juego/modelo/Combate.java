package com.juego.modelo;

import com.juego.habilidades.Habilidad;

public class Combate {
    Personaje p1;
    Personaje p2;

    public Combate (Personaje p1, Personaje p2){
        this.p1=p1;
        this.p2=p2;
    }

    public Combate iniciarCombate(){
        int cont=0;
        while (this.p1.getVida()>0 && this.p2.getVida()>0){
            System.out.print("Turno" +cont);
            System.out.println(p1.mostrarDatos());
            System.out.println(p2.mostrarDatos());
            // TODO: Definir h1 y h2 antes de usar
            // this.efectoHabilidad(h1,h2);
            cont++;
        }
        return this;
    }

    public String mostrarDatos(){
        return "Combate entre " + p1.getNombre() + " y " + p2.getNombre();
    }

    int efectoHabilidad(Habilidad h1, Habilidad h2) {
        // TODO: Implementar lógica de habilidades
        return 0;
    }
}
