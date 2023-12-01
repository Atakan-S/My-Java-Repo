package day08_ScannerAndOperators;

import java.util.Scanner;

public class C08_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please write departure destination: ");
        String departure = scan.nextLine();
        System.out.print("Please write arrival destination: ");
        String arrival = scan.nextLine();
        System.out.print("ticket price: ");
        int ticket = scan.nextInt();
        scan.nextLine();
        System.out.println("From "+departure+" to "+arrival+" is "+ticket+" TL.");
        scan.close();


    }
}
