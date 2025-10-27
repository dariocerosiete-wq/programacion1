//Crea una lista Array list <Integer>
//Pedir usuario 10 numeros enteros
//Lista para evitar números duplicados
//Ordenar de menor a mayor
//Mostrar lista de ordenados y sin duplicar

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        //Pedir 10 números al usuario
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = sc.nextInt();
            lista.add(num);
        }

        //Lista para evitar números duplicados
        ArrayList<Integer> sinDuplicados = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int actual = lista.get(i);
            boolean yaExiste = false;

            for (int j = 0; j < sinDuplicados.size(); j++) {
                if (actual == sinDuplicados.get(j)) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste) {
                sinDuplicados.add(actual);
            }
        }


        for (int i = 0; i < sinDuplicados.size(); i++) {
            for (int j = i + 1; j < sinDuplicados.size(); j++) {
                if (sinDuplicados.get(i) > sinDuplicados.get(j)) {
                    // Ordenar de menor a mayor
                    int temp = sinDuplicados.get(i);
                    int menor = sinDuplicados.get(j);

                    sinDuplicados.remove(i);
                    sinDuplicados.add(i, menor);

                    sinDuplicados.remove(j);
                    sinDuplicados.add(j, temp);
                }
            }
        }

        //Mostrar lista de ordenados y sin duplicar
        System.out.println("Lista ordenada sin duplicados:");
        for (int i = 0; i < sinDuplicados.size(); i++) {
            System.out.println(sinDuplicados.get(i));
        }
    }
}


