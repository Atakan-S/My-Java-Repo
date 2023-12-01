package day11_ControlFlowStatements;

import java.util.Scanner;

public class C10_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1.Vize notu giriniz : ");
        int vize1 = scan.nextInt();
        System.out.println("Lütfen 2.Vize notu giriniz : ");
        int vize2 = scan.nextInt();
        System.out.println("Lütfen Final notu giriniz : ");
        int fınal = scan.nextInt();
        double vızehsp = ((vize1+vize2)*20)/100;
        double fınalhsp =(fınal*60)/100;
        double ortalama = vızehsp+fınalhsp;
        if (ortalama>=90&&ortalama<=100){
            System.out.println("Not Ortalamanız : "+ortalama);
            System.out.println("Harf Notunuz : A (Başarılı)");
        } else if (ortalama>=75&&ortalama<=89) {
            System.out.println("Not Ortalamanız : "+ortalama);
            System.out.println("Harf Notunuz : B (Başarılı)");
        } else if (ortalama>=60&&ortalama<=74) {
            System.out.println("Not Ortalamanız : "+ortalama);
            System.out.println("Harf Notunuz : C (Başarılı)");

        } else if (ortalama>=50&&ortalama<=59) {
            System.out.println("Not Ortalamanız : "+ortalama);
            System.out.println("Harf Notunuz : D (Başarılı) ");

        } else if (ortalama>=0&&ortalama<=49) {
            System.out.println("Not Ortalamanız : "+ortalama);
            System.out.println("Harf Notunuz : F (Ders Tekrarı)");
        }else{
            System.out.println("Notları yanlış girdiniz tekrar giriniz.");
        }


    }


    }


