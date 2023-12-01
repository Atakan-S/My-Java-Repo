package day13_Forloops;

import java.util.Scanner;

public class C16_Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hak = 3;
        for(int x =1;x<=3;x++){

        String şifre = "atakan";
        System.out.println("Lütfen şifreyi giriniz.");
        String girilensifre = scan.nextLine();
        if (şifre.equalsIgnoreCase(girilensifre)){
            System.out.println("Tebrikler şifre doğru.");
        }else{
            System.err.println("Şifre yanlış tekrar deneyiniz kalan hak :"+--hak);
        }

    }
}
}
