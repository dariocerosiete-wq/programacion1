//Pedir número DNI al usuario
//Programa que te devuelva la letra
//Resultado

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //Pedir número DNI al usuario
        System.out.print("Introduce el número del DNI: ");
        int numero = sc.nextInt();

        //Programa que te devuelva la letra
        int resto = numero % 23;

        //Resultado
        System.out.println("La letra del DNI es: " + letras[resto]);
    }
}
