package day09_OperatorsContine;

import java.util.Scanner;

public class C02_boyKilo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz (m) ( Ornek : 1.80 ) : ");
        double boy = scan.nextDouble();
        System.out.println("Lutfen Kilonuzu Giriniz (kg) (Ornek : 85.3 ) : ");
        double kılo = scan.nextDouble();
        scan.nextLine();
        System.out.println("Lutfen Ismınızı Giriniz : ");
        String isim = scan.nextLine();
        System.out.println(isim+"; boyunuz:"+boy+" m , Kilonuz: "+kılo+" kg");


    }
}
