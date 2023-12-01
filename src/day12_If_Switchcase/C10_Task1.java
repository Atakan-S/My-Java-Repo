package day12_If_Switchcase;

import java.util.Scanner;

public class C10_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı giriniz : ");
        int sayı = scan.nextInt();
        if (sayı<25&&sayı>5){
            System.out.println("Sayı 5 ten büyük ancak 25 ten küçüktür.");
            System.out.println("Sayı 5 ten büyüktür.");
        } else if (sayı>25) {
            System.out.println("Sayı hem 5 ten hem 25 ten büyüktür.");
        }



    }
    }

