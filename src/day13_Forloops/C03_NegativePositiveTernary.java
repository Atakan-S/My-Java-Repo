package day13_Forloops;

import java.util.Scanner;

public class C03_NegativePositiveTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int n = scan.nextInt();
        if (n>0)
            System.out.println("positive");
        else if (n<0)
            System.out.println("negative");
        else
            System.out.println("zero");
        System.out.println("----------------------------");
        String result = n>0 ? "Positive" : (n<0 ? " Negative ": "Zero");
        System.out.println(result);









        }
    }

