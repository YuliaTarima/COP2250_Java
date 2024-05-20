// Yulia Tarima
// Chapter 2 Assignment 5

// This program prompts the user for a subtotal and gratuity rate,
// then computes the gratuity and total.
// For example, if the user enters $10.00 for the subtotal
// and 15% for the gratuity rate,
// the program displays $1.50 as gratuity and $11.50 as total.

import java.util.Scanner;

public class YuliaTarima_02_05 {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt user for subtotal
        System.out.print("Enter the subtotal: $");
        double subtotal = input.nextDouble();

        // Prompt user for the gratuity rate
        System.out.print("Enter the gratuity rate (as a percentage): ");
        double gratuityRate = input.nextDouble();

        // Compute the gratuity amount
        double gratuity = subtotal * (gratuityRate / 100);

        // Compute the total amount
        double total = subtotal + gratuity;

        // Display gratuity and total
        System.out.printf("The gratuity is $%.2f and the total is $%.2f%n", gratuity, total);

        // Close the scanner
        input.close();
    }
}
