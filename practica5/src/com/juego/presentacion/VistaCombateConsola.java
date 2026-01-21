package com.juego.presentacion;

import com.juego.modelo.Personaje;
import com.juego.habilidades.Habilidad;
import java.util.List;
import java.util.Scanner;

public class VistaCombateConsola implements VistaCombate {
    private Scanner scanner;

    public VistaCombateConsola() {
        this.scanner = new Scanner(System.in);
    }

    // Helper para imprimir un título centrado con separadores
    private void imprimirTitulo(String titulo) {
        int ancho = 60;
        String separador = "-".repeat(ancho);
        System.out.println("\n" + separador);
        int paddingSize = (ancho - titulo.length() - 2) / 2;
        String padding = " ".repeat(Math.max(0, paddingSize));
        System.out.println(padding + " " + titulo.toUpperCase() + " " + padding);
        System.out.println(separador);
    }
//Mostrando el menú principal
    @Override
    public void mostrarMenuPrincipal() {
        imprimirTitulo("Menú Principal");
        System.out.println("  1. Jugar");
        System.out.println("  2. Crear Personaje");
        System.out.println("  3. Salir");
        System.out.print("\n> Seleccione una opción: ");
    }

    @Override
    public int pedirOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("! Error: Por favor, introduzca un número válido.");
            return -1;
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println("\n>> " + mensaje);
    }

    @Override
    public void mostrarListaPersonajes(List<Personaje> personajes) {
        imprimirTitulo("Selección de Luchadores");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println("  " + (i + 1) + ") " + personajes.get(i).mostrarDatos());
        }
    }

    @Override
    public int pedirIndicePersonaje(String etiqueta) {
        System.out.print("> Elige al " + etiqueta + " (número): ");
        return pedirOpcion() - 1;
    }
//Que el usuario ponga su nombre para crear personaje
    @Override
    public String pedirNombrePersonaje() {
        System.out.print("> Introduce el nombre para tu nuevo personaje: ");
        return scanner.nextLine();
    }
//Opcion elección raza
    @Override
    public int pedirOpcionRaza() {
        imprimirTitulo("Elige una Raza");
        System.out.println("  1. Humano");
        System.out.println("  2. Elfo");
        System.out.println("  3. Enano");
        System.out.print("\n> Opción: ");
        return pedirOpcion();
    }
//Opciones para el usuario
    @Override
    public int pedirOpcionClase() {
        imprimirTitulo("Elige una Clase");
        System.out.println("  1. Guerrero   | 5. Druida");
        System.out.println("  2. Paladín    | 6. Sacerdote");
        System.out.println("  3. Monje      | 7. Mago");
        System.out.println("  4. Pícaro     | 8. Bardo");
        System.out.print("\n> Opción: ");
        return pedirOpcion();
    }
//Para curar vida jugador
    private String generarBarraVida(int actual, int max) {
        if (actual < 0) actual = 0;
        float porcentaje = (float) actual / max;
        int longitudBarra = 20;
        int caracteresLlenos = (int) (longitudBarra * porcentaje);
        
        return "[" + "■".repeat(caracteresLlenos) + " ".repeat(longitudBarra - caracteresLlenos) + "]";
    }

    @Override
    public void mostrarEstadoCombate(Personaje p1, Personaje p2) {
        imprimirTitulo("CAMPO DE BATALLA");
        
        // Luchador 1
        System.out.printf("  %-25s | HP: %d/%d\n", p1.getNombre(), p1.getVida(), p1.getVidaMax());
        System.out.printf("  %s\n", generarBarraVida(p1.getVida(), p1.getVidaMax()));
        
        System.out.println("\n          VS\n");

        // Luchador 2
        System.out.printf("  %-25s | HP: %d/%d\n", p2.getNombre(), p2.getVida(), p2.getVidaMax());
        System.out.printf("  %s\n", generarBarraVida(p2.getVida(), p2.getVidaMax()));
    }

    @Override
    public void mostrarTurno(Personaje activo) {
        imprimirTitulo("Turno de " + activo.getNombre());
    }

    @Override
    public int pedirHabilidad(List<Habilidad> habilidades) {
        System.out.println("Elige una habilidad para usar:");
        for (int i = 0; i < habilidades.size(); i++) {
            Habilidad h = habilidades.get(i);
            String disponible = h.puedeUsarse() ? "Disponible" : "Agotado";
            System.out.printf("  %d) %-25s (Usos: %d) - %s\n", 
                (i + 1), h.getNombre(), h.getUsosRestantes(), disponible);
        }
        System.out.print("\n> Habilidad: ");
        return pedirOpcion() - 1;
    }

    @Override
    public void mostrarResultadoHabilidad(String resultado) {
        // Esta lógica ahora está dentro de cada habilidad para mayor personalización.
    }

    @Override
    public void mostrarGanador(Personaje ganador) {
        imprimirTitulo("Combate Finalizado");
        System.out.println("\n" +
            "************************************************************\n" +
            "**                                                        **\n" +
            "**              El ganador es: " + String.format("%-20s", ganador.getNombre().toUpperCase()) + " **\n" +
            "**                                                        **\n" +
            "************************************************************\n");
        System.out.println("Presiona Enter para volver al menú principal...");
        scanner.nextLine();
    }
}
