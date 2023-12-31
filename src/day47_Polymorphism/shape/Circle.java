package day47_Polymorphism.shape;

public class Circle extends Shape{
private double radius;

public final static double PI = Math.PI;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
