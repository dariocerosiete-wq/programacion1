import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            ArrayList<Integer> lista = new ArrayList<>();

            System.out.println("Escribe números positivos. Si escribes uno negativo, se termina.");

            int numero = 0;

            while (numero >= 0) {
                numero = s.nextInt(); // leer número

                if (numero >= 0) {
                    lista.add(numero); // guardar en la lista
                }
            }

            System.out.println("Los números que escribiste son:");
            int suma = 0;

            for (int n : lista) {
                System.out.println(n); // mostrar número
                suma = suma + n;       // sumar
            }

            System.out.println("La suma total es: " + suma);
        }
    }
}

