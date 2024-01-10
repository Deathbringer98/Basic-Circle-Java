public class Demo {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0 and a color of red
        Circle circle = new Circle(5.0, Color.RED);

        // Print the circle's details
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}