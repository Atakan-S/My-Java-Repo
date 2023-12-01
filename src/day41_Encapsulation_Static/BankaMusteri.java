package day41_Encapsulation_Static;

import java.util.Random;

public class BankaMusteri {
    private String adSoyad;
    private String hesapNo;
    private double bakiye;
   static private final String sifre="SAFAK";
    private static int count =1;
    {
        this.hesapNo=hesapNoOluştur();
    }
    public BankaMusteri(){


    }
    public BankaMusteri(int Bakiye){
this.bakiye=Bakiye;
    }

    public BankaMusteri(String adSoyad, double bakiye, String sifre) {
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;

    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        if (adSoyad.isBlank()){
            return;
        }
        this.adSoyad = adSoyad;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
       if (sifre.equals(this.sifre)){
        this.hesapNo = hesapNo;
    }
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getSifre() {
        return sifre;
    }



    public static String hesapNoOluştur(){
    Random random = new Random();
      int x = random.nextInt(9999999)+10000000;
    String hesapNo="2023TR"+count+x;
    count++;
return hesapNo;
    }

    @Override
    public String toString() {
        return "BankaMusteri{" +
                "hesapNo='" + hesapNo + '\'' +
                '}';
    }
}
