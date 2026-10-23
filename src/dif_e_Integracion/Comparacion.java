package dif_e_Integracion;

public class Comparacion {
    public static void main(String[] args) {
        // Datos de prueba: mismos limites, funcion y tolerancia para ambos.
        double a = 0.0;
        double b = 2.0;
        double tolerancia = 0.0001;

        // Calcula resultados finales y el numero de subintervalos usado.
        double simpson = SimpsonCompuesto.integrarConTolerancia(a, b, tolerancia);
        int nSimpson = SimpsonCompuesto.subintervalosConTolerancia(a, b, tolerancia);
        double trapecio = TrapecioCompuesto.integrarConTolerancia(a, b, tolerancia);
        int nTrapecio = TrapecioCompuesto.subintervalosConTolerancia(a, b, tolerancia);

        System.out.println("Simpson 1/3 compuesto vs. Trapecio compuesto");
        System.out.println("Funcion: f(x) = x^3");
        System.out.printf("Intervalo: [%.0f, %.0f]%n", a, b);
        System.out.printf("Tolerancia objetivo: %.5f%n", tolerancia);

        System.out.println("\n--- ITERACIONES (TRAPECIO COMPUESTO) ---");
        TrapecioCompuesto.imprimirIteraciones(a, b, tolerancia);

        System.out.println("\n--- ITERACIONES (SIMPSON 1/3 COMPUESTO) ---");
        SimpsonCompuesto.imprimirIteraciones(a, b, tolerancia);

        System.out.println("\n--- ANALISIS DE RESULTADOS FINALES ---");
        System.out.printf(
                 "Aproximacion Trapecio: %.10f | n = %d%n ",
        trapecio,nTrapecio);
        System.out.printf(
                "Aproximacion Simpson : %.10f | n = %d%n",
                simpson, nSimpson);
    }
}
