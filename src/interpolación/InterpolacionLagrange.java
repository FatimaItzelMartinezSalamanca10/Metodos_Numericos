package interpolación;

public class InterpolacionLagrange {

    private static void validarDatos(double[] x, double[] y) {
        // Revisar que los arreglos existan y tengan datos
        if (x == null || y == null || x.length == 0 || y.length == 0) {
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos ni estar vacios.");
        }
        // Checar que tengan la misma cantidad de elementos
        if (x.length != y.length) {
            throw new IllegalArgumentException("Los arreglos x y y deben tener el mismo tamano.");
        }
        // Si hay una x repetida, el denominador se hace cero y truena
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    throw new IllegalArgumentException("Nodos de x repetidos: " + x[i]);
                }
            }
        }
    }

    public static double interpolacionLagrange(double[] x, double[] y, double xEval) {
        validarDatos(x, y);
        double resultado = 0.0;
        int n = x.length;

        for (int i = 0; i < n; i++) {
            // Empezamos guardando el valor de y en esta posicion
            double termino = y[i];
            for (int j = 0; j < n; j++) {
                // Hacemos las multiplicaciones ignorando el nodo i
                if (i != j) {
                    termino *= (xEval - x[j]) / (x[i] - x[j]);
                }
            }
            // Vamos sumando lo que dio esta parte al resultado
            resultado += termino;
        }
        return resultado;
    }
}
