package day09_OperatorsContine;

import java.util.Scanner;

public class C05_SayininRakamlariToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Üç Basamaklı Bir Sayı Giriniz : ");
        int sayı = scan.nextInt();//352
        int lastDigit1 = sayı%10;//kalan 2
        int a = sayı/10;//35
        int lasdigit2 = a%10;//kalan 5
        int lastdigit3 =a/10;//kalan 3
        int totalofdigit = lastDigit1+lasdigit2+lastdigit3;
        System.out.println("Girilen sayinin rakamlar toplami : "+totalofdigit);



    }
}
//kullanıcıdan 3 basamaklı bir sayı alıcaz
// sayı rakam toplamını ekrana yazdırın!
// 112  = 1+1+2 = 4
// 952  = 9+5+2 = 16
