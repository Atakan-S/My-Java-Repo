package day47_Polymorphism.shape;

public class Triangle extends Shape{
    private  double side,side2,side3;

    public Triangle( double side, double side2, double side3) {
        super("Triangle");
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return side+side2+side3;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getSide() {
        return side;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
