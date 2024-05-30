// Yulia Tarima
// Chapter 5 Assignment 1

// This program prompts the user to enter an unspecified number of integers.
// The program then determines how many positive and negative values have been entered
// and computes the total and average of the input values (not counting zeros).
// The program ends when 0 is input
// and displays the average as a floating-point number.

import java.util.Scanner;

public class YuliaTarima_05_1 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Counter for positive numbers
        int countPositive = 0;
        // Counter for negative numbers
        int countNegative = 0;

        // Variable to store the sum of all entered numbers
        int total = 0;
        // Counter for the total number of entered numbers
        int count = 0;

        // Prompt the user to enter integers
        System.out.println("Enter an integer (the input ends if it is 0):");

        // Infinite loop to continuously read integers from the user
        while (true) {
            // Read the next integer from the user
            int number = scanner.nextInt();
            // Prompt the user to enter integers
            System.out.println("Enter an integer (the input ends if it is 0):");

            // If the entered number is 0, break out of the loop
            if (number == 0) {
                break;
            }

            // Check if the entered number is positive
            if (number > 0) {
                // Increment the count of positive numbers
                countPositive++;
            } else {
                // Increment the count of negative numbers
                countNegative++;
            }

            // Add the entered number to the total sum
            total += number;

            // Increment the count of entered numbers
            count++;
        }

        // Close the scanner to release resources
        scanner.close();

        // If no numbers were entered (only 0 was entered), print a message and exit
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
            return;
        }

        // Calculate the average of the entered numbers
        double average = (double) total / count;

        // Print the results
        System.out.println("The number of positives is " + countPositive);
        System.out.println("The number of negatives is " + countNegative);
        System.out.println("The total is " + total);
        // Print the average to two decimal places
        System.out.printf("The average is %.2f\n", average);
    }
}