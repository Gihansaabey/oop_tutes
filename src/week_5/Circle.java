package week_5;

public class Circle extends GeometricObject {
    protected double radius;

    // Default constructor
    public Circle() {
        super(); // Call the constructor of the superclass (GeometricObject)
        this.radius = 1.0;
    }

    // Parameterized constructor with radius
    public Circle(double radius) {
        super(); // Call the constructor of the superclass (GeometricObject)
        this.radius = radius;
    }

    // Parameterized constructor with radius, colour, and filled
    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled); // Call the constructor of the superclass (GeometricObject)
        this.radius = radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Implementation of the abstract method to get area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of the abstract method to get perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Implementation of the abstract method to get shape name
    @Override
    public String getShape() {
        return "Circle";
    }
}
