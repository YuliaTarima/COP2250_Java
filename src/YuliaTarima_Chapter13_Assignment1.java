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

public class YuliaTarima_Chapter13_Assignment1 {
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
class Rectangle_YT {

}

/**
 * Circle_YT Class Requirements:
 * <pre>
 *     - should be built upon code from the book
 *     - should extend the abstract GeometricObject class
 *     - has * double data fields for * defaulting to *
 *     - has no-arg constructor that creates a default circle
 *     - has constructor that creates a circle with the specified *
 *     - has accessor methods (getters and setters) for * of the circle
 *     - has @override getPerimeter() method returning perimeter of the circle
 *       (should return *)
 *     - has @override getArea() method returning area of the circle
 *       (should return *)
 * </pre>
 */
class Circle_YT {

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
class Triangle_YT {

}