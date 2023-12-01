package day20_Week04_Review;

public class C05_RewievTask3 {
    public static void main(String[] args) {
        System.out.println(twoİntNum(2, 3));
        System.out.println("------------------");
        System.out.println(twoİntNum(5, 5));
    }

    public static int twoİntNum(int num1, int num2) {
        int sum;
        if (num1 == num2) {
            sum = (num1 + num2) * 2;
            return sum;
        } else {
            sum = num1 + num2;
            return sum;
        }
    }
}
/*
    Given two int values, return their sum. When the two values are the same, then return double of sum.
    İki int değeri verildiğinde bunların toplamını döndürün. İki değer ise toplamlarının iki katını döndürün.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
     */