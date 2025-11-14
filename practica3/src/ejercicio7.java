import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 3, columnas = 7;
        int total = filas * columnas;
        //Le pedimos al usuario que introduzca el mínimo y el máximo
        System.out.print("Mínimo: ");
        int min = sc.nextInt();
        System.out.print("Máximo: ");
        int max = sc.nextInt();

        int rango = max - min + 1;
        if (rango < total) {
            System.out.println("Rango muy pequeño para " + total + " números únicos.");
            return;
        }

        int[][] matriz = new int[filas][columnas];
        boolean[] usados = new boolean[rango];
        int suma = 0;

        // Generar números dado por el usuario
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int num;
                do {
                    num = min + (int) (Math.random() * rango);
                } while (usados[num - min]);
                usados[num - min] = true;
                matriz[i][j] = num;
                suma += num;
            }
        }

        // Mostrar tabla con bordes
        System.out.println("\nMatriz:");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < filas; i++) {
            System.out.print("|");
            for (int j = 0; j < columnas; j++) {
                System.out.printf(" %4d |", matriz[i][j]);
            }
            System.out.println();
            System.out.println("-------------------------------------------------");
        }

        // Media aritmética
        double media = (double) suma / total;
        System.out.printf("\nMedia aritmética: %.2f\n", media);

        // Nº Primos
        System.out.println("\nPrimos:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.println("[" + i + "][" + j + "] -> " + matriz[i][j]);
                }
            }
        }

        // Gráfico con las estrellas
        System.out.println("\nGráfico:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int estrellas = matriz[i][j] - min;
                System.out.printf("%4d: %s\n", matriz[i][j], "*".repeat(estrellas));
            }
        }
    }
    //Comprobación de los números primos
    static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}

