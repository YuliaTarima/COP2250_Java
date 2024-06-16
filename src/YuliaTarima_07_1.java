// Yulia Tarima
// Chapter 7 Assignment 7.1

/*
 * This program prompts the user to enter the number of students and their scores,
 * finds the best score, and assigns grades according to the score distribution.
 * The grading scheme is based on the difference between each score and the best score.
 * */

import java.util.Scanner;

public class YuliaTarima_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        int numberOfStudents = getValidInteger(scanner, "Enter the number of students:");

        // Array to hold the scores
        double[] scores = new double[numberOfStudents];

        // Prompt the user to enter the scores
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = getValidDouble(scanner, "Enter score for student " + (i + 1) + ":");
        }

        // Close the scanner to release resources
        scanner.close();

        // Find the best score
        double bestScore = findBestScore(scores);

        // Display the grades for each student
        displayGrades(scores, bestScore);
    }

    // Method to find the best score
    public static double findBestScore(double[] scores) {
        double best = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        return best;
    }

    // Method to display grades
    public static void displayGrades(double[] scores, double bestScore) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + determineGrade(scores[i], bestScore));
        }
    }

    // Method to determine the grade
    public static String determineGrade(double score, double bestScore) {
        if (score >= bestScore - 10) return "A";
        if (score >= bestScore - 20) return "B";
        if (score >= bestScore - 30) return "C";
        if (score >= bestScore - 40) return "D";
        return "F";
    }

    // Method to get a valid integer input
    public static int getValidInteger(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return value;
    }

    // Method to get a valid double input
    public static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return value;
    }
}