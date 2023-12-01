package day12_If_Switchcase;

import java.util.Scanner;

public class C05_Nested_If {
    public static void main(String[] args) {
        // Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını
        //sorun 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
        // 18 ve üzerinde ise yanında bayan olup olmadığını sorun
        // bayan yok ise giremesin
        //bayan var ise yüzme bilip bilmediğiniz sorun
        //yüzme bilmiyor ise yine giriş yapamasın
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("yanınızda bayan var mı ?  Evet/Hayır");
            String cevap = scan.next();
            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.println("Yüzme biliyor musunuz ? Evet/Hayır");
                String cevap2 = scan.next();
                if (cevap2.equalsIgnoreCase("Evet")) {
                    System.out.println("Hoş geldiniz.");
                } else {
                    System.err.println("Yüzme bilmeyenler giriş yapamaz.");
                }
            } else {
                System.err.println("yanınızda bayan olmadan giremezsiniz.");
            }

        } else {
            System.err.println("giremezsiniz");
        }
    }
}

