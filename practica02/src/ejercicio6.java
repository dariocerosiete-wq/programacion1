import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Programa Java que guarda en un array 10 números enteros
        int[] arrayInt = new int[10];
        //que se leen por teclado
        System.out.println("Introduce valores enteros:");
        int i;
        for (i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        //Calcula cuántos números son positivos, cuántos negativos y cuántos ceros
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > 0) {
                positivos++;
            } else if (arrayInt[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostramos los resultados
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}



