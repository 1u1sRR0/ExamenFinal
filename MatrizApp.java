public class MatrizApp {

    // Método para obtener Matriz A
    public static int[][] getMatrizA() {
        return new int[][] { { 1, 4 }, { 6, 4 } };
    }

    // Método para obtener Matriz C
    public static int[][] getMatrizC() {
        return new int[][] { { 2, 9 }, { 6, 1 } };
    }

    // Método para calcular la matriz B
    public static int[][] calculateB(int[][] A, int[][] C) {
        // Verificamos si las dimensiones son iguales
        if (A.length != C.length || A[0].length != C[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones");
        }

        int[][] B = new int[A.length][A[0].length];

        // Calculamos B = C - A
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[i][j] = C[i][j] - A[i][j];
            }
        }

        return B;
    }

    // Método para imprimir la matriz
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        int[][] A = getMatrizA();
        int[][] C = getMatrizC();

        int[][] B = calculateB(A, C);

        printMatrix(B); // Debería imprimir la matriz B
    }
}
