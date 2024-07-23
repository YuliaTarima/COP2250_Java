// Yulia Tarima
// Chapter 12 Assignment 12.3

import java.util.Random;
import java.util.Scanner;

/**
 * This program creates an array with 100 randomly chosen integers.
 * Then it prompts the user to enter the index of the array,
 * and displays the corresponding element value.
 * It uses a try/catch for out of bounds indexes
 * to display the "Out of Bounds" error message.
 */

public class YuliaTarima_12_3 {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Fill with random integers from 0 to 99
        }

        // Prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index = scanner.nextInt();

        // Use a try/catch block to handle out of bounds indexes
        try {
            int value = array[index];
            System.out.println("Element at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Notify the user of the error
            System.out.println("Out of Bounds: please enter a valid index in range (0 - 99)");
        }

        // Close the scanner
        scanner.close();
    }
}