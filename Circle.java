// Import the necessary classes for handling colors
import java.awt.Color;

// Create the Circle class
public class Circle {

    // Define the necessary instance variables
    private double radius;
    private Color color;

    // Define the default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = Color.BLACK;
    }

    // Define the parameterized constructor
    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    // Define the getter and setter methods for the radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Define the getter and setter methods for the color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Define the area method
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Define the perimeter method
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Define the toString method to provide a meaningful string representation of the Circle object
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }

    // Define the main method
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0 and a color of red
        Circle circle = new Circle(5.0, Color.RED);

        // Print the circle's details
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}


