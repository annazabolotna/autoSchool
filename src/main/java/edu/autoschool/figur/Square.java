package edu.autoschool.figur;

public class Square extends Figure {

    private double side;

    public Square(double x, double y, double side) {
        super("Square", x, y);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
