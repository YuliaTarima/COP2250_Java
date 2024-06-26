// Yulia Tarima
// Chapter 1 Assignment 9

// This program displays the area and perimeter
// of a rectangle with a width of 4.5 and a height of 7.9.

// This Java program begins execution in the main method.
// It declares variables for width and height,
// then it calculates the area and perimeter using the following formulas:
// area = width x height
// perimeter = 2 x (width + height).
// Finally, the results are displayed to the user.

public class YuliaTarima_01_09 {
    // Main method where program execution begins
    public static void main(String[] args) {

        // Declare variables for width and height of the rectangle

        double width = 4.5; // Width of the rectangle of double datatype
        double height = 7.9; // Height of the rectangle

        // Calculate the area of the rectangle
        double area = width * height; // Area = width x height

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (width + height); // Perimeter = 2 x (width + height)

        // Display the calculated area and perimeter
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}