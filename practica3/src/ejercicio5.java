import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] numeros = new int[6][10];
        int[] sumaFilas = new int[6];
        int[] sumaColumnas = new int[10];
        int sumaTotal = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0;
        int minFila = 0, minCol = 0;

        // Calcular sumas, máximo y mínimo
        System.out.println("Generando 60 números aleatorios del 0-1000:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int valor = rand.nextInt(1001); // 0 a 1000
                numeros[i][j] = valor;

                sumaFilas[i] += valor;
                sumaColumnas[j] += valor;
                sumaTotal += valor;

                if (valor > max) {
                    max = valor;
                    maxFila = i;
                    maxCol = j;
                }

                if (valor < min) {
                    min = valor;
                    minFila = i;
                    minCol = j;
                }
            }
        }

        // Mostrar tabla con bordes
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %4d |", numeros[i][j]);
            }
            System.out.println();
            if (i < 5) {
                System.out.println("-----------------------------------------------------------------------");
            }
        }
        System.out.println("-----------------------------------------------------------------------");

        // Resultado
        System.out.println("\nNúmero máximo: " + max + " en posición [" + maxFila + "][" + maxCol + "]");
        System.out.println("Número mínimo: " + min + " en posición [" + minFila + "][" + minCol + "]");
        System.out.println("\nSuma total: " + sumaTotal);
        //Suma Fila
        System.out.println("\nSuma por fila:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }
        //Suma Columna
        System.out.println("\nSuma por columna:");
        for (int j = 0; j < 10; j++) {
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }
    }
}




