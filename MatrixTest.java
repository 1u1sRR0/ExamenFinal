import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {
    @Test
    public void testSubtract() throws Exception {
        Matrix A = new Matrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        Matrix C = new Matrix(new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } });
        Matrix B = A.subtract(C);
        Matrix expectedB = new Matrix(new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } });
        assertTrue(B.equals(expectedB));
    }

    @Test
    public void testFromFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("test.txt"));
        writer.println("1 2 3");
        writer.println("4 5 6");
        writer.println("7 8 9");
        writer.close();

        Matrix matrix = Matrix.fromFile("test.txt");
        Matrix expectedMatrix = new Matrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        assertTrue(matrix.equals(expectedMatrix));
    }

    @Test
    public void testToFile() throws IOException {
        Matrix matrix = new Matrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        matrix.toFile("test.txt");

        Matrix matrixFromFile = Matrix.fromFile("test.txt");
        assertTrue(matrix.equals(matrixFromFile));
    }
}
