package edu.autoschool.figur;

public class Circle extends Figure {

    private double radius;

    public Circle(double x, double y, double radius) {
        super("Circle", x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
