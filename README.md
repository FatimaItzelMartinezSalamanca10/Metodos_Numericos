# Práctica: Método de Gauss_Jordan (Unidad 3)

## Descripción del Proyecto
Implementación en Java del algoritmo de **Gauss_Jordan** utilizando programación modular y reutilización de software. El código aprovecha el módulo de Eliminación Gaussiana previo para la triangulación superior y añade la normalización de pivotes y el barrido superior para transformar la matriz aumentada en una matriz identidad de forma directa.

## Estructura Modular del Proyecto
- **`defmatrizz.java`**: Define y provee la matriz aumentada inicial [A b] del sistema.
- **`Gauss.java`**: Contiene la lógica base para la triangulación superior.
- **`GaussJordan.java`**: Extiende la lógica aplicando la reducción completa de Gauss_Jordan.
- **`LanzadorGaussJordan.java`**: Clase principal que coordina la ejecución y da formato visual a las matrices en la consola.

## Ejecución
Para correr el programa, abra el proyecto en IntelliJ IDEA y ejecute directamente la clase principal **`LanzadorGaussJordan.java`** utilizando el botón de ejecución.

## Ejemplo de Prueba y Salida en Consola
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
