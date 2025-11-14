
public class ejercicio6 {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 7;
        int[][] matriz = new int[filas][columnas];
        boolean[] usados = new boolean[21];
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        int sumaTotal = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        //Generamos los números aleatorios del 20-40 sin que se repitan
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int num;
                do {
                    num = 20 + (int)(Math.random() * 21);
                } while (usados[num - 20]);

                usados[num - 20] = true;
                matriz[i][j] = num;

                sumaFilas[i] += num;
                sumaColumnas[j] += num;
                sumaTotal += num;

                if (num > max) {
                    max = num;
                    maxFila = i;
                    maxCol = j;
                }
                if (num < min) {
                    min = num;
                    minFila = i;
                    minCol = j;
                }
            }
        }

        // Mostrar tabla con bordes
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < filas; i++) {
            System.out.print("|");
            for (int j = 0; j < columnas; j++) {
                System.out.printf(" %4d |", matriz[i][j]);
            }
            System.out.println();
            System.out.println("-------------------------------------------------");
        }

        // Mostrar resultados
        System.out.println("\nNúmero máximo: " + max + " en [" + maxFila + "][" + maxCol + "]");
        System.out.println("Número mínimo: " + min + " en [" + minFila + "][" + minCol + "]");
        System.out.println("Suma total: " + sumaTotal);

        System.out.println("\nSuma por fila:");
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }

        System.out.println("\nSuma por columna:");
        for (int j = 0; j < columnas; j++) {
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }
    }
}

