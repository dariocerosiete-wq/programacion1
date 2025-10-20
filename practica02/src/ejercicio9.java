import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        //Pedir los 10 números y los guardes por un array
        //Recorrer por el array para encontrar el máximo y mínimo
            Scanner teclado = new Scanner(System.in);
            int[] numeros = new int[10];

            // Pedir los 10 números y los guardes por un array
            System.out.println("Escribe 10 números enteros:");
            for (int i = 0; i < 10; i++) {
                numeros[i] = teclado.nextInt();
            }

            //Recorrer por el array para encontrar el máximo y mínimo
            int max = numeros[0];
            int min = numeros[0];
            int posMax = 0;
            int posMin = 0;

            for (int i = 1; i < 10; i++) {
                if (numeros[i] > max) {
                    max = numeros[i];
                    posMax = i;
                }
                if (numeros[i] < min) {
                    min = numeros[i];
                    posMin = i;
                }
            }


            System.out.println("Valor máximo: " + max + " en la posición " + posMax);
            System.out.println("Valor mínimo: " + min + " en la posición " + posMin);
        }
    }
