//Crea una lista Array list <Integer>
//Pedir usuario 10 numeros enteros
//Lista para evitar números duplicados
// Ordenar de menor a mayor
//Mostrar lista de ordenados y sin duplicar

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        //Crea una lista Array list <Integer>

        ArrayList<Integer> lista = new ArrayList<>();
        //Pedir usuario 10 numeros enteros

        System.out.println("Introduce valores enteros:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Valor " + i + ": ");
            arrayInt[i] = sc.nextInt();

            //Lista para evitar números duplicados
            if (!lista.contains(arrayInt[i])) {
                lista.add(arrayInt[i]);
            }
        }

        // Ordenar de menor a mayor

        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i) > lista.get(j)) {
                    int temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        //Mostrar lista de ordenados y sin duplicar

        System.out.println("Lista sin duplicados y ordenada:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}


