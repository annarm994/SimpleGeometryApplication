package main;

public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
