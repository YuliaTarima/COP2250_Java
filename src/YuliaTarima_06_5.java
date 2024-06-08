// Yulia Tarima
// Chapter 6 Assignment 6.5

// This program prompts the user to enter three numbers
// and displays them in increasing order.
//
// Flow:
// displaySortedNumbers(double num1, double num2, double num3)
// method sorts and displays three numbers in increasing order.
//
// getValidNumber helper method repeatedly prompts the user for input
// until a valid number is entered.
//
// A separate main method prompts the user to enter three numbers,
// ensures each input is valid before proceeding
// via getValidNumber helper method,
// and then calls the method displaySortedNumbers
// which uses an array and a sorting function.
// to display inputted numbers in increasing order.

import java.util.Scanner;
import java.util.Arrays;

public class YuliaTarima_06_5 {

    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Please, enter three numbers to be sorted.");

        // Read and validate three double values from the user
        double num1 = getValidNumber(scanner, "Enter the first number: ");
        double num2 = getValidNumber(scanner, "Enter the second number: ");
        double num3 = getValidNumber(scanner, "Enter the third number: ");

        // Close the scanner to release resources
        scanner.close();

        // Call the method to display the sorted numbers
        displaySortedNumbers(num1, num2, num3);
    }

    /**
     * Prompts the user to enter a valid number, repeating until the user enters a valid number.
     *
     * @param scanner the Scanner object used to read input from the console
     * @param prompt  the prompt message to display to the user
     * @return the valid number entered by the user
     */

    private static double getValidNumber(Scanner scanner, String prompt) {
        double number;
        // Start an infinite loop to repeatedly prompt for valid input
        while (true) {
            // Display the prompt message to the user
            System.out.print(prompt);
            // Check if the next input is a valid double
            if (scanner.hasNextDouble()) {
                // Read the valid double input
                number = scanner.nextDouble();
                // Exit the loop since a valid number has been entered
                break;
            } else {
                // Inform the user about invalid input
                System.out.println("Invalid input. Please enter a valid number.");
                // Clear the invalid input from the scanner buffer
                scanner.next();
            }
        }
        // Return the valid number entered by the user
        return number;
    }

    /**
     * Sorts and displays three numbers in increasing order.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     */

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Place the numbers into an array
        double[] numbers = {num1, num2, num3};

        // Sort the array
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("The numbers in increasing order are: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
    }

}