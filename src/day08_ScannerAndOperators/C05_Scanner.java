package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // scaner objesi oluştur.
        Scanner scan = new Scanner(System.in);
        // kullanıcıdan ne istediğini belirt.
        System.out.print("Lütfen isminizi giriniz: ");
        String name =  scan.nextLine();
        System.out.println("name = " + name);
        scan.close();


    }
}
