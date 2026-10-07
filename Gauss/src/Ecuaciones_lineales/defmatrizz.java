package Ecuaciones_lineales;

/**
 * Clase modular encargada de la provisión de datos del sistema de ecuaciones lineales.
 * Define la matriz aumentada [A bb]
 */
public class defmatrizz {

     /**
      * Retorna la matriz aumentada del sistema a resolver.
      *
      * @return Matriz bidimensional de tipo double que representa [A b]
      */
    public static double[][] defmatriz() {
        return new double[][] {
                { 3.0, -0.1, -0.2,  7.85 },
                { 0.1,  7.0, -0.3, -19.3 },
                { 0.3, -0.2, 10.0,  71.4 }
        };
    }
}
