package day44_Rewiev.Car;

public class Honda  extends Car {
   public Honda(String model,String color,int year, double price){
       super("Honda",model,color,year,price);
   }
    public void start(){
        System.out.println("anahtarı tak çalıştır");
    }
    public void stop(){
        System.out.println("Vtec motor durdu");
    }

}
