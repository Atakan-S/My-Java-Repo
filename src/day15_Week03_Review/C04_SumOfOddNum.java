package day15_Week03_Review;

public class C04_SumOfOddNum {
    public static void main(String[] args) {
        int sum=0;
        for (int x = 1;x<=100;x+=2){
            sum+=x;


        }
        System.out.println("sum = " + sum);
    }
}
//Write a program that can return the sum of odd numbers between 1 to 100
// if içinde contine şartı atlar mesela çift şart koyulduysa onu atlayarak tek sayıalrı çalıştırır