package day10_Relational_Logicaloperations;

import java.util.Scanner;

public class C02_PositiveOrNegative {
    public static void main(String[] args) {
        // int a = 10; // "=" assignment operator
        //System.out.println(a==20);// "==" eşit midir oparetoru(false)
        //System.out.println(a!=20);// true
        //System.out.println(a==10);// true
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz : ");
        int num = scan.nextInt();

        boolean isPositive = num > 0;
        System.out.println("isPositive = " + isPositive);
        boolean isNegative = num < 0;
        System.out.println("isNegative = " + isNegative);
        boolean isZero = num == 0;
        System.out.println("isZero = " + isZero);

    }

}
// kullanıcıdan bir int değer alın
// sayının negatif pozitif sıfır