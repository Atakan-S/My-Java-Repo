package day12_If_Switchcase;

import java.util.Scanner;

public class C04_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 Adet Sayı giriniz");
        System.out.println("1.Sayı = ");
        double sayı1 = scan.nextDouble();
        System.out.println("2.Sayı = ");
        double sayı2 = scan.nextDouble();
        System.out.println("1. toplama\n2. çıkarma\n3. bölme\n4. çarpma\n yapmak istediğiniz işlemin başındaki numarayı yazın.");
        int işlem = scan.nextInt();
        if (işlem==1){
            double sonuç =sayı1 + sayı2;
            System.out.println(sayı1+" + " + sayı2+" = "+sonuç);
        } else if (işlem==2) {
            double sonuç =sayı1 - sayı2;
            System.out.println(sayı1+" - " + sayı2+" = "+sonuç);
        } else if (işlem==3) {
            double sonuç =sayı1 / sayı2;
            System.out.println(sayı1+" / " + sayı2+" = "+sonuç);
        } else if (işlem==4) {
            double sonuç =sayı1 * sayı2;
            System.out.println(sayı1+" * " + sayı2+" = "+sonuç);
        }else {
            System.err.println("işlem numarasını yanlış girdiniz lütfen tekrar deneyiniz.");
        }
    }
    }
//+,-,,/
// 4 işlem yapacak şekilde bir hesap makinesi yapın
// kullanıcıdan 2 sayı alın
//yapmak istediği işlemi seçsin +,-,,/
//hatalı işlem girişlerinde kullanıcıya uyarı verin
//ekrana sonuç döndüren programı yazınız.
// ÇOK ONEMLİİİİİİİİ STRİNG İFADELERİN EŞİTLİĞİNE BAKMAK İSTERSEK .EQUALS KULLANMALIYIZ ORNEK str1.equals(str2)