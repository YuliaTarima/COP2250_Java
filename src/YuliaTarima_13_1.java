// Yulia Tarima
// Chapter 13 Assignment 13.1

/**
 * Class YuliaTarima_Chapter13_Assignment1 (Test Program) Requirements:
 * <pre>
 *     - should be the only public class in the file
 *     - should contain main method
 *     - should create three instances of the GeometricObject class
 *       via Rectangle_YT, Circle_YT and Triangle_YT
 *     - should have a method comparing the equality of rectangle vs. circle areas
 *     - should have a method to compare perimeter of all 3 shapes two at a time
 * </pre>
 */

public class YuliaTarima_13_1 {
    // Main method
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        /*
          Requirements for testing Rectangle_YT Object:
          <pre>
              - Collect info from user, prompt the user to enter:
                   - length of rectangle
                   - width of rectangle
                   - string value for color
                   - boolean value for filled property
              - create a new Rectangle_YT object using user input values
                   - set length via Rectangle_YT setters
                   - set width via Rectangle_YT setters
                   - set color via GeometricObject setters
                   - set filled status via GeometricObject setters
              - display information to the user:
                   - area
                   - perimeter
                   - color
                   - value of filled property
          </pre>
         */
        System.out.print("\nBuilding a rectangle:");
        System.out.print("\n---------------------\n");
        // Collect rectangle info from the user
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();
        System.out.print("Enter the color of the rectangle: ");
        String rectangleColor = input.next();
        System.out.print("Is the rectangle filled? (true/false): ");
        boolean rectangleFilled = input.nextBoolean();

        // Create an instance of the GeometricObject class using Rectangle_YT
        GeometricObject rectangle = new Rectangle_YT(width, height);
        rectangle.setColor(rectangleColor);
        rectangle.setFilled(rectangleFilled);

        /*
          Requirements for testing Circle_YT object:
          <pre>
              - Collect info from user, prompt the user to enter:
                   - double value for radius
                   - string value for color
                   - boolean value for filled property
              - create a new Circle_YT object using user input values
                   - set radius via Circle_YT setters
                   - set color via GeometricObject setters
                   - set filled status via GeometricObject setters
              - display information to the user:
                   - area
                   - perimeter
                   - color
                   - value of filled property
          </pre>
         */
        System.out.print("\nBuilding a circle:");
        System.out.print("\n------------------\n");
        // Collect circle info from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.print("Enter the color of the circle: ");
        String circleColor = input.next();
        System.out.print("Is the circle filled? (true/false): ");
        boolean circleFilled = input.nextBoolean();
        // Create an instance of the GeometricObject class using Circle_YT
        GeometricObject circle = new Circle_YT(radius);
        circle.setColor(circleColor);
        circle.setFilled(circleFilled);

        /* Requirements for testing Triangle_YT object:
          <pre>
              - Collect info from user, prompt the user to enter:
                   - side1, side2, side3 (double)
                   - string value for color
                   - boolean value for filled property
              - create a new Triangle_YT object using user input values
                   - set ide1, side2, side3 via Triangle_YT setters
                   - set color via GeometricObject setters
                   - set filled status via GeometricObject setters
              - display information to the user:
                   - (do not display area)
                   - perimeter
                   - color
                   - value of filled property
          </pre>
         */
        System.out.print("\nBuilding a triangle:");
        System.out.print("\n-------------------\n");
        // Collect triangle info from the user
        System.out.print("Enter the side 1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the side 2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the side 3 of the triangle: ");
        double side3 = input.nextDouble();
        System.out.print("Enter the color of the triangle: ");
        String triangleColor = input.next();
        System.out.print("Is the triangle filled? (true/false): ");
        boolean triangleFilled = input.nextBoolean();

        // Create an instance of the GeometricObject class using Triangle_YT
        GeometricObject triangle = new Triangle_YT(side1, side2, side3);
        triangle.setColor(triangleColor);
        triangle.setFilled(triangleFilled);

        // Display results
        displayGeometricObject(rectangle);
        displayGeometricObject(circle);
        displayGeometricObject(triangle);

        // Compare areas and perimeters
        System.out.println("\nComparing Areas:");
        System.out.println("Rectangle and Circle: " + equalArea(rectangle, circle));

        System.out.println("\nComparing Perimeters:");
        System.out.println("Rectangle and Circle: " + comparePerimeter(rectangle, circle));
        System.out.println("Rectangle and Triangle: " + comparePerimeter(rectangle, triangle));
        System.out.println("Circle and Triangle: " + comparePerimeter(circle, triangle));
    }

    public static void displayGeometricObject(GeometricObject obj) {
        System.out.println("\nObject: " + obj.toString());
        // do not return area for triangle (placeholder for abstract method returns 0)
        if (obj.getArea() > 0) { System.out.println("Area: " + obj.getArea()); }
        System.out.println("Perimeter: " + obj.getPerimeter());
        System.out.println("Color: " + obj.getColor());
        System.out.println("Filled: " + obj.isFilled());
    }



    /**
     * A method for comparing the areas of two geometric objects
     */
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /**
     * A method for comparing the perimeters of three geometric objects two at a time
     */
    public static boolean comparePerimeter(GeometricObject object1, GeometricObject object2) {
        return object1.getPerimeter() == object2.getPerimeter();
    }
}

/**
 * Rectangle_YT Class Requirements:
 * <pre>
 *     - should be built upon <a href="</a>">assignment 9.1</a>
 *     - should extend the abstract GeometricObject class
 *     - has 2 double data fields for width and height defaulting to 1.0
 *     - has no-arg constructor that creates a default rectangle
 *     - has constructor that creates a triangle with the specified width and height
 *     - has accessor methods (getters and setters) for width and height of the rectangle
 *     - has @override getPerimeter() method returning perimeter of the rectangle
 *       (double getPerimeter() { return 2 * (width + height); })
 *     - has @override getArea() method returning area of the rectangle
 *       (double getArea() { return width * height; })
 * </pre>
 */
class Rectangle_YT extends GeometricObject {
    // Data fields with default values
    private double width = 1;
    private double height = 1;

    // No-arg constructor that creates a default rectangle
    Rectangle_YT() {
    }

    // Constructor that creates a rectangle with specified width and height
    Rectangle_YT(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Accessor methods (getters and setters) for width and height of the rectangle
    // Encapsulate setters to disable the write operation from the outside
    public double getWidth() { return width; }
    private void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    private void setHeight(double height) { this.height = height; }

    // Method returning perimeter of the rectangle
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Method getArea() returning area of the rectangle
    @Override
    public double getArea() {
        return width * height;
    }
}

/**
 * Circle_YT Class Requirements:
 * <pre>
 *     - should be built upon <a href="https://liveexample.pearsoncmg.com/liang/intro12e/html/Circle.html">code from the book</a>
 *     - should extend the abstract GeometricObject class
 *     - has a radius double data field defaulting to 1
 *     - has no-arg constructor that creates a default circle
 *     - has constructor that creates a circle with the specified radius
 *     - has accessor methods (getters and setters) for the radius of the circle
 *     - has @override getPerimeter() method returning perimeter of the circle
 *     - has @override getArea() method returning area of the circle
 * </pre>
 */
class Circle_YT extends GeometricObject {

    // Data field with default values
    private double radius = 1;

    // No-arg constructor that creates a default circle
    Circle_YT() { }

    // Constructor that creates a circle with specified radius
    Circle_YT(double radius) { setRadius(radius); }

    // Accessor methods (getters and setters) for the radius of the circle
    public double getRadius() {
        return radius;
    }
    // Encapsulate setter to disable the write operation from the outside
    private void setRadius(double radius) { this.radius = radius; }

    // Method returning perimeter of the circle
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Method getArea() returning area of the circle
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}


/**
 * Triangle_YT Class Requirements:
 * <pre>
 *     - should be built upon <a href="YuliaTarima_11_1.java">assignment 11.1</a>
 *     - should extend the abstract GeometricObject class
 *     - has 3 double data fields for sides defaulting to 1.0
 *     - has no-arg constructor that creates a default triangle
 *     - has constructor that creates a triangle with the specified sides
 *     - has accessor methods (getters and setters) for all three sides of the triangle
 *     - has @override getPerimeter() method returning perimeter of the triangle
 *     - has @override getArea() method returning area of the triangle
 *       (should return 0 - placeholder implementation needed to inherit abstract class)
 * </pre>
 */
class Triangle_YT extends GeometricObject {
    // Three double data fields for sides defaulting to 1.0
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // No-arg constructor that creates a default triangle
    public Triangle_YT() {
    }

    // Constructor that creates a triangle with the specified sides
    public Triangle_YT(double side1, double side2, double side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    // Accessor methods (getters and setters) for side1, side2, side3 of the triangle
    // Encapsulate setters to disable the write operation from the outside
    public double getSide1() {
        return side1;
    }
    private void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    private void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    private void setSide3(double side3) {
        this.side3 = side3;
    }

    // Method returning perimeter of the triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Method getArea() returning 0
    // (placeholder implementation needed to inherit abstract class)
    @Override
    public double getArea() {
        return 0;
    }
}