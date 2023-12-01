package day13_Forloops;

import java.util.Scanner;

public class C12_Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("0--1000 arası bir sayı giriniz : ");
        int sayı = scan.nextInt();
        int y = 0;
        for (int x = 0; x <= sayı; x++) {

            y += x;

        }
        System.out.println("0 dan "+sayı+" sayısına kadar olan sayıların toplamı = " + y);
    }
}
