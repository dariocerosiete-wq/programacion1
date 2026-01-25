import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayInt = new int[10];

        System.out.println("Introduce valores enteros:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > 0) {
                positivos++;
                sumaPositivos += arrayInt[i]; // ¡Aquí sí se suma!
            } else if (arrayInt[i] < 0) {
                negativos++;
                sumaNegativos += arrayInt[i]; // ¡También se suma!
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        if (positivos > 0) {
            double mediaPositivos = (double) sumaPositivos / positivos;
            System.out.println("Media de positivos: " + mediaPositivos);
        } else {
            System.out.println("No hay positivos para calcular la media.");
        }

        if (negativos > 0) {
            double mediaNegativos = (double) sumaNegativos / negativos;
            System.out.println("Media de negativos: " + mediaNegativos);
        } else {
            System.out.println("No hay negativos para calcular la media.");
        }
    }
}




