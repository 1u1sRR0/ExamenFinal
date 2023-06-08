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

-------------------------------------------------------------------------------------------------------------------------------------------------------------

# Biblioteca

Este proyecto implementa un sistema de préstamos de libros en una biblioteca. Proporciona una interfaz para dar de alta/baja libros y usuarios, prestar/devolver libros, y realizar diferentes consultas sobre el estado de la biblioteca.

## Características

- Sólo se permiten usuarios de más de 8 años.
- Los libros tienen título, autor/es, identificador y categoría.
- Las categorías disponibles son: Aventuras, Ciencia Ficción, Romántica, Historia y Arte.
- Cada libro tiene una edad recomendada de lectura.
- Los usuarios solo pueden pedir prestados libros cuya edad recomendada sea inferior o igual a la suya.
- Pueden existir varias copias de un mismo libro.
- La información de los libros y los clientes se almacena en archivos.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Asegúrate de tener Java instalado en tu sistema.
3. Abre el proyecto en tu entorno de desarrollo preferido.

## Uso

1. Configura la biblioteca: abre el archivo `Main.java` y personaliza la lista de libros y usuarios iniciales según tus necesidades.
2. Ejecuta el programa.
3. Utiliza las opciones de menú para realizar diferentes acciones, como dar de alta libros y usuarios, prestar/devolver libros y realizar consultas sobre los libros disponibles.

## Estructura de archivos

- `Main.java`: Contiene el punto de entrada del programa y la lógica principal.
- `Biblioteca.java`: Define la clase `Biblioteca` que gestiona las operaciones de la biblioteca.
- `Libro.java`: Define la clase `Libro` que representa un libro en la biblioteca.
- `Usuario.java`: Define la clase `Usuario` que representa un usuario de la biblioteca.
- `libros.txt`: Archivo de texto que almacena la información de los libros.
- `usuarios.txt`: Archivo de texto que almacena la información de los usuarios.

