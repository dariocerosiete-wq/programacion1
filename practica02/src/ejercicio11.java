//PRUEBA CON UN ARRAY DE TAMAÑO 6.
//Programa java que invierta el orden de los valores de un array

public class ejercicio11 {
    public static void main(String[] args) {
                //PRUEBA CON UN ARRAY DE TAMAÑO 6.
                int[] numeros = {1, 2, 3, 4, 5, 6};
                //Programa java que invierta el orden de los valores de un array
                System.out.println("Array original:");
                for (int i = 0; i < 6; i++) {
                    System.out.println(numeros[i]);
                }

                System.out.println("Array invertido:");
                for (int i = 5; i >= 0; i--) {
                    System.out.println(numeros[i]);
                }
            }
        }

