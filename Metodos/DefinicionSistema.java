package Metodos;

public class DefinicionSistema {
    //Matriz de coeficientes A del sistema de ecuaciones lineales
    public double[][] A = {
            {5.0, 1.0, 1.0},
            {1.0, 4.0, 1.0},
            {1.0, 2.0, 5.0}
    };

    // Vector de términos independientes (b)
    public double[] b = {7.0, 6.0, 8.0};

    //Vector de aproximación inicial X^(0) establecido como ceros
    public double[] xInicial = {0.0, 0.0, 0.0};

    //Tolerancia de error establecida para detener las iteraciones
    public double tolerancia = 0.0001;
}