import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[5];

        System.out.println("Introduce valores enteros:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + " ");
            arrayInt[i] = sc.nextInt();
        }


        int menor = arrayInt[0];


        for (int i = 1; i < arrayInt.length; i++) {
            if (arrayInt[i] < menor) {
                menor = arrayInt[i];
            }
        }

        System.out.println("El número más pequeño es: " + menor);
    }
}

