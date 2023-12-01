package day17_Methods;

import java.util.Scanner;

public class C01_BankQuestion {
    public static void main(String[] args) {
        double money = 2000;
        Scanner scan = new Scanner(System.in);
        outloop:
        while (true) {
            System.out.println("1: para ekle 2: hesabımı gör 3: para çek 4: çıkış ");
            System.out.println("yapmak istediğiniz işlemi giriniz.");
            int tercih = scan.nextInt();
            switch (tercih) {
                case 1:
                   bir: while (true) {
                        System.out.println("Eklemek istediğiniz tutarı giriniz : ");
                        double eklenenPara = scan.nextDouble();
                        money += eklenenPara;
                        System.out.println("bir üst menü için 1 : işleme devam etmek için 2 : kart iade için 3 e basınız.");
                        int tercih2 = scan.nextInt();
                        if (tercih2 == 1) {
                            break bir;
                        } else if (tercih2 == 2) {
                            continue;
                        } else {
                            System.out.println("kart iade ediliyor.");
                            break outloop;
                        }
                    }
                    break;
                case 2:
                   iki: while (true) {
                        System.out.println("Hesabınızda bulunan bakiye = " + money);
                        System.out.println("bir üst menü için 1 : işleme devam etmek için 2 : kart iade için 3 e basınız.");
                        int tercih2 = scan.nextInt();
                        if (tercih2 == 1) {
                            break iki;
                        } else if (tercih2 == 2) {
                            continue;
                        } else {
                            System.out.println("kart iade ediliyor.");
                            break outloop;
                        }
                    }
                    break;
                case 3:
                    üç :while (true) {
                        System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                        double çekilenPara = scan.nextDouble();
                        money -= çekilenPara;
                        System.out.println("bir üst menü için 1 : işleme devam etmek için 2 : kart iade için 3 e basınız.");
                        int tercih2 = scan.nextInt();
                        if (tercih2 == 1) {
                            break üç;
                        } else if (tercih2 == 2) {
                            continue;
                        } else {
                            System.out.println("kart iade ediliyor.");
                            break outloop;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor.");
                    break outloop;
            }
        }
    }
}


//   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
//  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3
