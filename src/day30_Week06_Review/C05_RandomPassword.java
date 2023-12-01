package day30_Week06_Review;

import java.util.Random;

public class C05_RandomPassword {
    public static void main(String[] args) {
       String str = "ABCDEFGHIJKLMNOPQRSTUVWYZabcdefgijklmnoprstuvwxyz0123456789_!@#$%&*";
       String password="";
       Random random = new Random();
        int randomİndex;
        for (int i = 0; i < 8; i++) {
           randomİndex = random.nextInt(str.length());
           password += str.charAt(randomİndex);
        }
        System.out.println(password);
    }
}
