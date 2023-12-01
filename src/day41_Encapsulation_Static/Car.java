package day41_Encapsulation_Static;

import java.util.Scanner;

public class Car {
String marka;
int modelyili;
private String saseNO;
private String motorNO;
int beygir;
boolean isManual;
boolean isSUV;
private final String sifre="atakan";
static int tekerlekSayisi=4;
    public Car() {

    }

    public Car(String marka) {
        this.marka = marka;
    }

    public Car(String marka, int modelyili, int beygir) {
        this.marka = marka;
        this.modelyili = modelyili;
        this.beygir = beygir;
    }

    public Car(String marka, int modelyili) {
        this.marka = marka;
        this.modelyili = modelyili;
    }

    public Car(String marka, int modelyili, int beygir, boolean isManual) {
      this(marka, modelyili,beygir);
        this.isManual = isManual;
    }

    public Car(String marka, int modelyili, String saseNO, String motorNO, int beygir, boolean isManual, boolean isSUV) {
        this.marka = marka;
        this.modelyili = modelyili;
        setSaseNO(saseNO);
        this.motorNO = motorNO;
        this.beygir = beygir;
        this.isManual = isManual;
        this.isSUV = isSUV;
    }

    public String getSaseNO() {
        return saseNO;
    }

    public void setSaseNO(String saseNO) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("şifre giriniz");
        String sifre= scanner.nextLine();
        if (sifre.equals(this.sifre)){
            this.saseNO = saseNO;
    }else
        System.out.println("şifre yanlış");
    }

    public String getMotorNO() {
        return motorNO;
    }

    public void setMotorNO(String yeniMotorNO) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("şifre giriniz");
        String sifre= scanner.nextLine();
        if (sifre.equals(this.sifre)){
            motorNO=yeniMotorNO;
        }else
        System.out.println("şifre yanlış");
    }

    public int getBeygir() {
        return beygir;
    }

    public void setBeygir(int beygir) {
       if (beygir>1){
        this.beygir = beygir;
    }
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", modelyili=" + modelyili +
                ", saseNO='" + saseNO.substring(saseNO.length()-5)+"*****"+ '\'' +
                ", motorNO='" + motorNO.substring(motorNO.length()-5)+"****" + '\'' +
                ", beygir=" + beygir +
                ", isManual=" + isManual +
                ", isSUV=" + isSUV +
                ", sifre='" + sifre + '\'' +
                '}'+"tekerlekSayisi "+tekerlekSayisi;


    }
public  String beygirkarsilastir(){
     if (beygir>100){
         return "güçlü araba";
     }
    lastikDeğiştir();
    return "zayıf araba"; //static methodalrda sadece static değişkenlere erişebilirsin!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    }
public static void lastikDeğiştir(){
    System.out.println("Değiştirilecek lastik adedi"+tekerlekSayisi);//tekerlek sayısı static oldugu için çağırabildik ancak static olmayanladı çağıramayız

}
}
