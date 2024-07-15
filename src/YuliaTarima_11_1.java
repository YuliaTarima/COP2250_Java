import java.util.Scanner;

// Triangle_YT class extending GeometricObject
class Triangle_YT extends GeometricObject {
    private final double side1;
    private final double side2;
    private final double side3;
    private String color;
    private boolean filled;

    /** Default constructor */
    public Triangle_YT() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
        color = "white";
        filled = false;
    }

    /** Constructor with specified sides */
    public Triangle_YT(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        color = "white";
        filled = false;
    }

    /** Getter for side1 */
    public double getSide1() {
        return side1;
    }

    /** Getter for side2 */
    public double getSide2() {
        return side2;
    }

    /** Getter for side3 */
    public double getSide3() {
        return side3;
    }

    /** Method to calculate perimeter */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Method to return area (which is 0 as per instructions) */
    public double getArea() {
        return 0;
    }

    /** Method to return string representation of the triangle */
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }

    /** Setter for color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Getter for color */
    public String getColor() {
        return color;
    }

    /** Setter for filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Getter for filled */
    public boolean isFilled() {
        return filled;
    }
}

// YuliaTarima_11_1 class (Test Program)
public class YuliaTarima_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter triangle sides
        System.out.print("Enter first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("\nEnter second side of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("\nEnter third side of the triangle: ");
        double side3 = input.nextDouble();

        // Create Triangle_YT object
        Triangle_YT triangle = new Triangle_YT(side1, side2, side3);

        // Prompt user for color and filled status
        System.out.print("\nEnter the color of the triangle: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Set color and filled status
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle information
        System.out.println("Triangle information:");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println(triangle.toString());

        input.close();
    }
}

