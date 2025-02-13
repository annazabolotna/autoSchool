package edu.autoschool.figur;

public class Triangle extends Figure {

    private double side;

    public Triangle(double x, double y, double side) {
        super("Triangle", x, y);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side; //для трикутника (правильного, рівностороннього)
    }
}
