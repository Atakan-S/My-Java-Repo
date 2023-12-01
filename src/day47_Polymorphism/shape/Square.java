package day47_Polymorphism.shape;

public class Square extends Shape {
   private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
       if (side<0){
           System.out.println("Invalid Side Lenght "+side);
       }
        this.side = side;
    }

    public Square(double side) {
        super("square");
        setSide(side);
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
