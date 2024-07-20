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


/** 1. Triangle_YT class extending GeometricObject */
class Triangle_YT extends GeometricObject {
    // Three double data fields for sides defaulting to 1.0
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /* 1.1 No-arg constructor that creates a default triangle */
    public Triangle_YT() {
    }

    /* 1.2 Constructor that creates a triangle with the specified sides */
    public Triangle_YT(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /* 1.3. Accessor methods for all three sides of the triangle */
    // Getter and setter for side1
    public double getSide1() { return side1; }
    public void setSide1(double side1) { this.side1 = side1; }

    // Getter and setter for side2
    public double getSide2() { return side2; }
    public void setSide2(double side2) { this.side2 = side2; }

    // Getter and setter for side3
    public double getSide3() { return side3; }
    public void setSide3(double side3) { this.side3 = side3; }

    /* 1.4. Method returning perimeter of the triangle */
    @Override
    public double getPerimeter() { return side1 + side2 + side3; }

    /* 1.5. Method getArea() returning 0
    (placeholder implementation needed to inherit abstract class) */
    @Override
    public double getArea() { return 0; }

    /* 1.6. Method returning a string description for the triangle sides */
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

/** 2. YuliaTarima_11_1 class (Test Program) */
public class YuliaTarima_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* 2.1 Prompt user to enter triangle sides */
        System.out.print("Enter first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter second side of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter third side of the triangle: ");
        double side3 = input.nextDouble();

        /* 2.2 Create Triangle_YT object using user input for sides */
        Triangle_YT triangle = new Triangle_YT(side1, side2, side3);

        /* 2.3 Prompt user for color and filled status */
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        /* 2.4 Set color and filled status via GeometricObject using user input */
        triangle.setColor(color);
        triangle.setFilled(filled);

        /* 2.5 Display triangle properties */
        System.out.println("---------------------\nTriangle information:\n---------------------");
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