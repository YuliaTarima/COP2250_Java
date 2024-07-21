/**
 * Program Requirements:
 * <p>
 * Create four separate classes in the same file with their own set of braces.
 * List classes in the following order in the file.
 *  <ol>
 *      <li>public class YuliaTarima_Chapter13_Assignment1</li>
 *      <li>class Rectangle_YT</li>
 *      <li>class Circle_YT</li>
 *      <li>class Triangle_YT</li>
 *  </ol>
 * <p>
 */

/**
 * Class YuliaTarima_Chapter13_Assignment1 (Test Program) Requirements:
 * <pre>
 *     - should be the only public class in the file
 *     - should contain main method
 *     - should create three instances of the GeometricObject class
 *       via Rectangle_YT, Circle_YT and Triangle_YT
 *     - should create a method to compare the areas of the rectangle and circle
 *       to see if equal (using GeometricObject)
 *       (may have to be written outside public static void main {})
 *     - should create a method to compare perimeter of all 3 shapes
 *       but only comparing two at a time
 *       (may have to be written outside public static void main {})
 * </pre>
 * <p>
 * Requirements for testing Rectangle_YT Object:
 * <pre>
 *
 *
 *     - prompt the user to enter color (string)
 *     - prompt the user to enter boolean value for filled property
 *     - set user input values for color and filled status via GeometricObject setters
 *     - display area
 *     - display perimeter
 *     - display color
 *     - display value of filled property
 * </pre>
 * <pre>
 *     - Collect info from user, prompt the user to enter:
 *          - length of rectangle
 *          - width of rectangle
 *          - string value for color
 *          - boolean value for filled property
 *     - create a new Rectangle_YT object using user input values
 *          - set length via Rectangle_YT setters
 *          - set width via Rectangle_YT setters
 *          - set color via GeometricObject setters
 *          - set filled status via GeometricObject setters
 *     - display information to the user:
 *          - area
 *          - perimeter
 *          - color
 *          - value of filled property
 * </pre>
 * <p>
 * Requirements for testing Circle_YT object:
 * <pre>
 *     - Collect info from user, prompt the user to enter:
 *          -
 *          -
 *          - string value for color
 *          - boolean value for filled property
 *     - create a new Circle_YT object using user input values
 *          - set ***** via Circle_YT setters
 *          - set color via GeometricObject setters
 *          - set filled status via GeometricObject setters
 *     - display information to the user:
 *          - area
 *          - perimeter
 *          - color
 *          - value of filled property
 * </pre>
 * <p>
 * Requirements for testing Triangle_YT object:
 * <pre>
 *     - Collect info from user, prompt the user to enter:
 *          - side1, side2, side3 (double)
 *          - string value for color
 *          - boolean value for filled property
 *     - create a new Triangle_YT object using user input values
 *          - set ide1, side2, side3 via Triangle_YT setters
 *          - set color via GeometricObject setters
 *          - set filled status via GeometricObject setters
 *     - display information to the user:
 *          - (do not display area)
 *          - perimeter
 *          - color
 *          - value of filled property
 * </pre>
 */

public class YuliaTarima_13_1 {
    public static void main(String[] args) {

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
    double width = 1;
    double height = 1;

    // No-arg constructor that creates a default rectangle
    Rectangle_YT() {
    }

    // Constructor that creates a rectangle with specified width and height
    Rectangle_YT(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

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
 *     - should be built upon code from the book
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
    double radius = 1;

    // No-arg constructor that creates a default circle
    Circle_YT() {
    }

    // Constructor that creates a circle with specified radius
    Circle_YT(double radius) {
        this.radius = radius;
    }

    // Accessor methods (getters and setters) for the radius of the circle
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) { this.radius = radius; }

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
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessor methods (getters and setters) for side1, side2, side3 of the triangle
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
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