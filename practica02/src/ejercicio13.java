import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        {
            //Cree una lista de enteros (ArrayList<Integer>).
            Scanner s = new Scanner(System.in);
            ArrayList<Integer> lista = new ArrayList<>();
            //Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
            System.out.println("Escribe números positivos. Si escribes uno negativo, se termina.");

            int numero = 0;

            while (numero >= 0) {
                numero = s.nextInt();

                if (numero >= 0) {
                    lista.add(numero);
                }
            }
            //Muestre por pantalla todos los números de la lista y la suma total de los mismos.
            System.out.println("Los números que escribiste son:");
            int suma = 0;

            for (int n : lista) {
                System.out.println(n);
                suma = suma + n;
            }

            System.out.println("La suma total es: " + suma);
        }
    }
}

