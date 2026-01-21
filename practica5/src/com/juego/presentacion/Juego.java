package com.juego.presentacion;

public class Juego {
    public static void main(String[] args) {
        VistaCombate vista = new VistaCombateConsola();
        PresentadorCombate presentador = new PresentadorCombate(vista);
        presentador.iniciar();
    }
}
