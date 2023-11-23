package week_5;

public abstract class GeometricObject {
    protected String colour;
    protected boolean filled;

    // Default constructor
    public GeometricObject() {
        this.colour = "undefined";
        this.filled = false;
    }

    // Parameterized constructor
    public GeometricObject(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    // Setter method for colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Getter method for colour
    public String getColour() {
        return colour;
    }

    // Setter method for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter method for filled
    public boolean getFilled() {
        return filled;
    }

    // toString method
    @Override
    public String toString() {
        return "Colour: " + colour + ", Filled: " + filled;
    }

    // Abstract method to get area
    public abstract double getArea();

    // Abstract method to get perimeter
    public abstract double getPerimeter();

    // Abstract method to get shape name
    public abstract String getShape();
}
