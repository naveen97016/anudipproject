package projectanudip;

import java.util.Scanner;
abstract class Shape {
    abstract void calculation();
}
class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void calculation() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    void calculation() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double width = sc.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        rectangle.calculation();
        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        circle.calculation();
    }
}
