package com.juego.presentacion;

import com.juego.modelo.GestorPersonajes;
import com.juego.modelo.Personaje;
import com.juego.modelo.Combate;
import com.juego.razas.*;
import com.juego.clases.*;
import com.juego.habilidades.Habilidad;


public class PresentadorCombate {
    private VistaCombate vista;
    private GestorPersonajes gestor;
//Presentar combate se va a la vista combate
    public PresentadorCombate(VistaCombate vista) {
        this.vista = vista;
        this.gestor = new GestorPersonajes();
    }
//Opciones para iniciar
    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenuPrincipal();
            int opcion = vista.pedirOpcion();
            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    crearPersonaje();
                    break;
                case 3:
                    salir = true;
                    vista.mostrarMensaje("Saliendo del juego...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        }
    }
//Esto hace referencia a la clase jugar
    private void jugar() {
        if (gestor.getPersonajes().size() < 2) {
            vista.mostrarMensaje("No hay suficientes personajes para combatir. Cree más personajes.");
            return;
        }

        vista.mostrarListaPersonajes(gestor.getPersonajes());
        
        int idx1 = vista.pedirIndicePersonaje("Luchador 1");
        Personaje p1 = gestor.getPersonaje(idx1);
        
        int idx2 = vista.pedirIndicePersonaje("Luchador 2");
        Personaje p2 = gestor.getPersonaje(idx2);

        if (p1 == null || p2 == null) {
            vista.mostrarMensaje("Selección de personajes inválida.");
            return;
        }
        
        if (p1 == p2) {
             vista.mostrarMensaje("No puedes elegir al mismo personaje dos veces.");
             return;
        }

        // Clonar personajes para no afectar a los originales en el gestor (opcional pero recomendado)
        // Por simplicidad usaremos los mismos, pero reseteando vida si fuera necesario.
        // En este diseño simple, si mueren, mueren en el gestor hasta reiniciar la app.
        // Para hacerlo bien, deberíamos implementar un método clone() o resetear vida antes del combate.
        // Asumiremos que se quiere persistencia del estado o reinicio manual.
        // Vamos a curarlos antes del combate para que sea justo.
        p1.curar(1000); 
        p2.curar(1000);

        Combate combate = new Combate(p1, p2);
        gestionarCombate(combate);
    }

    private void gestionarCombate(Combate combate) {
        Personaje activo = combate.getLuchador1();
        Personaje pasivo = combate.getLuchador2();

        while (!combate.combateTerminado()) {
            vista.mostrarEstadoCombate(combate.getLuchador1(), combate.getLuchador2());
            vista.mostrarTurno(activo);
            
            int idxHabilidad = vista.pedirHabilidad(activo.getHabilidades());
            if (idxHabilidad >= 0 && idxHabilidad < activo.getHabilidades().size()) {
                Habilidad habilidad = activo.getHabilidades().get(idxHabilidad);
                
                if (habilidad.puedeUsarse()) {
                    int valor = habilidad.usar(activo, pasivo);
                    // El mensaje de log ya se imprime en la habilidad, pero podríamos capturarlo aquí si cambiáramos el return.
                    // Por ahora confiamos en los System.out de las habilidades o añadimos feedback aquí.
                } else {
                    vista.mostrarMensaje("No quedan usos para esta habilidad. Pierdes el turno.");
                }
            } else {
                vista.mostrarMensaje("Habilidad inválida. Pierdes el turno.");
            }

            // Cambio de turno
            Personaje temp = activo;
            activo = pasivo;
            pasivo = temp;
        }

        vista.mostrarGanador(combate.getGanador());
    }

    private void crearPersonaje() {
        String nombre = vista.pedirNombrePersonaje();
        
        int opRaza = vista.pedirOpcionRaza();
        Razas raza = null;
        switch (opRaza) {
            case 1: raza = new Humano(); break;
            case 2: raza = new Elfo(); break;
            case 3: raza = new Enano(); break;
            default: vista.mostrarMensaje("Raza inválida. Se asignará Humano por defecto."); raza = new Humano();
        }

        int opClase = vista.pedirOpcionClase();
        Clases clase = null;
        switch (opClase) {
            case 1: clase = new Guerrero(); break;
            case 2: clase = new Paladin(); break;
            case 3: clase = new Monje(); break;
            case 4: clase = new Picaro(); break;
            case 5: clase = new Druida(); break;
            case 6: clase = new Sacerdote(); break;
            case 7: clase = new Mago(); break;
            case 8: clase = new Bardo(); break;
            default: vista.mostrarMensaje("Clase inválida. Se asignará Guerrero por defecto."); clase = new Guerrero();
        }

        gestor.agregarPersonaje(nombre, raza, clase);
        vista.mostrarMensaje("Personaje creado con éxito.");
    }
}
