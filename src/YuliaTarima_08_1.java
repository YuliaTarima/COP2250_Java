// Yulia Tarima
// Chapter 8 Assignment 1

/*
This program reads a 3x4 matrix from the user
and then displays the sum of each column.
A method called sumColumn is used
to calculate the sum of all elements
in a specified column of the matrix.
*/

import java.util.Scanner;

public class YuliaTarima_08_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrix dimensions
        int rows = 3;
        int columns = 4;

        // Array to store the matrix
        double[][] matrix = new double[rows][columns];

        // Prompt the user to enter the matrix data
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Close the scanner to release resources
        scanner.close();

        // Display the sums of each column
        for (int j = 0; j < columns; j++) {
            System.out.println("Sum of the elements at column " + (j+1) + " is " + sumColumn(matrix, j));
        }
    }

    // Method to sum all elements in a specified column of the matrix
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }
}
