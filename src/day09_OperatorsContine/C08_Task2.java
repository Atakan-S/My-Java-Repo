package day09_OperatorsContine;

import java.util.Scanner;

public class C08_Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kilometre giriniz (Ornek= 35 km)."); // km/1,609344 kara mili km/0,6214 deniz mili
        int km = scan.nextInt();
        double karamil = 1.609344;
        double karasonuc = km/karamil;
        double denizMil =0.6214;
        double denizSonuc = km/denizMil;
        System.out.println(km+" km "+karasonuc+" kara mili yapar.");
        System.out.println(km+" km "+denizSonuc+" deniz mili yapar.");



    }
}
