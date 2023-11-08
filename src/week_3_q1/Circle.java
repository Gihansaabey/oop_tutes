package week_3_q1;

public class Circle {
    public double radius=1.0;
    private String colour="blue";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius ,String colour) {
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea( ){
        double area=Math.PI*radius*radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle[radius="+ radius+ ",colour="+colour+"]";

    }
}

