package day12_If_Switchcase;

import java.util.Scanner;

public class C03_EqualNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayı : ");
        int sayı1 = scan.nextInt();
        System.out.println("2.sayı : ");
        int sayı2 = scan.nextInt();
        System.out.println("3.sayı : ");
        int sayı3 = scan.nextInt();
        if (sayı1 == sayı2) {
            System.out.println("Sayılar : " + sayı1 + " " + sayı2 + " " + sayı3);
            System.out.println("Eşit Olan Sayılar : " + sayı1);
        } else if (sayı2 == sayı3) {
            System.out.println("Sayılar : " + sayı1 + " " + sayı2 + " " + sayı3);
            System.out.println("Eşit Olan Sayılar : " + sayı2);
        } else if (sayı1 == sayı3) {
            System.out.println("Sayılar : " + sayı1 + " " + sayı2 + " " + sayı3);
            System.out.println("Eşit Olan Sayılar : " + sayı3);
        } else {
            System.out.println("Eşit sayı yok.");
        }

    }
}
//3 sayı alın sayılar eşit olan sayıyı ekrana getiren
//(min 2 sayı eşit olmalı)
// eşit sayı yok ise ekrana eşit sayı yoktur
// yazan programı yazınız
// 1 ,2,3   eşit sayı yok
// 1,2,2    2
// 2,2,2    2
//2,3,2     2