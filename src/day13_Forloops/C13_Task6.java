package day13_Forloops;

import java.util.Scanner;

public class C13_Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz : ");
        int taban = scan.nextInt();
        System.out.println("Kuvvet sayıyı giriniz : ");
        int kuvvet = scan.nextInt();
int result = 1;
        if (kuvvet%2==0){
        for (int x = 1; x <= kuvvet; x++) {
            result*=taban;

        }
        }else{
            for (int x = 1; x <= kuvvet; x++) {
                result*=taban;

        }
            System.out.println(taban+" üzeri "+kuvvet+" = " +result);
        }


    }
    }

