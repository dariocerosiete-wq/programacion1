public class ejercicio1 {
    public static void main(String[] args) {
        // Define un array de números tipo double de 3 filas por 7 columnas con nombre doub
        double[][] doub = {
                //asigna los valores según la siguiente tabla
                {0, 30, 2, 0, 0, 0, 5},
                {75, 0, 0, 0, 0, 0, 0},
                {0, 0,-2 , 0, 9, 0, 11}
        };

        // Imprimir encabezado
        System.out.print("Array num  ");
        for (int j = 0; j < 6; j++) {
            System.out.printf("Columna %-3d ", j);
        }
        System.out.println();

        // Imprimir filas
        for (int i = 0; i < doub.length; i++) {
            System.out.printf("Fila %-6d", i);
            for (int j = 0; j < doub[i].length; j++) {
                System.out.printf("%8.0f ", doub[i][j]);
            }
            System.out.println();
        }
    }
}



