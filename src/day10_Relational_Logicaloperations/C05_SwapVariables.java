package day10_Relational_Logicaloperations;

import java.util.Scanner;

public class C05_SwapVariables {
    public static void main(String[] args) {
        //  int a = 10;
        //int temp = a;
        //int b = 15;
        // a=b;
        //b=temp;
        // System.out.println("b = " + b);
        //System.out.println("a = " + a);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number : ");
         int a = scan.nextInt();

        System.out.println("Enter your second number : ");

        int b = scan.nextInt();

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
         int temp = a;
         a=b;
         b=temp;
        System.out.println("-----------------------");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        scan.close();
    }
}
/*
write a program that can swipe two variables' value by using a temporary variable
get numbers from user;

            Ex:
                if a= 10, b=15

            output:
                a = 15
                b = 10
 */