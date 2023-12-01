package day44_Rewiev.Car;



public class Audi extends Car {
    public Audi(String model,String color,int year, double price){
        super("Audi",model,color,year,price);
    }
public void start(){
    System.out.println("audi start butonuna bastın çalıştı");
}
    public void stop(){
        System.out.println("audi motoru durdu");
    }
public void autopark(){
    System.out.println("audi otomatık park ediyor");
}
}
