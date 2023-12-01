package day13_Forloops;

import java.util.Scanner;

public class C02_If_Ternary {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        String name = "kerem";
        //             01234
        System.out.println(name);
        System.out.println(name.charAt(4));
    */
        // kullanıcıdan bir harf isteyin o harf ile başlayan gün varsa yazdırın yoksa geçersiz harf yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char harf = scan.next().charAt(0);//scanner classı ile harf alamıyoruz ancak string olarak alıp
        // charAt() metodu ile ilk harfi alıyoruz
        if (harf == 'p' || harf == 'P') {
            System.out.println("Pazar,Pazatesi,Persembe");
        } else if (harf == 's' || harf == 'S') {
            System.out.println("salı");
        } else if (harf == 'c' || harf == 'C') {
            System.out.println("Carsamba,Cuma,Cumartesi");
        } else {
            System.out.println("gecersiz harf");
        }
        System.out.println("----------------------------------");
        switch (harf) {
            case 'p', 'P':
                System.out.println("Pazar,Pazatesi,Persembe");
                break;
            case 's', 'S':
                System.out.println("salı");
                break;
            case 'c', 'C':
                System.out.println("Carsamba,Cuma,Cumartesi");
                break;
            default:
                System.out.println("gecersiz harf");
                break;

        }

        System.out.println("----------------------------------");
        // aynı programın ternary şeklinde yapımı
        // (veri) ? (dogru sonuç) : (yanlış sonuc) klasık tek ıhtımallı yazımı
        //(veri) ? (dogru sonuç) : (yeni ternary) iç içe yazım için
       // String result = (harf == 'p' || harf == 'P') ? : "Pazar,Pazatesi,Persembe" : (harf == 's' || harf == 'S') ?:
      //  ("salı") : (harf == 'c' || harf == 'C') ? : ("Carsamba,Cuma,Cumartesi") : ("gecersiz harf");;






    }


}



