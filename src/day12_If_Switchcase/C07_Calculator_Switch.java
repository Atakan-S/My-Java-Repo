package day12_If_Switchcase;

import java.util.Scanner;

public class C07_Calculator_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 Adet Sayı giriniz");
        System.out.println("1.Sayı = ");
        double sayı1 = scan.nextDouble();
        System.out.println("2.Sayı = ");
        double sayı2 = scan.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi giriniz (+,-,/,*)");
        String işlem = scan.next();
        switch (işlem) {
            case "+":
                double sonuç = sayı1 + sayı2;
                System.out.println(sayı1 + " + " + sayı2 + " = " + sonuç);
                break;
            case "-":
                double sonuç2 = sayı1 - sayı2;
                System.out.println(sayı1 + " - " + sayı2 + " = " + sonuç2);
                break;
            case "/":
                double sonuç3 = sayı1 / sayı2;
                System.out.println(sayı1 + " / " + sayı2 + " = " + sonuç3);
                break;
            case "*":
                double sonuç4 = sayı1 * sayı2;
                System.out.println(sayı1 + " * " + sayı2 + " = " + sonuç4);
                break;
            default:
                System.err.println("işlem karakterini yanlış girdiniz lütfen tekrar deneyiniz.");
        }
    }
}
