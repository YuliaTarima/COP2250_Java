// Yulia Tarima
// Chapter 10 Assignment 3

// This program defines a class named MyInteger_YT to encapsulate an integer value.
// It provides methods to check if the number is even or odd, and methods to compare values.
// A test program validates all functionalities of the MyInteger class.

class MyInteger_YT {
    private final int value; // Stores the integer value

    // Constructor
    public MyInteger_YT(int value) {
        this.value = value;
    }

    // Getter method for the value
    public int getValue() {
        return this.value;
    }

    // Check if the value is even
    public boolean isEven() {
        return isEven(this.value);
    }

    // Check if the value is odd
    public boolean isOdd() {
        return isOdd(this.value);
    }

    // Static method to check if an int is even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    // Static method to check if an int is odd
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    // Static method to check if a MyInteger_YT object is even
    public static boolean isEven(MyInteger_YT myInt) {
        return isEven(myInt.value);
    }

    // Static method to check if a MyInteger_YT object is odd
    public static boolean isOdd(MyInteger_YT myInt) {
        return isOdd(myInt.value);
    }

    // Check if this value is equal to the specified int
    public boolean equals(int anotherInt) {
        return this.value == anotherInt;
    }

    // Check if this value is equal to the value of the specified MyInteger_YT object
    public boolean equals(MyInteger_YT anotherMyInt) {
        return this.value == anotherMyInt.value;
    }
}

public class YuliaTarima_10_3 {
    public static void main(String[] args) {
        MyInteger_YT myInt1 = new MyInteger_YT(10);
        MyInteger_YT myInt2 = new MyInteger_YT(15);

        // Test the methods
        System.out.println("myInt1 is even? " + myInt1.isEven());
        System.out.println("myInt2 is odd? " + myInt2.isOdd());
        System.out.println("15 is odd? " + MyInteger_YT.isOdd(15));
        System.out.println("10 is even? " + MyInteger_YT.isEven(10));
        System.out.println("myInt1 is even? " + MyInteger_YT.isEven(myInt1));
        System.out.println("myInt2 is odd? " + MyInteger_YT.isOdd(myInt2));
        System.out.println("myInt1 equals 10? " + myInt1.equals(10));
        System.out.println("myInt1 equals myInt2? " + myInt1.equals(myInt2));
    }
}
