//Crea un programa que muestre por pantalla la nota de un estudiante
// lista de estudiantes con sus respectivas notas
//nombre del estudiante lo introduce el usuario por teclado

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        //Crea un programa que muestre por pantalla la nota de un estudiante
        String[] nombres = {"Dario", "Roberto", "Adrian", "Iker", "Ismael"};
        // lista de estudiantes con sus respectivas notas
        int[] notas = {8, 6, 9, 7, 10};
        //nombre del estudiante lo introduce el usuario por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre del estudiante: ");
        String nombre = teclado.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombre)) {
                System.out.println("Nota: " + notas[i]);
                return;
            }
        }


        System.out.println("No encontrado");
    }
}
