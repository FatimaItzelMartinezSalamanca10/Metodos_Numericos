package Gauss_Jordan;

public class LanzadorGaussJordan {

    public static void main(String[] args) {
        double[][] matriz = defmatrizz.defmatriz();

        System.out.println("Matriz aumentada inicial:");
        imprimirMatriz(matriz);

        GaussJordan.gaussJordan(matriz);

        System.out.println("\nMatriz despues de Gauss-Jordan:");
        imprimirMatriz(matriz);

        System.out.println("\nSoluciones del sistema:");
        mostrarSoluciones(matriz);
    }

    public static void imprimirMatriz(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarSoluciones(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            // La ultima columna contiene las soluciones.
            System.out.println("x" + (i + 1) + " = " + matriz[i][n]);
        }
    }
}
