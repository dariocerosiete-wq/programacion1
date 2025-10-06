import java.util.Scanner;

public class ejercicio2 {
    //Muestra por pantalla todos los elementos de un array
    //de números enteros separados por un espacio.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];

        System.out.println("Introduce valores enteros:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + " ");
            arrayInt[i] = sc.nextInt();
        }
            System.out.println("numeros enteros");
            for (int i = 0; i < arrayInt.length; i++) {
                System.out.print(i + " ");
        }
    }
}

