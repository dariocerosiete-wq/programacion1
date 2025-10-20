import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        String[] nombres = {"Dario", "Roberto", "Adrian", "Iker", "Ismael"};
        int[] notas = {8, 6, 9, 7, 10};

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
