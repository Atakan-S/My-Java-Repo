package day21_ClassAndMethods;

import java.util.Scanner;

public class C04_ClassTask {
    public static void main(String[] args) {


    sayiAL();
}

    private static void sayiAL() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayi");
        int sayi1 = scan.nextInt();
        System.out.println("2.sayi");
        int sayi2 = scan.nextInt();
        if (sayi2%3!=0){
            System.out.println("sayılarıntoplam(sayi1,üçünkatıyap(sayi2)) = " + sayılarıntoplam(sayi1, üçünkatıyap(sayi2)));
        }else{
            System.out.println("sayılarıntoplam(sayi1,sayi2) = " + sayılarıntoplam(sayi1, sayi2));
        }
    }

    private static int sayılarıntoplam(int sayi1,int sayi2) {
    return sayi1+sayi2;
    }

    private static int üçünkatıyap(int sayi2) {
    return sayi2*3;
    }
}
//Konsoldan
//kullanıcıdan 2 sayı almanızı sağlayan bir
//metodu çağırı n İkinci sayı 3 ün katı olan bir sayı değilse,
//başka bir metodtan geçirin ve 3 katı olacak ş ekilde size
//döndürsün Sonra bu sayıları kabul eden başka bir
//metotla da sayıları toplayın