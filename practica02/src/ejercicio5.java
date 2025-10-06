import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];

        System.out.println("Introduce valores enteros:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + " ");
            arrayInt[i] = sc.nextInt();

        }
    }
}
