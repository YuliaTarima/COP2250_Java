// Yulia Tarima
// Chapter 4 Assignment 13
// Version 2

// This program prompts the user to enter a letter.
// It checks and displays to the user
// whether the letter is a vowel or consonant.
// In case of a non-letter, it displays 'invalid input'.

import java.util.Scanner;

public class YuliaTarima_04_13_v2 {
    public static void main(String[] args) {
        // Create Scanner and char
        Scanner sc = new Scanner(System.in);
        String c;

        // Demand Valid Input
        while ((c = requestInput(sc)).length() != 1 || !Character.isLetter(c.charAt(0)))
            System.out.println("Invalid Input\n");

        // Print Output
        System.out.println(isVowel(c.charAt(0)) ? "Vowel" : "Consonant");
    }

    // Grab first char of input
    public static String requestInput(Scanner sc) {
        System.out.print("Enter Character: ");
        return sc.nextLine();
    }

    // Test if char is vowel
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }
}