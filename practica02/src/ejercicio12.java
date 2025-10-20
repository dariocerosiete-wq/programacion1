import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        char[] letras = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W'
        };

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe solo el numero de su DNI: ");
        int numeroDNI = teclado.nextInt();

        int resto = numeroDNI % 23;

        System.out.println("La letra del DNI es: " + letras[resto]);
    }
}
