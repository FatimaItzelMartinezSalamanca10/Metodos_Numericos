# Práctica: Método de Gauss-Jordan (Unidad 3)

## Descripción del Proyecto
Implementación en Java del algoritmo de **Gauss-Jordan** mediante programación modular y reutilización de software[span_0](start_span)[span_0](end_span). El programa reutiliza el módulo de Eliminación Gaussiana previo para la triangulación superior, completándolo con la normalización de pivotes y el barrido superior para transformar la matriz aumentada en una matriz identidad de forma directa[span_1](start_span)[span_1](end_span).

## Estructura Modular del Proyecto
El código fuente se encuentra organizado dentro del paquete `Ecuaciones_lineales`:
- **`defmatrizz.java`**: Define y provee la matriz aumentada inicial $[A \vert{} b]$ del sistema[span_2](start_span)[span_2](end_span)[span_3](start_span)[span_3](end_span).
- **`Gauss.java`**: Contiene la lógica base para la triangulación superior[span_4](start_span)[span_4](end_span)[span_5](start_span)[span_5](end_span).
- **`GaussJordan.java`**: Extiende la lógica aplicando el barrido completo de Gauss-Jordan[span_6](start_span)[span_6](end_span).
- **`LanzadorGaussJordan.java`**: Clase principal encargada de coordinar la ejecución y dar formato visual a las matrices en consola.

## Compilación y Ejecución
1. Abre el proyecto en **IntelliJ IDEA**[span_7](start_span)[span_7](end_span)[span_8](start_span)[span_8](end_span)[span_9](start_span)[span_9](end_span)[span_10](start_span)[span_10](end_span)[span_11](start_span)[span_11](end_span).
2. Asegúrate de que los archivos pertenezcan al paquete `Ecuaciones_lineales`[span_12](start_span)[span_12](end_span)[span_13](start_span)[span_13](end_span)[span_14](start_span)[span_14](end_span).
3. Abre el archivo **`LanzadorGaussJordan.java`**.
4. Haz clic en el botón verde de **Play (Run)** ubicado al lado izquierdo de la clase o del método `main` para compilar y ejecutar[span_15](start_span)[span_15](end_span).

## Ejemplo de Prueba y Salida en Consola
```text
Matriz aumentada inicial:
[       3.00      -0.10      -0.20 |       7.85 ]
[       0.10       7.00      -0.30 |     -19.30 ]
[       0.30      -0.20      10.00 |      71.40 ]

Matriz despues de Gauss-Jordan:
[       1.00       0.00       0.00 |       3.00 ]
[       0.00       1.00       0.00 |      -2.50 ]
[       0.00       0.00       1.00 |       7.00 ]

Soluciones del sistema:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
