package day08_ScannerAndOperators;

import java.util.Scanner;

public class C09_Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Country Code : ");
        int countrycd = scan.nextInt();

        System.out.println("Area Code : ");
        int areacd = scan.nextInt();

        System.out.println("Local Number : ");
        int localnum = scan.nextInt();

        System.out.println("Your number is "+"+("+countrycd+")"+areacd+"-"+localnum);
        scan.close();

    }
}
