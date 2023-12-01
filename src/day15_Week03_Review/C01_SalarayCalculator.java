package day15_Week03_Review;

import java.util.Scanner;

public class C01_SalarayCalculator {
    public static void main(String[] args) {
        double salary ;
        double taxrate;
        double salaryAfterTax;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your salary ?");
        salary = scan.nextDouble();
        if (salary>=130000){
            taxrate=35;
           salaryAfterTax = salary-((salary*taxrate)/100);
           System.out.println("salaryAfterTax = " + salaryAfterTax);
        } else if (salary>100000) {
            taxrate=30;
            salaryAfterTax = salary-((salary*taxrate)/100);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        } else if (salary>80000) {
            taxrate=25;
            salaryAfterTax = salary-((salary*taxrate)/100);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        }else {
            taxrate =20;
            salaryAfterTax = salary-((salary*taxrate)/100);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        }

    }
    }

   /*Write a program that can calculate the salary after tax based on the following requirements
        the tax rates are:
        35% for salary of 130K or more
        30% for salary of 100K to 130k (excluded)
        25% for salary of 80K to 100K (excluded)
        20% for salary less than 80K

    */