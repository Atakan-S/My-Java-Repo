package day27_First_Quiz;

import java.util.Scanner;

public class C02_Quiz_Question_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kilo");
        double kilo = scan.nextDouble();
        System.out.println("boy");
        double boy = scan.nextDouble();
        System.out.println("vucutKitleEndeksiHesapla(kilo,boy) = " + vucutKitleEndeksiHesapla(kilo, boy));
        if (vucutKitleEndeksiHesapla(kilo,boy)>30){
            System.out.println("obez");
        } else if ( vucutKitleEndeksiHesapla(kilo,boy)>25) {
            System.out.println("kilolu");
        } else if ( vucutKitleEndeksiHesapla(kilo,boy)>20) {
            System.out.println("normal");
        }else{
            System.out.println("zayıf");
        }
    }
public static double vucutKitleEndeksiHesapla(double kilo,double boy){
        return kilo*10000/(boy*boy);
}
}
/* Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        Aldiginiz degerleri bir metoda gondererek hesaplatin
        vucutKitleEndeksiHesapla(kilo,boy)
        vucut kitle endeksi = (kilo*10000 / (boy *boy))
        vucut kitle endeksi
        30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin

 */