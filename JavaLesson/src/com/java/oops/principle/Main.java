//Create a new package
        package com.java.oops.principle;
//import scanner library
import java.util.Scanner;

//Create an abstract class Shape that will provide blueprint for geometric objects rectangle and circle
abstract class Shape {
//2 abstract methods area and perimeter
    abstract double area();
    abstract double perimeter();
}
//Create Circle class to inherit from Shape to implement abstract methods area and perimeter methods
class Circle extends Shape {

    //Encapsulate the instance variables radius by making it private, so they are hidden and can be accessed only through public methods of circle class
    private double radius;
    //Create public circle method to access the encapsulated instance variables
    public Circle(double radius) {
        //THIS to pass the values of instance variable to CONSTRUCTORS
        //THIS allows the constructor to initialize the instance variables with the values provided when creating an object of the class. And in java this way we can differentiate instance and a local variable
        this.radius = radius;
    }
    //PI is required to calculate the area and perimeter of circle, let’s define it as public to save memory and processing time.
    public double PI = Math.PI;
    //Construct area using method area to initialise radius instance variable
    //Method area and perimeter are inherited as they share relationship (Hierarchical inheritance) with parent class Shape
    @Override
    double area() {
        return PI * (radius * radius);
    }
    @Override
    double perimeter() {
        return 2 * PI * radius;
    }
}
    //Similarly create rectangle class
class Rectangle extends Shape {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }
    //overload the method rectangle to returns new length and breadth
    public Rectangle rectangle(double newLength, double newBreadth) {
        return new Rectangle(newLength, newBreadth);
    }
}
public class Main {
    public static void main(String[] args) {
        //Create instance for scanner class to take user input for variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        //Create the instance of rectangle class with a reference variable rectangle and assign the values to the variables
        //New keyword is used to create new object from Rectangle class constructed using 2 args
        Rectangle rectangle = new Rectangle(length, breadth);

        //Print the area of the rectangle by calling the method area from rectangle class
        //+ operator concatenate output value to string
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        //Scan the new length and new breadth from user to overload the size of the rectangle
        System.out.println("Enter new length of the rectangle: ");
        double newLength = scanner.nextDouble();
        System.out.println("Enter new breadth of the rectangle: ");
        double newBreadth = scanner.nextDouble();
        rectangle = rectangle.rectangle(newLength, newBreadth);
        System.out.println("Overloaded Rectangle area: " + rectangle.area());
        System.out.println("Overloaded Rectangle perimeter: " + rectangle.perimeter());
        //Do the same to print the circle
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());
        //Close the scanner class
        scanner.close();
    }
}


//This code can be optimised by declaring constant valuables as final - like length, breadth and radius
//using either int or float than a double for variable data types (depending on the application requirements)
//Use static methods: If a method does not need to access instance variables, it can be defined as a static method.
    // This allows the method to be called without creating an object of the class.
    // For example, you can make the rectangle method in the Rectangle class a static method, so that it can be called without creating a Rectangle object.