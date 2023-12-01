package day39_ConstructorOverloading;

public class C03_Rectangle_objects {
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(10,20);
        System.out.println("rectangle1 = " + rectangle1);
        rectangle1.witdh=7.5;
        System.out.println("rectangle1 = " + rectangle1);
    }
}
