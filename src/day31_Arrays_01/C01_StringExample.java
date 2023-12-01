package day31_Arrays_01;

import java.util.Scanner;

public class C01_StringExample {
    public static String kelimeConcat() {
        Scanner scan = new Scanner(System.in);
        String kelime1 = "";
        String kelime2 = "";
        System.out.println("lütfen 1 - 4 karakterden oluşan 2 kelime giriniz.");
        int hak = 0;
        while (true) {
            System.out.println("1.kelime");
            kelime1 = scan.nextLine();
            if (kelime1.length() > 0 && kelime1.length() < 5) {
                break;
            }
            System.out.println("hatalı giriş tekrar giriniz");
            hak++;
            if (hak == 3) return null;

        }
        hak = 0;
        while (true) {
            System.out.println("2.kelime");
            kelime2 = scan.nextLine();
            if (kelime2.length() > 0 && kelime2.length() < 5) {
                break;
            }
            System.out.println("hatalı giriş tekrar giriniz");
            hak++;
            if (hak == 3) return null;

        }

        return kelime1.concat(kelime2);
    }
    public static int ebob(int x, int y){
       int ebob=1;
        int min = Math.min(x,y);
        for (int i = 1; i <=min ; i++) {
            if (x%i==0 && y%i==0){
                ebob=i;
            }
        }
    return ebob;
    }
    public static int ekok(int a, int b){
    // a.b = ebob(a,b).ekok(a,b)
    return a*b/ebob(a,b);
    }
    public static void main(String[] args) {
       // System.out.println(kelimeConcat());
        System.out.println(ebob(8, 12));
        System.out.println(ekok(8, 12));
    }
}
// Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın,
// 1. veya 2. kelimeyi girdiğinde hatalı giriş yaparsa
// uyarı verin ve kullanıcıya düzeltme imkanı verin.
// Her kelime için 3 kere hatalı giriş yaparsa programı
// sonlandırın.
// Kullanıcı doğru giriş yaparsa 2 kelimeyi arada boşluk
// olacak şekilde sadece concat() metodu ile birleştirerek
// yazdırın.
// Slmim  Slmim   Slm
// Alimm alimm alimm
// Slm Ali