//Crea un array de números de 100 posiciones contendrá los números del 1 al 100
//Obtén la suma de todos ellos y la media

public class ejercicio4 {
    public static void main(String[] args) {
        //Crea un array de números de 100 posiciones contendrá los números del 1 al 100
        int[] numeros = new int[100];
        int suma = 0;
        double media;
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
            suma = suma + numeros[i];
        }
        media = (double) suma / 100;
        //Obtén la suma de todos ellos y la media
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
        System.out.println("La media de los números del 1 al 100 es: " + media);
    }
}

