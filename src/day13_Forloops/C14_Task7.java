package day13_Forloops;

import java.util.Scanner;

public class C14_Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("0--1000 arası bir sayı giriniz : ");
        int sayı = scan.nextInt();
        int Ç = 0;
        int T =0;
        for (int x = 0; x <= sayı; x+=2) {

            Ç += x;

        }
        for (int x = 0; x <= sayı; x+=3) {

            T+= x;

        }
        System.out.println("0 dan "+sayı+" sayısına kadar olan Çift sayıların toplamı = " + Ç);
        System.out.println("0 dan "+sayı+" sayısına kadar olan Tek sayıların toplamı = " + T);

        }
}

