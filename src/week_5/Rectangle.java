package week_5;

public class Rectangle extends GeometricObject {
    protected double length;
    protected double width;

    // Default constructor
    public Rectangle() {
        super(); // Call the constructor of the superclass (GeometricObject)
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor with length and width
    public Rectangle(double length, double width) {
        super(); // Call the constructor of the superclass (GeometricObject)
        this.length = length;
        this.width = width;
    }

    // Parameterized constructor with length, width, colour, and filled
    public Rectangle(double length, double width, String colour, boolean filled) {
        super(colour, filled); // Call the constructor of the superclass (GeometricObject)
        this.length = length;
        this.width = width;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Implementation of the abstract method to get area
    @Override
    public double getArea() {
        return length * width;
    }

    // Implementation of the abstract method to get perimeter
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Implementation of the abstract method to get shape name
    @Override
    public String getShape() {
        return "Rectangle";
    }
}
