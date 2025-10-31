import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 4;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];

        // 20 numeros pedidos al usuario
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Número en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calcular suma de filas
        int[] sumaFilas = new int[filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }

        int[] maxColumnas = new int[columnas];
        for (int j = 0; j < columnas; j++) {
            maxColumnas[j] = matriz[0][j];
            for (int i = 1; i < filas; i++) {
                if (matriz[i][j] > maxColumnas[j]) {
                    maxColumnas[j] = matriz[i][j];
                }
            }
        }

        // Calcular suma total
        int sumaTotal = 0;
        for (int i = 0; i < filas; i++) {
            sumaTotal += sumaFilas[i];
        }

        System.out.println("\nResultado:");
        String horizontalLine = "--------".repeat(columnas) + "-------------";
        for (int i = 0; i < filas; i++) {
            System.out.println(horizontalLine);
            for (int j = 0; j < columnas; j++) {
                System.out.printf("| %5d ", matriz[i][j]);
            }
            System.out.printf("| Σ fila %d: %1d |\n", i, sumaFilas[i]);
        }
        System.out.println(horizontalLine);

        // Mostrar máximos de columnas y total
        for (int j = 0; j < columnas; j++) {
            System.out.printf("| %5d ", maxColumnas[j]);
        }
        System.out.printf("| TOTAL: %1d |\n", sumaTotal);
        System.out.println(horizontalLine);

    }
}
