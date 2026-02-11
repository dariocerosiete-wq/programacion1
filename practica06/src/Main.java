public class Main {
    public static void main(String[] args) {
    //Creamos un nuevo bloque para ejecutar todas las funciones(metodos)
    Bloque1 bloque1 = new Bloque1();

    //Primera Función (Para ver los eventos)
    System.out.println("Ejercicio1");
    bloque1.RegistroMuerte();

    //Segunda Función (Que no se duplique dos veces)
    System.out.println("Ejercicio2");
    bloque1.Censo();

    //Tercera Función (Mostrar oro de los heroes)
    System.out.println("Ejercicio3");
    bloque1.BolsaDeOro();

    //Cuarta Función (Para eliminar un indice)
    System.out.println("Ejercicio4");
    bloque1.LimpiezaCalabozo();

    //Quinta Función( Usando bucle para imprimir lo que valga mas de 50)
    System.out.println("Ejercicio5");
    bloque1.MercadoHechizos();

    //Sexta Función(Usando bucle para eliminar a Sauron llamando a nuestro HashSet)
    System.out.println("Ejercicio6");
    bloque1.ExpulsionReino();
    }
}

