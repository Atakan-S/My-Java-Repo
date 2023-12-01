package day15_Week03_Review;

import java.util.Scanner;

public class C05_MultiplyWithSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first number : ");
        int num1 = scan.nextInt();
        System.out.println("second number : ");
        int num2 = scan.nextInt();
        int sum = 0;
        if (num1<0||num2<0){
            System.err.println("Invalid");

        }else {
            for (int i = 1; i <=num1 ; i++) {
                sum+=num2;
            }
            System.out.println("sum = " + sum);
        }
    }
}
    /*Write a program that asks user to enter two positive numbers,
        then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

     */