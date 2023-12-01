package day47_Polymorphism.shape;

public class Cube extends Shape implements Volume{
public double side;

    public Cube( double side) {
        super("Cube");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
