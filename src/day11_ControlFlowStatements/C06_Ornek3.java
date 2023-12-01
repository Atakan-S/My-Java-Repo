package day11_ControlFlowStatements;

import java.util.Scanner;

public class C06_Ornek3 {
    public static void main(String[] args) {
        // bir sayı alın tek mi çift mi yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Tam sayı giriniz : ");
        int sayı = scan.nextInt();
        if (sayı % 2 == 0) {
            System.out.println(sayı+" sayısı çifttir.");
        } else {
            System.out.println(sayı+" sayısı tektir.");
        }
    }
}

