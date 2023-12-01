package day41_Encapsulation_Static;

public class C01_CarObjects {
    public static void main(String[] args) {
//static methodları obje oluşturmadan çağırabiliriz


    Car car1 = new Car();
        System.out.println(Car.tekerlekSayisi);//class ismi ile static methoda eriştik
        Car car2 = new Car();
        car2.tekerlekSayisi=5;
        System.out.println(car1.tekerlekSayisi);
        System.out.println(car2.tekerlekSayisi);
        car2.getClass();
        car2.setBeygir(23);
        System.out.println(car2.beygir);
        Car car3= new Car("honda",2020,231,false);

        Car car4= new Car("honda",2023,"123123aasdd","21312312",23,false,true);
        System.out.println(car4.toString());
        car4.setSaseNO("111111111");
        System.out.println(car4.toString());
    }
}
