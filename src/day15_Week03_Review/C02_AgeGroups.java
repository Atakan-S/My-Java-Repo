package day15_Week03_Review;

import java.util.Scanner;

public class C02_AgeGroups {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        age = scan.nextInt();
        if (age > 0 && age < 150) {
            if (age < 21) {
                System.out.println("Teenager");
            } else if (age >= 21 && age < 55) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
        } else {
            System.out.println("INVALID");
        }

    }
}
    /*Write a program that can define the age groups of a person
    age groups are:
        Teenager (< 21)
        Adult   (>=21 && <55 )
        Senior  ( >= 55 )

        if age is negative or greater than 150, print invalid

     */
