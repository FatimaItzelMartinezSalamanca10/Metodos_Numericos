package dif_e_Integracion;

public class SimpsonCompuesto {

    private static double calcularSimpson(double a, double b, int n) {
        // La regla compuesta de Simpson requiere n par.
        if (n % 2 != 0) {
            throw new IllegalArgumentException(
                    "Simpson 1/3 compuesto requiere un numero par de subintervalos.");
        }

        double h = TrapecioCompuesto.calcularH(a, b, n);
        double sumaImpares = 0.0;
        double sumaPares = 0.0;

        for (int k = 1; k < n; k++) {
            double xk = a + k * h;

            // TODO completado: los indices impares llevan coeficiente 4
            // y los indices pares interiores llevan coeficiente 2.
            if (k % 2 != 0) {
                sumaImpares += TrapecioCompuesto.funcion(xk);
            } else {
                sumaPares += TrapecioCompuesto.funcion(xk);
            }
        }

        double sumaTotal = TrapecioCompuesto.funcion(a)
                + 4 * sumaImpares
                + 2 * sumaPares
                + TrapecioCompuesto.funcion(b);

        return (h / 3.0) * sumaTotal;
    }

    public static double integrarConTolerancia(
            double a, double b, double tolerancia) {
        int n = 2;
        double integralAnterior = calcularSimpson(a, b, n);
        double errorAbsoluto = 999.0;

        // Se duplica n para conservar su paridad y refinar la aproximacion.
        while (errorAbsoluto > tolerancia) {
            n *= 2;
            double integralNueva = calcularSimpson(a, b, n);
            errorAbsoluto = Math.abs(integralNueva - integralAnterior);
            integralAnterior = integralNueva;
        }

        return integralAnterior;
    }

    // Metodo auxiliar para mostrar el n final sin cambiar el metodo base.
    public static int subintervalosConTolerancia(
            double a, double b, double tolerancia) {
        int n = 2;
        double anterior = calcularSimpson(a, b, n);
        double errorAbsoluto = 999.0;

        while (errorAbsoluto > tolerancia) {
            n *= 2;
            double nueva = calcularSimpson(a, b, n);
            errorAbsoluto = Math.abs(nueva - anterior);
            anterior = nueva;
        }
        return n;
    }

    // Imprime las aproximaciones sucesivas del metodo de Simpson.
    public static void imprimirIteraciones(
            double a, double b, double tolerancia) {
        int n = 2;
        double anterior = calcularSimpson(a, b, n);
        System.out.printf("n = %d | Integral = %.10f%n", n, anterior);
        double Error = Double.POSITIVE_INFINITY;

        while (Error > tolerancia) {
            n *= 2;
            double nueva = calcularSimpson(a, b, n);
            Error = Math.abs(nueva - anterior);
            System.out.printf(
                    "n = %d | Integral = %.10f | Error= %.10f%n",
                    n, nueva,Error);
            anterior = nueva;
        }
    }
}
