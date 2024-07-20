// Yulia Tarima
// Chapter 11 Assignment 1

/* This program displays
 *    perimeter,
 *    color,
 *    true or false to indicate whether filled or not,
 * side length information
 * of the Triangle_YT extending GeometricObject
 * based on the information collected from user input.
*/

import java.util.Scanner;

/** Requirements for Triangle_YT class:
 * <pre>
 *     - should extend the abstract GeometricObject class
 *     - has 3 double data fields for sides defaulting to 1.0
 *     - has no-arg constructor that creates a default triangle
 *     - has constructor that creates a triangle with the specified sides
 *     - has accessor methods (getters and setters) for all three sides of the triangle
 *     - has @override getPerimeter() method returning perimeter of the triangle
 *     - has @override getArea() method returning area of the triangle
 *       (should return 0 - placeholder implementation needed to inherit abstract class)
 *     - has toString() method returning a string description for the triangle sides
 * </pre>
 */
class Triangle_YT_11_1 extends GeometricObject {
    // Three double data fields for sides defaulting to 1.0
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // No-arg constructor that creates a default triangle
    public Triangle_YT_11_1() {
    }

    // Constructor that creates a triangle with the specified sides
    public Triangle_YT_11_1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessor methods (getters and setters) for side1, side2, side3 of the triangle
    public double getSide1() { return side1; }
    public void setSide1(double side1) { this.side1 = side1; }
    public double getSide2() { return side2; }
    public void setSide2(double side2) { this.side2 = side2; }
    public double getSide3() { return side3; }
    public void setSide3(double side3) { this.side3 = side3; }

    // Method returning perimeter of the triangle
    @Override
    public double getPerimeter() { return side1 + side2 + side3; }

    // Method getArea() returning 0
    // (placeholder implementation needed to inherit abstract class)
    @Override
    public double getArea() { return 0; }

    // Method toString() returning a string description for the triangle sides
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

/** Requirements for YuliaTarima_11_1 class (Test Program)
 * <pre>
 *     - prompt the user to enter side1, side2, side3 for a triangle (double)
 *     - create Triangle_YT object using user input for sides
 *     - prompt the user to enter color of triangle (string)
 *     - prompt the user to enter boolean value for filled property of triangle
 *     - set user input values for color and filled status via GeometricObject setters
 *     - display the information for perimeter, color, filled status,
 *       and sides of the triangle back to the user
 * </pre>
 */
public class YuliaTarima_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter triangle sides
        System.out.print("Enter first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter second side of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter third side of the triangle: ");
        double side3 = input.nextDouble();

        // Create Triangle_YT object using user input for sides
        Triangle_YT_11_1 triangle = new Triangle_YT_11_1(side1, side2, side3);

        // Prompt user for color and filled status
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Set user input values for color and filled status via GeometricObject
        triangle.setColor(color);
        triangle.setFilled(filled);

        /* 2.5 Display triangle properties */
        System.out.println("---------------------\n" +
                "Triangle information:\n---------------------");
        // display perimeter
        System.out.println("Perimeter: " + triangle.getPerimeter());
        // display color
        System.out.println("Color: " + triangle.getColor());
        // display filled status
        System.out.println("Filled: " + triangle.isFilled());
        // display triangle information for sides
        System.out.println(triangle.toString());
        System.out.println("---------------------");

        input.close();
    }
}