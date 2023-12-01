package day13_Forloops;

import java.util.Scanner;

public class C11_Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String kelime = scan.next();
        System.out.println("Kelimeyi kaç kere yazdırmak istersiniz.");
        int kaçkereyaz = scan.nextInt();
        for ( int x =0 ; x < kaçkereyaz; x++) {
            System.out.println(kelime);
    }
}
}
