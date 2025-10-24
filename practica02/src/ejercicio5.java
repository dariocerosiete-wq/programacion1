//Crea un array de números donde le indicamos por teclado el tamaño del array
//rellenaremos el array con números aleatorios entre 0 y 9
//final muestra por pantalla el valor de cada posición y la suma de todos los valores

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crea un array de números donde le indicamos por teclado el tamaño del array
        int[] arrayInt = new int[9];
        //rellenaremos el array con números aleatorios entre 0 y 9
        int i = (int) (Math.random() * 9 + 1);
        //final muestra por pantalla el valor de cada posición y la suma de todos los valores
        System.out.print("Numero aleatorio " + i + " ");
    }
    }

