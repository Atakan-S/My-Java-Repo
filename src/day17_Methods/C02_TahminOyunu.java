package day17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_TahminOyunu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int sayı= random.nextInt(50);
        int hak = 1;
        while (hak<=5){
            System.out.println(hak+". Tahmin : ");
            int tahmin=scan.nextInt();
            if (tahmin>sayı&& hak!=5){
                System.out.println("aşağı");
            } else if (tahmin<sayı&& hak!=5) {
                System.out.println("yukarı");
            }else if (tahmin==sayı){
                System.out.println("Tebrikler");
                break;
            }
        hak++;
            if (hak==6){
                System.out.println("Malesef bilemedin tuttuğum sayı : "+sayı);

            }
        }
    }
}
// Bilgisayarın tuttuğu 0 dahil-50 arası
// sayısıyı 5 hamlede bulma
// tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
//tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı