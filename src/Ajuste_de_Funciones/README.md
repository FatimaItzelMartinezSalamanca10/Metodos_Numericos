***Regresión Lineal Simple por Mínimos Cuadrados***

​Práctica correspondiente a la Tarea 2 de la Unidad 5 de Métodos Numéricos. Este proyecto implementa en Java el método de mínimos cuadrados para ajustar una recta a un conjunto de cinco pares de coordenadas (x, y), calculando además el coeficiente de correlación lineal de Pearson (r), el coeficiente de determinación (r^2) y realizando una interpolación lineal para estimar el valor de y cuando x = 3.5.
​**Estructura del Proyecto**
​El código fuente está organizado dentro del paquete Ajuste_de_Funciones con la siguiente distribución:

Metodos_Numericos_U5

├── README.md

├── Reporte

└── Regresion-Lineal/

    └── src/
    
        └── Ajuste_de_Funciones/
        
            ├── Main.java
            
            └── RegresionLineal.java
            
Main.java: Contiene los arreglos con los datos de prueba (datosX y datosY), invoca los cálculos estadísticos y muestra la estimación interpolada para x = 3.5.
​RegresionLineal.java: Realiza el recorrido de sumatorias, determina la ordenada al origen (β0) y la pendiente (β1), calcula los indicadores r y r^2, e incluye el método predecir.
​

***Requisitos y Ejecución***


​Para compilar y ejecutar el programa localmente se necesita Git y Java JDK 21 (o superior) configurados en el sistema. No requiere librerías externas.

***Datos de Prueba y Salida en Consola***

​Al ejecutar el programa con los pares de datos (1.0, 2.0), (2.0, 4.0), (3.0, 5.0), (4.0, 4.0) y (5.0, 5.0), la consola arroja exactamente el siguiente resultado:
Valores independientes X: [1.0, 2.0, 3.0, 4.0, 5.0]
Valores dependientes Y: [2.0, 4.0, 5.0, 4.0, 5.0]
*** RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ***
Sumatorias: n=5, X=15.0, Y=20.0, X2=55.0, Y2=86.0, XY=66.0
Pendiente al origen (beta0): 2.2000
Ordenada al origen (beta1): 0.6000
Modelo obtenido: Y = 2.2000 + 0.6000x
Coeficiente de Pearson (r): 0.7746
Coeficiente de Determinacion (r2): 0.6000
Predicción interpolada para X = 3.5: 4.3000

***Interpretación de los Resultados***

​Ecuación de la recta: Con un intercepto de 2.2000 y una pendiente de 0.6000, el valor estimado de y incrementa 0.6 unidades por cada unidad que aumenta x.
​Correlación y ajuste (r y r^2): El coeficiente de Pearson (r = 0.7746) muestra una correlación lineal positiva fuerte, mientras que r^2 = 0.6000 indica que el modelo lineal explica el 60\% de la variabilidad de los datos.
​Estimación (x = 3.5): Al evaluar Y = 2.2000 + 0.6000(3.5), se obtiene una predicción exacta de 4.3000.
