***Métodos de Integración Numérica***

***Descripción***

Este proyecto implementa dos métodos numéricos para aproximar el valor de una integral definida:

- Método de Simpson 1/3 compuesto.
- Método del Trapecio compuesto.

Ambos métodos permiten calcular aproximaciones numéricas y comparar sus resultados utilizando un criterio de paro basado en la tolerancia establecida.

***Objetivo***

Implementar los métodos de Simpson 1/3 compuesto y Trapecio compuesto en Java, observar su comportamiento durante la ejecución y comparar sus resultados.

Lenguaje de programación

- Java

***Métodos implementados***

1. Método de Simpson 1/3 compuesto

Divide el intervalo de integración en un número par de subintervalos y utiliza parábolas para aproximar el área bajo la curva.

2. Método del Trapecio compuesto

Divide el intervalo de integración en varios subintervalos y aproxima el área bajo la curva mediante trapecios.

***Datos de prueba***

Para realizar las pruebas se utiliza la función:

[f(x)=x^3]

Con el intervalo de integración:

- Límite inferior: (a=0)
- Límite superior: (b=2)

La integral definida es:

[0^2 x^3,dx=4]

El valor exacto de la integral es 4.

***Criterio de paro***

Se utiliza una tolerancia para determinar cuándo detener las iteraciones de los métodos numéricos.

La tolerancia configurada para las pruebas es:

"0.0001"

El proceso se detiene cuando la diferencia absoluta entre dos aproximaciones consecutivas es menor que la tolerancia establecida, siempre que el código implemente esa condición.

***Archivos del proyecto***

- "SimpsonCompuesto.java": contiene la implementación del método de Simpson 1/3 compuesto.
- "TrapecioCompuesto.java": contiene la implementación del método del Trapecio compuesto.
- "Comparacion.java": ejecuta los métodos y permite comparar sus resultados.

***Requisitos***

- Tener instalado el JDK de Java.
- Contar con un editor de código o IDE compatible con Java.

***Ejecución***

1. Abrir el proyecto en el IDE.
2. Verificar que los archivos Java estén dentro del paquete correspondiente.
3. Ejecutar la clase "Comparacion.java".
4. Observar los resultados y las iteraciones que aparecen en la consola.

***Resultados esperados***

El método de Simpson 1/3 compuesto puede obtener el resultado exacto de 4 para esta función con una partición adecuada.

El método del Trapecio compuesto obtiene aproximaciones sucesivas que se acercan al valor exacto conforme aumenta el número de subintervalos.

Los resultados dependen de la tolerancia y de las condiciones de paro implementadas.

***Ejemplo de salida en consola al ejecutar ambos metodos***
Funcion: f(x) = x^3
Intervalo: [0, 2]
Tolerancia objetivo: 0.00010

--- ITERACIONES (TRAPECIO COMPUESTO) ---
n = 2   | Integral = 5.0000000000
n = 4   | Integral = 4.2500000000 | Error = 0.7500000000
n = 8   | Integral = 4.0625000000 | Error = 0.1875000000
n = 16  | Integral = 4.0156250000 | Error = 0.0468750000
n = 32  | Integral = 4.0039062500 | Error = 0.0117187500
n = 64  | Integral = 4.0009765625 | Error = 0.0029296875
n = 128 | Integral = 4.0002441406 | Error = 0.0007324219
n = 256 | Integral = 4.0000610352 | Error = 0.0001831055
n = 512 | Integral = 4.0000152588 | Error = 0.0000457764

--- ITERACIONES (SIMPSON 1/3 COMPUESTO) ---
n = 2 | Integral = 4.0000000000
n = 4 | Integral = 4.0000000000 | Error= 0.0000000000

--- ANALISIS DE RESULTADOS FINALES ---
Aproximacion Trapecio: 4.0000152588 | n = 512
 Aproximacion Simpson : 4.0000000000 | n = 4

Process finished with exit code 0


***Conclusión***

La implementación permite observar y comparar dos métodos de integración numérica. Simpson 1/3 compuesto puede ofrecer una aproximación exacta para la función de prueba con una partición adecuada, mientras que el método del Trapecio compuesto se aproxima progresivamente al valor de la integral.

La comparación permite analizar la precisión de ambos métodos y la importancia de establecer correctamente el criterio de paro.
