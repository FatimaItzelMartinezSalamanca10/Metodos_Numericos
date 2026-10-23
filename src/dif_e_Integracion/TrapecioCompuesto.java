package dif_e_Integracion;

public class TrapecioCompuesto {
    // Funcion que se va a integrar: f(x) = x^3.
    public static double funcion(double x) {
        return x * x * x;
    }

    // Calcula el ancho de cada subintervalo.
    public static double calcularH(double a, double b, int n) {
        return (b - a) / n;
    }

    // Calcula la integral usando el metodo del trapecio compuesto.
    public static double calcularTrapecio(double a, double b, int n) {
        double h = calcularH(a, b, n);
        double suma = (funcion(a) + funcion(b)) / 2.0;

        for (int k = 1; k < n; k++) {
            double xk = a + k * h;
            suma += funcion(xk);
        }

        return h * suma;
    }

    // Refina el numero de subintervalos hasta que dos aproximaciones
    // consecutivas difieran como maximo en la tolerancia indicada.
    public static double integrarConTolerancia(
            double a, double b, double tolerancia) {
        int n = 2;
        double anterior = calcularTrapecio(a, b, n);
        double errorAbsoluto = Double.POSITIVE_INFINITY;

        while (errorAbsoluto > tolerancia) {
            n *= 2;
            double nueva = calcularTrapecio(a, b, n);
            errorAbsoluto = Math.abs(nueva - anterior);
            anterior = nueva;
        }
        return anterior;
    }

    // Devuelve el n final usando exactamente el mismo criterio de paro.
    public static int subintervalosConTolerancia(
            double a, double b, double tolerancia) {
        int n = 2;
        double anterior = calcularTrapecio(a, b, n);
        double errorAbsoluto = Double.POSITIVE_INFINITY;

        while (errorAbsoluto > tolerancia) {
            n *= 2;
            double nueva = calcularTrapecio(a, b, n);
            errorAbsoluto = Math.abs(nueva - anterior);
            anterior = nueva;
        }
        return n;
    }

    // Imprime todas las iteraciones para documentar la convergencia.
    public static void imprimirIteraciones(
            double a, double b, double tolerancia) {
        int n = 2;
        double anterior = calcularTrapecio(a, b, n);
        System.out.printf("n = %d | Integral = %.10f%n", n, anterior);
        double Error = Double.POSITIVE_INFINITY;

        while (Error > tolerancia) {
            n *= 2;
            double nueva = calcularTrapecio(a, b, n);
            Error = Math.abs(nueva - anterior);
            System.out.printf(
                    "n = %d | Integral = %.10f | Error = %.10f%n",
                    n, nueva, Error);
            anterior = nueva;
        }
    }
}
