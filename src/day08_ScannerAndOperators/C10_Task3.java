package day08_ScannerAndOperators;

import java.util.Scanner;

public class C10_Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Whats your name? ");
        String name = scan.nextLine();
        System.out.print("Whats the day of your birth? ");
        int birthDay = scan.nextInt();
        scan.nextLine();
        System.out.print("Whats the month of your birth? ");
        String month = scan.nextLine();
        System.out.print("Whats the year of your birth? ");
        int birthYear = scan.nextInt();
        System.out.println(name+" was born on "+month+"/"+birthDay+"/"+birthYear);
        System.out.println(name+" was born on "+"\""+month+"\\"+birthDay+"\\"+birthYear+"\"");
        scan.close();


    }
}
