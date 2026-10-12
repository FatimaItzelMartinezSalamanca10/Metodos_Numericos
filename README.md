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

Matriz aumentada inicial:
3.0	-0.1	-0.2	7.85	
0.1	7.0	-0.3	-19.3	
0.3	-0.2	10.0	71.4	

Matriz despues de Gauss-Jordan:
1.0	0.0	0.0	3.0	
0.0	1.0	0.0	-2.5	
0.0	0.0	1.0	7.000000000000002	

Soluciones del sistema:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

