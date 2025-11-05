import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        //  Pedimos los números al usuario
        System.out.println("Introduce 20 números:");
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("Número [" + fila + "][" + col + "]: ");
                numeros[fila][col] = sc.nextInt();
            }
        }
        int[] sumaFila = new int[4];
        int[] maxColumna = new int[5];
        int sumaTotal = 0;
        for (int i = 0; i < 5; i++) {
            maxColumna[i] = numeros[0][i];
        }
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 5; col++) {
                int valor = numeros[fila][col];
                sumaFila[fila] += valor;
                sumaTotal += valor;
                if (valor > maxColumna[col]) {
                    maxColumna[col] = valor;
                }
            }
        }
        String separador = "--" + "-----------------".repeat(6);
        System.out.println();
        System.out.println(separador);
        for (int fila = 0; fila < 4; fila++) {
            System.out.print("|");
            for (int col = 0; col < 5; col++) {
                System.out.printf(" %-13d|", numeros[fila][col]);
            }
            System.out.printf(" Σ fila = %-5d|", sumaFila[fila]);
            System.out.println();
            System.out.println(separador);
        }
        System.out.print("|");
        for (int col = 0; col < 5; col++) {
            System.out.printf(" Σ col %-1d = %-3d|", col, maxColumna[col]);
        }
        System.out.printf(" TOTAL = %-5d|", sumaTotal);
        System.out.println();
        System.out.println(separador);
    }
}


