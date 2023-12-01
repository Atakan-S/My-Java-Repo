package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {
        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz : Kayseri
        //        Kaydiniz basariyla tamamlanmistir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz = ");
        String isim = scan.nextLine();
        System.out.println("Lütfen soy isminizi giriniz = ");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz = ");
        int yaş = scan.nextInt();
        scan.nextLine();
        System.out.println("Lütfen dogum yerinizi giriniz = ");
        String dogumyeri = scan.nextLine();


        System.out.println("isiminiz = " + isim);
        System.out.println("soyisiminiz = " + soyisim);
        System.out.println("yaşınız = " + yaş);
        System.out.println("dogum yeriniz = " + dogumyeri);

scan.close();
    }
}
