public class ejercicio1 {
    public static void main(String[] args) {
        // Array corregido según tus indicaciones
        Double[][] doub = {
                {0.0, 30.0, 2.0, null, null, 5.0},   // Fila 0
                {75.0, null, null, null, 0.0, null}, // Fila 1
                {null, null, -2.0, 9.0, null, 11.0}  // Fila 2
        };

        // Imprimir encabezado con "Array num" en la primera celda
        System.out.print("| Array num ");
        for (int j = 0; j < 6; j++) {
            System.out.printf("| Columna %-3d ", j);
        }
        System.out.println("|");

        // Línea separadora
        System.out.print("|-----------");
        for (int j = 0; j < 6; j++) {
            System.out.print("|-------------");
        }
        System.out.println("|");

        // Imprimir filas con bordes
        for (int i = 0; i < doub.length; i++) {
            System.out.printf("| Fila %-4d ", i);
            for (int j = 0; j < 6; j++) {
                if (doub[i][j] != null) {
                    System.out.printf("| %-11.0f ", doub[i][j]);
                } else {
                    System.out.printf("| %-11s ", ""); // Espacio en blanco
                }
            }
            System.out.println("|");
            System.out.print("|-----------");
            for (int j = 0; j < 6; j++) {
                System.out.print("|-------------");
            }
            System.out.println("|");
        }
    }
}





