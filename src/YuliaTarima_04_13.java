// Yulia Tarima
// Chapter 4 Assignment 13

// This program prompts the user to enter a letter.
// It checks and displays to the user
// whether the letter is a vowel or consonant.
// In case of a non-letter, it displays 'invalid input'.

import java.util.Scanner;

public class YuliaTarima_04_13 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Check if the letter is a vowel or consonant
        printVowelOrConsonant(getAndValidateUserInput(scanner));

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Function to get and sanitize user input
    public static String getAndSanitizeInput(Scanner scanner) {
        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        // Read, trim, and convert the input to lowercase
        return scanner.next().trim().toLowerCase();
    }

    // Function to get validated user input
    public static char getAndValidateUserInput(Scanner scanner) {
        // Get and sanitize user input
        String sanitizedInput = getAndSanitizeInput(scanner);
        // Keep asking for the valid input if too long/short or not a letter
        while (sanitizedInput.length() != 1 || !Character.isLetter(sanitizedInput.charAt(0))) {
            System.out.print("Invalid input.\n");
            sanitizedInput = getAndSanitizeInput(scanner);
        }
        // return sanitized and validated input
        return sanitizedInput.charAt(0);
    }

    // Function to check if a character is a vowel/consonant and print the result
    public static void printVowelOrConsonant(char letter) {
        // Check if char is a vowel or consonant and print the result
        System.out.println(letter + " is a " +
                ("aeiou".indexOf(letter) != -1
                        ? "vowel."
                        : "consonant."
                ));
    }
}