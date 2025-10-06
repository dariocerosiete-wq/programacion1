public class ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int suma = 0;
        double media;
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
            suma = suma + numeros[i];
        }
        media = (double) suma / 100;

        System.out.println("La suma de los números del 1 al 100 es: " + suma);
        System.out.println("La media de los números del 1 al 100 es: " + media);
    }
}

