# Práctica de Programación Modular en Java: Métodos Iterativos

Proyecto desarrollado en Java que implementa la solución de un sistema de ecuaciones lineales de 3x3 mediante los métodos iterativos de Jacobi y Gauss-Seidel, utilizando una arquitectura modular de tres componentes.

## Descripción del Sistema

El sistema de ecuaciones lineales a resolver es el siguiente:

5x + y + z = 7
x + 4y + z = 6
x + 2y + 5z = 8

### Parámetros Iniciales:
* Matriz de coeficientes (A): [[5.0, 1.0, 1.0], [1.0, 4.0, 1.0], [1.0, 2.0, 5.0]]
* Vector independiente (b): [7.0, 6.0, 8.0]
* Aproximación inicial X^(0): [0.0, 0.0, 0.0]
* Tolerancia de error: 0.0001

---

## Estructura Modular del Proyecto

El código fuente está organizado bajo el paquete Metodos respetando la separación de responsabilidades en tres clases principales:

1. DefinicionSistema.java (Módulo 1): Almacena la matriz de coeficientes A, el vector independiente b, el vector de aproximación inicial y la tolerancia establecida.
2. MetodosIterativos.java (Módulo 2): Contiene la lógica matemática para calcular las iteraciones mediante el Método de Jacobi (con vector auxiliar) y el Método de Gauss-Seidel (con actualización inmediata de variables).
3. Main.java (Módulo 3 / Ejecución): Clase principal encargada de instanciar los componentes y ejecutar secuencialmente ambos métodos numéricos.
---

## Instrucciones de Compilación y Ejecución

Puedes abrir y ejecutar este proyecto utilizando cualquier IDE de Java (como IntelliJ IDEA o Eclipse):

1. Clona o descarga el repositorio en tu equipo.
2. Abre el proyecto asegurándote de que las tres clases estén dentro de la carpeta "Metodos_Iterativos".
3. Ejecuta el archivo principal Main.java para visualizar en la consola los resultados de las iteraciones y el error calculado.
