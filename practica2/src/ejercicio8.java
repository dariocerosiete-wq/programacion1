import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        //Programa Java para leer la altura de N personas
        //calcular la altura media
        //Calcular cuántas personas tienen una altura superior a la media
        //cuántas tienen una altura inferior a la media
        //El valor de N se pide por teclado y debe ser entero positivo
        Scanner sc = new Scanner(System.in);
        //Programa Java para leer la altura de N personas
        System.out.print("¿Cuántas personas? ");
        int N = sc.nextInt();
        //calcular la altura media
        double[] alturas = new double[N];
        double suma = 0;
        //Calcular cuántas personas tienen una altura superior a la media
        for (int i = 0; i < N; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            suma += alturas[i];
        }
        //cuántas tienen una altura inferior a la media
        double media = suma / N;
        System.out.println("Altura media: " + media);

        int masAltos = 0;
        int masBajos = 0;

        for (int i = 0; i < N; i++) {
            if (alturas[i] > media) masAltos++;
            if (alturas[i] < media) masBajos++;
        }
        //El valor de N se pide por teclado y debe ser entero positivo
        System.out.println("Altura superior a la media: " + masAltos);
        System.out.println("Altura inferior a la media: " + masBajos);
    }
}
