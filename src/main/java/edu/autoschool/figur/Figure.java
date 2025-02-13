package edu.autoschool.figur;

public abstract class Figure implements Comparable<Figure>{
    private String name;
    private double x, y; // Координати центру фігури

    public Figure(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea(); // Метод для розрахунку площі

    public String getCoordinates() {
        return "(" + x + ", " + y + ")";
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Figure other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public String toString() {
        return name + ", S=" + String.format("%.2f", calculateArea());
    }
}
