//Crea un array que contenga 5 números
//Realiza un programa que te muestre por pantalla SOLO el más pequeño de ellos
//Resultado

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crea un array que contenga 7 números
        int[] arrayInt = new int[7];

        //Realiza el programa que te muestre por pantalla el más mayor de ellos
        System.out.println("Introduce valores enteros:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + " ");
            arrayInt[i] = sc.nextInt();
        }
        int mayor = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > mayor) {
                mayor = arrayInt[i];
            }
        }
        //Resultado
        System.out.println("El número más mayor es: " + mayor);
    }
}








