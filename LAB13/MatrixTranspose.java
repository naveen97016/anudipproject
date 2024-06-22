package projectanudip;
import java.util.Scanner;

public class MatrixTranspose {
    
    // Method to get matrix data from user
    public static int[][] getMatrixData(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    
    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Method to get transpose of the matrix
    public static int[][] getTranspose(int[][] matrix, int rows, int cols) {
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        
        // Get matrix data from user
        int[][] matrix = getMatrixData(rows, cols);
        
        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix, rows, cols);
        
        // Get and print the transpose of the matrix
        int[][] transpose = getTranspose(matrix, rows, cols);
        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose, cols, rows);
    }
}
