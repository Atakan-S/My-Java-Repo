package day21_ClassAndMethods;

public class Main {
    public static void main(String[] args) {
        //Calculator calculator = new Calculator();
        //System.out.println("calculator.add(4,7) = " + calculator.add(4, 7));
    /*Person ali = new Person();
    ali.name="ali";
    ali.age=23;
    ali.gender="Erkek";
    ali.tcNo="123456789";
        System.out.println("ali.average(50) = " + ali.average(50));
        ali.uyu();
        System.out.println("ali.name = " + ali.name);
        System.out.println("ali.age = " + ali.age);
        System.out.println("ali.gender = " + ali.gender);
        System.out.println("ali.tcNo = " + ali.tcNo);
     */
    Car car = new Car();
    car.hız = 200;
    car.marka = "BMW";
    car.model = "M3";
    car.renk = "mavi";
    car.dur();
    car.hızlan();
    car.Çalıştır();


circle circle = new circle();
circle.r=20;
        System.out.println("circle.alanHesapla() = " + circle.alanHesapla());
        System.out.println("circle.çevreHesapla() = " + circle.çevreHesapla());

    }
}
