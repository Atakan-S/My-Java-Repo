package day30_Week06_Review;

public class C01_NoEnd {
    public static void main(String[] args) {
        lastChar("atakan");
    }
    public static void lastChar(String str){
        System.out.println(str+" = "+str.substring(0, str.length() - 1));
    }
}
   // Given a String txt print the value without the last letter