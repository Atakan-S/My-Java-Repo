package day11_ControlFlowStatements;

import java.util.Scanner;

public class C04_Ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ders notlarını giriniz");
        System.out.println("Fizik notu giriniz : ");
        double fizik = scan.nextDouble();
        System.out.println("Kimya notu giriniz : ");
        double kimya = scan.nextDouble();
        System.out.println("Matematik notu giriniz : ");
        double matematik = scan.nextDouble();
        System.out.println("Geçme notu giriniz : ");
        double gecmenotu = scan.nextDouble();

        double ortalama = (fizik+kimya+matematik)/3;
        System.out.println("ortalama = " + ortalama);
        System.out.println("geçme notu = " + gecmenotu);
        if (ortalama >=gecmenotu) {
            System.out.println("Tebrikler geçtiniz.");
        } else {
            System.out.println("Ders tekrarı gerekmektedir.");

        }


    }
}