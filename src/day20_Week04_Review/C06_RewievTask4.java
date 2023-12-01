package day20_Week04_Review;

public class C06_RewievTask4 {
    public static void main(String[] args) {
        System.out.println(stringTimes("atakan\n", 3));
    }
    public static String stringTimes (String x , int y ){
    String result = "";
        for (int i = 0; i < y; i++) {

       result = result + x;
    }
    return result;
    }
}
/*
        Given a string and a positive int n, return a string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
         */