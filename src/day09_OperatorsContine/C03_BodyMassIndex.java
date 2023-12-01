package day09_OperatorsContine;

import java.util.Scanner;

public class C03_BodyMassIndex {
    public static void main(String[] args) {
        //kullanıcıdan alacağımız boy ve kilodan beden kitle indeksi hesaplayacağız.
        // kiloyu boyun karesine bölerek hesaplanır
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz (m) ( Ornek : 1.80 ) : ");
        double boy = scan.nextDouble();
        System.out.println("Lutfen Kilonuzu Giriniz (kg) (Ornek : 85.3 ) : ");
        double kılo = scan.nextDouble();
        scan.nextLine();
        double bmi = kılo/(boy*boy);
        System.out.println("Kilonuz : "+kılo);
        System.out.println("Boyunuz : "+boy );
        System.out.println("Boy kilo indeksiniz : "+bmi);


    }
}
