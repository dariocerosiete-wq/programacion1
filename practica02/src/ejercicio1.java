import java.util.Scanner;

public class ejercicio1 {
    // Crea un array de 10 posiciones de números con valores pedidos por teclado.
    // Muestra por consola el índice y el valor al que corresponde.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];

        // Pedimos los valores por teclado
        System.out.println("Introduce 10 valores enteros:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        // Mostramos el índice y el valor correspondiente
        System.out.println("\nÍndice -> Valor");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(i + " -> " + arrayInt[i]);
        }

    }
}
