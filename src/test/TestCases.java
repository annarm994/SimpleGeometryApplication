package test;

import main.*;

public class TestCases {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 5);

        assert circle.calculateArea() == Math.PI * 25 : "Circle area test failed";
        assert rectangle.calculatePerimeter() == 22 : "Rectangle perimeter test failed";
        assert triangle.calculateArea() == 6 : "Triangle area test failed";

        Shape tinyCircle = new Circle(0.001);
        assert tinyCircle.calculateArea() > 0 : "Tiny circle area test failed";

        Shape flatTriangle = new Triangle(1, 2, 3);
        assert flatTriangle.calculateArea() == 0 : "Flat triangle test failed";

        Shape square = new Rectangle(5, 5);
        assert square.calculatePerimeter() == 20 : "Square test failed";

        System.out.println("All test cases passed!");
    }
}
