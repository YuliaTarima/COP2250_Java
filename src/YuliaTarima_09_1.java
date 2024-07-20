// Yulia Tarima
// Chapter 9 Assignment 1

// This program defines a class named Rectangle_YT
// to represent a rectangle with properties width and height.
// It includes methods to calculate the area and perimeter of the rectangle.
// A test program creates two specific rectangles
// and prints their width, height, area, and perimeter.

class Rectangle_YT_9_1 {
    // Data fields with default values
    double width = 1;
    double height = 1;

    // No-arg constructor that creates a default rectangle
    Rectangle_YT_9_1() {}

    // Constructor that creates a rectangle with specified width and height
    Rectangle_YT_9_1(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // Method to get the area of the rectangle
    double getArea() {
        return width * height;
    }

    // Method to get the perimeter of the rectangle
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class YuliaTarima_09_1 {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle_YT_9_1 rectangle1 = new Rectangle_YT_9_1(4, 40);
        Rectangle_YT_9_1 rectangle2 = new Rectangle_YT_9_1(3.5, 35.9);

        // Display the properties of the first rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Display the properties of the second rectangle
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}