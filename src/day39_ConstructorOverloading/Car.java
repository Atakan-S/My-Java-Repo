package day39_ConstructorOverloading;

public class Car {
    String marka;
    String model;
    String renk;
    int hiz;
    boolean otomatikMi;
    public Car(){}
    public Car(String brand){
        marka=brand;
    }
    public Car(String marka,String model){
        this.marka=marka;
        this.model=model;
    }
    public Car(String marka,String model,String renk){
        this(marka);
        //this.marka=marka;
        this.model=model;
        this.renk=renk;

    }
    public Car(String marka,String model,String renk,int hiz){
        this(marka,model,renk);
        this.hiz=hiz;

    }
    public Car(String marka,String model,String renk,int hiz,boolean otomatikMi){
        this(marka,model,renk,hiz);
        this.otomatikMi=otomatikMi;


    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", hiz=" + hiz +
                ", otomatikMi=" + otomatikMi +
                '}';
    }
    public static Car renkSec(Car car2, String yenirenk){
         car2.renk=yenirenk;
        return car2;
    }
}
