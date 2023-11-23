package week_5;
public class Square extends GeometricObject {
    protected double side;

    // Default constructor
    public Square() {
        super(); // Call the constructor of the superclass (GeometricObject)
        this.side = 1.0;
    }

    // Parameterized constructor with side
    public Square(double side) {
        super(); // Call the constructor of the superclass (GeometricObject)
        this.side = side;
    }

    // Parameterized constructor with side, colour, and filled
    public Square(double side, String colour, boolean filled) {
        super(colour, filled); // Call the constructor of the superclass (GeometricObject)
        this.side = side;
    }

    // Setter method for side
    public void setSide(double side) {
        this.side = side;
    }

    // Getter method for side
    public double getSide() {
        return side;
    }

    // Implementation of the abstract method to get area
    @Override
    public double getArea() {
        return side * side;
    }

    // Implementation of the abstract method to get perimeter
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Implementation of the abstract method to get shape name
    @Override
    public String getShape() {
        return "Square";
    }
}

