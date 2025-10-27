//Cree una lista de Strings (ArrayList<String>).
// Pida al usuario nombres por teclado hasta que introduzca la palabra "fin"
//Luego pida un nombre a buscar y diga si está en la lista o no
//Mostrando también en qué posición se encuentra si existe.

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
public static void main(String[] args) {
    {
        Scanner sc = new Scanner(System.in);
        //Cree una lista de Strings (ArrayList<String>).
        ArrayList<String> lista = new ArrayList<>();

        // Pida al usuario nombres por teclado hasta que introduzca la palabra "fin".
        String nombre = "";
        //Luego pida un nombre a buscar y diga si está en la lista o no
        while (!nombre.equals("fin")) {
            System.out.print("Escribe un nombre: ");
            nombre = sc.nextLine();
            if (!nombre.equals("fin")) {
                lista.add(nombre);
            }
        }

        //Mostrando también en qué posición se encuentra si existe.
        System.out.print("Escribe un nombre para buscar: ");
        String buscar = sc.nextLine();

        int posicion = lista.indexOf(buscar);
        if (posicion != -1) {
            System.out.println("Está en la lista en la posición " + posicion);
        } else {
            System.out.println("No está en la lista.");
        }
    }
}

}

