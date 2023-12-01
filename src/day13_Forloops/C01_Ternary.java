package day13_Forloops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen pozitif Bir sayı giriniz: ");
        int num = scan.nextInt();
       /* if (num%2==0)
            System.out.println("Sayı Çifttir.");
        else
           System.out.println("Tek sayı.");
*/
// tek satır kullanırken ıf else te paranteze gerek yok

        System.out.println("------------------------ ");
        System.out.println(num%2==0 ? "Çift sayi" : "Teksayi");
        System.out.println("------------------------ ");
        String result =(num%2==0 ? "Çift sayi" : "Teksayi");
        System.out.println("result = " + result);
    }
}
