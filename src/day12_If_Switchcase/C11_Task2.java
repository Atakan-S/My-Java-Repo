package day12_If_Switchcase;

import java.util.Scanner;

public class C11_Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int x=1;x<5;x++){
        int sayı = 30;
        System.out.println("Bir Sayı tahmini giriniz : ");
        int girilensayı = scan.nextInt();

        if (sayı == girilensayı) {
            System.out.println("Tebrikler doğru bildiniz.");
           break;
        } else {
            if (sayı > girilensayı && (sayı / 2) < girilensayı) {
                System.out.println("Tahmin sayıdan küçük ama yakın.");
            } else if (sayı > girilensayı && (sayı / 2) > girilensayı) {
                System.out.println("Tahmin sayıdan çok küçük.");
            } else if (sayı < girilensayı && (sayı * 2) < girilensayı) {
                System.out.println("Tahmin sayıdan çok büyük.");
            } else if (sayı < girilensayı && (sayı * 2) > girilensayı) {
                System.out.println("Tahmin sayıdan büyük ama yakın.");
            }

            }
            }

        }
    }

