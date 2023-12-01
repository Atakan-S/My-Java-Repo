package day21_ClassAndMethods;

import java.util.Random;

public class C01_MethodsSummary {
    public static void main(String[] args) {
        evenorodd();
        System.out.println(evenorodd2());
        System.out.println(evenorodd3());
        System.out.println("max(23,25) = " + max(45, 23));
        int max = max(45, 23)*2;
        System.out.println("max = " + max);
    }

    public static void evenorodd() {
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println(x);
        if (x % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else
            System.out.println("sayı tektir.");
    }

    public static String evenorodd2() {
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println(x);
        if (x % 2 == 0) {
            return "true";
        } else
            return "false";


    }

    public static boolean evenorodd3() {
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println(x);
        if (x % 2 == 0) {
            return true;
        } else
            return false;


    }

    public static int max(int x, int y) {

        if (x > y) {
            return x;
        } else {
            return y;
        }


    }
}
