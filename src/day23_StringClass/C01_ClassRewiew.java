package day23_StringClass;

import day21_ClassAndMethods.Car;

public class C01_ClassRewiew {
    public static void main(String[] args) {
        Car myCar =new Car();

        myCar.marka="tesla";
        myCar.hız=260;
        myCar.renk= "kırmızı";
        myCar.model="10t";
        myCar.Çalıştır();
        myCar.hızlan();
        System.out.println("myCar.hız = " + myCar.hız);

    }
}
