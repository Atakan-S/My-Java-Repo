package day08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz : ");
        int girilensayı = scan.nextInt();
        System.out.println("Girilen sayı : "+girilensayı);
        int sonuc = (girilensayı+2)*(girilensayı+2);
        System.out.println("girilen sayının iki fazlasının karesi : "+sonuc);
    scan.close();
    }
}
