// Yulia Tarima
// Chapter 3 Assignment 17

// This program plays the popular rock-paper-scissor game with user.
// (Scissors can cut a paper, a rock can knock a scissor, and a paper can wrap a rock).
// The program randomly generates a number 0, 1, or 2 representing scissor, rock and paper.
// The program prompts the user to enter a number 0, 1, or 2
// and displays a message indicating whether the user or the computer wins, loses or draws.

import java.util.Scanner;
import java.util.Random;

public class YuliaTarima_03_17 {
    public static void main(String[] args) {

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Create a Random object to generate random choices for the computer
        Random random = new Random();

        // Prompt the user to enter a choice
        System.out.println("Welcome to Rock-Paper-Scissors game!");
        System.out.println("Enter 0 for Scissor, 1 for Rock, 2 for Paper: ");
        int userChoice = input.nextInt();

        // Generate a random choice for the computer (0, 1, or 2)
        int computerChoice = random.nextInt(3);

        // Display the computer's choice
        System.out.println("Computer's choice: " + getChoiceName(computerChoice));

        // Display the user's choice
        System.out.println("Your choice: " + getChoiceName(userChoice));

        // Determine the winner
        String result = determineWinner(userChoice, computerChoice);

        // Display the result
        System.out.println(result);

        // Close the scanner
        input.close();
    }

    // Method to get the choice name based on the number
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 0:
                return "Scissor";
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            default:
                return "Invalid choice";
        }
    }

    // Method to determine the winner
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a draw!";
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }
}