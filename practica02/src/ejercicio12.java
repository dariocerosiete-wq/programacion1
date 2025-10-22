import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


        System.out.print("Introduce el número del DNI: ");
        int numero = sc.nextInt();


        int resto = numero % 23;


        System.out.println("La letra del DNI es: " + letras[resto]);

        sc.close();
    }
}
