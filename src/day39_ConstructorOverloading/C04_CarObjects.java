package day39_ConstructorOverloading;

public class C04_CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        System.out.println("car1.hiz = " + car1.hiz);
        System.out.println("car1.marka = " + car1.marka);
        System.out.println("car1.model = " + car1.model);
        System.out.println("car1.renk = " + car1.renk);
        System.out.println("car1.otomatikMi = " + car1.otomatikMi);
        Car car2=new Car("honda","Accord","Siyah");
        System.out.println(car2);
        Car.renkSec(car2 ,"mavi");
        System.out.println("car2 = " + car2);

    }
}
