package day20_Week04_Review;

public class C02_Between30and40 {
    public static void main(String[] args) {
        System.out.println(a30or40(33, 35));
    }
    public static boolean a30or40(int num1, int num2) {

        if (num1 <= 40 && num1 >= 30 && num2 <= 40 && num2 >= 30) {
            return true;
        }

        return false;

    }
    }
