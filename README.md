# ExamenFinal
Examen Final Luis Rendon
# MatrizApp en Java

MatrizApp es una pequeña aplicación de consola en Java que calcula una matriz B dadas las matrices A y C con la ecuación A + B = C.

## Uso

La aplicación define tres matrices bidimensionales, A, B y C. Actualmente, las matrices A y C están codificadas en el código fuente de la aplicación y se calcula B basándose en ellas.

## Código

El código consta de un único archivo, `MatrizApp.java`, que contiene cinco métodos estáticos:

- `getMatrizA()`: Devuelve una matriz 2D predefinida que representa la matriz A.
- `getMatrizC()`: Devuelve una matriz 2D predefinida que representa la matriz C.
- `calculateB(int[][] A, int[][] C)`: Dadas las matrices A y C, calcula y devuelve la matriz B utilizando la ecuación B = C - A.
- `printMatrix(int[][] matrix)`: Dada una matriz 2D, la imprime en la consola.
- `main(String[] args)`: Es el punto de entrada de la aplicación. Obtiene las matrices A y C, calcula B y luego imprime B.

## Ejecución

Para ejecutar la aplicación, debe tener instalado Java en su máquina y VisualStudio Code. 

## Personalización

Para personalizar las matrices A y C, modifique los métodos `getMatrizA()` y `getMatrizC()` en el código fuente para devolver las matrices de su elección.
