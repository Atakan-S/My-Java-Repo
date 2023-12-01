package day16_Branchibg_Statements;

import java.util.Scanner;

public class C11_Task {
    public static void main(String[] args) {
        döngü1:while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hangi işlemi yapmak istersiniz 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış");
            int işlem = scan.nextInt();
            döngü2:while (true) {
                if (işlem == 1) {
                    System.out.println("Toplama menüsüne Hoşgeldiniz.");
                    System.out.print("x: ");
                    double sayı1 = scan.nextInt();
                    System.out.print("y: ");
                    double sayı2 = scan.nextInt();
                    double result = sayı1 + sayı2;
                    System.out.println("result = " + result);

                } else if (işlem == 2) {
                    System.out.println("Çıkarma menüsüne Hoşgeldiniz.");
                    System.out.print("x: ");
                    double sayı1 = scan.nextInt();
                    System.out.print("y: ");
                    double sayı2 = scan.nextInt();
                    double result = sayı1 - sayı2;
                    System.out.println("result = " + result);
                } else if (işlem == 3) {
                    System.out.println("Çarpma menüsüne Hoşgeldiniz.");
                    System.out.print("x: ");
                    double sayı1 = scan.nextInt();
                    System.out.print("y: ");
                    double sayı2 = scan.nextInt();
                    double result = sayı1 * sayı2;
                    System.out.println("result = " + result);
                } else if (işlem == 4) {
                    System.out.println("Bölme menüsüne Hoşgeldiniz.");
                    System.out.print("x: ");
                    double sayı1 = scan.nextInt();
                    System.out.print("y: ");
                    double sayı2 = scan.nextInt();
                    double result = sayı1 / sayı2;
                    System.out.println("result = " + result);
                } else {
                    System.out.println("program bitti");
                    break döngü1;
                }
                System.out.println("üst menü için 0  işlemlere devam etmek için 1 girin.");
                int devamorçıkış = scan.nextInt();
                if (devamorçıkış == 0) {
                    break döngü2;
                }else if (devamorçıkış==1){
                    işlem = işlem;

                }else{
                    System.out.println("Hatalı işlem nedeniyle çıkış yapılıyor");
                    break döngü1;
                }
            }
        }
    }
}
//Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.
// 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// 2 derse    çıkarma menüsüne hoş geldiniz
// x:
// y:
// result;
// menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz 