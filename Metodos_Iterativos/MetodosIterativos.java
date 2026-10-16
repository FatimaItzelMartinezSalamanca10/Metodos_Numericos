package Metodos_Iterativos;

public class MetodosIterativos {

    public void resolverJacobi(DefinicionSistema sis) {
        int n = sis.b.length;
        double[] xViejo = sis.xInicial.clone();
        double[] xNuevo = new double[n];
        int it = 0;

        System.out.println("--- Método de Jacobi ---");
        while (it < 100) {
            it++;
            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (j != i) suma += sis.A[i][j] * xViejo[j];
                }
                //En Jacobi se utiliza un vector auxiliar (xViejo) para calcular los nuevos valores
                xNuevo[i] = (sis.b[i] - suma) / sis.A[i][i];
            }

            double error = 0.0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(xNuevo[i] - xViejo[i]));
            }

            System.out.printf("Iteración %d: [%.4f, %.4f, %.4f] (Error: %.5f)\n", it, xNuevo[0], xNuevo[1], xNuevo[2], error);

            // Condición de paro basada en la tolerancia establecida
            if (error < sis.tolerancia) break;

            System.arraycopy(xNuevo, 0, xViejo, 0, n);
        }
    }

    public void resolverGaussSeidel(DefinicionSistema sis) {
        int n = sis.b.length;
        double[] x = sis.xInicial.clone();
        int it = 0;

        System.out.println("\n--- Método de Gauss-Seidel ---");
        while (it < 100) {
            it++;
            double[] xAnterior = x.clone();

            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (j != i) suma += sis.A[i][j] * x[j];
                }
                //Gauss-Seidel actualiza y utiliza los valores en tiempo real dentro del mismo ciclo
                x[i] = (sis.b[i] - suma) / sis.A[i][i];
            }

            double error = 0.0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(x[i] - xAnterior[i]));
            }

            System.out.printf("Iteración %d: [%.4f, %.4f, %.4f] (Error: %.5f)\n", it, x[0], x[1], x[2], error);

            if (error < sis.tolerancia) break;
        }
    }
}