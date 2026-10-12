package Gauss_Jordan;

public class GaussJordan {

    /**
     * Método para resolver el sistema de ecuaciones usando Gauss-Jordan.
     */
    public static void gaussJordan(double[][] matriz) {
        int n = matriz.length;

        // Primero usamos el método de Gauss para dejar la matriz en modo triangular superior
        Gauss.eliminacionGaussiana(matriz);

        // Ahora recorremos de abajo hacia arriba para hacer el barrido superior
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Dividimos toda la fila entre el pivote para que quede en 1
            for (int k = 0; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Hacemos ceros los números que quedan arriba de la diagonal
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];

                // Restamos la fila pivote multiplicada por el factor en cada columna
                for (int k = 0; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}
