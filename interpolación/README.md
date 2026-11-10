**Métodos Numéricos: Interpolación Polinómica**

**Resumen de la Práctica**

Este proyecto realiza un análisis comparativo entre la Interpolación de Lagrange y el Método de Diferencias Divididas de Newton. Ambos algoritmos procesan el mismo conjunto de nodos discretos para determinar la aproximación polinomial en un punto específico.

***Estructura del Código***

El paquete interpolacion está compuesto por tres componentes principales:

src/

└── interpolacion/

    ├── Main.java                   # Punto de entrada y orquestador del flujo
    
    ├── InterpolacionLagrange.java  # Implementación del polinomio de Lagrange
    
    └── InterpolacionNewton.java    # Matriz de diferencias y polinomio de Newton


**Descripción de Componentes**

Clase                                       |                                     Responsabilidad Principal


Main.java                                   |                                     Define los arreglos de datos (x, y), ejecuta ambos métodos y presenta la evaluación comparativa.


InterpolacionLagrange.java                  |                                     Valida consistencia de nodos y calcula el resultado evaluando los productos de bases L_i(x).



InterpolacionNewton.java                    |                                     Construye la matriz triangular de diferencias divididas, extrae coeficientes a_k e imprime el resultado.



***Caso de Estudio Numérico***

Se probó el modelo con los siguientes datos de entrada extraídos de la función de referencia f(x) = x^2 + 1:

Nodos de Interpolación

Punto 1: (1.0, 2.0)

Punto 2: (2.0, 5.0)

Punto 3: (4.0, 17.0)

Evaluación

Punto de evaluación: Xeval= 3.0

Valor analítico real: {f(3.0) = 3^2 + 1 = 10.0

***Resultado de Ejecución en Consola***

=====================================================
            SISTEMA DE INTERPOLACIÓN NUMÉRICA
=====================================================

--- TABLA DE DIFERENCIAS DIVIDIDAS ---
x_i     f[x_i]  Orden 1 Orden 2 
-----------------------------------------------------
1.00    2.0000  3.0000  1.0000  
2.00    5.0000  6.0000  
4.00    17.0000 

--- COEFICIENTES DEL POLINOMIO (a_k) ---
a_0 = 2.0000
a_1 = 3.0000
a_2 = 1.0000

--- RESULTADO DE LA INTERPOLACIÓN ---
El valor estimado en x = 3.00 es P(3.00) = 10.0000

=====================================================


***Guía de Compilación y Uso***

Ejecutar la clase Main.java.

Opción 2: Línea de Comandos (Terminal)
# Ejecutar el programa principal
java -cp out interpolacion.Main
