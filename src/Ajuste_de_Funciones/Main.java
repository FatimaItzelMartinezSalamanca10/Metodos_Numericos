package Ajuste_de_Funciones;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double[] datosX = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] datosY = {2.0, 4.0, 5.0, 4.0, 5.0};

        System.out.println("Valores independientes X: " + Arrays.toString(datosX));
        System.out.println("Valores dependientes Y: " + Arrays.toString(datosY));

        double[] resultadosRegresion = Regresiónlineal.calcularMinimosCuadrados(datosX, datosY);

        double valorEstimado = Regresiónlineal.predecir(resultadosRegresion[0], resultadosRegresion[1], 3.5);
        System.out.printf(Locale.ROOT, "Predicción interpolada para X = 3.5: %.4f%n", valorEstimado);
    }
}