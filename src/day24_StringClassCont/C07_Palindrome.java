package day24_StringClassCont;

public class C07_Palindrome {
    public static void main(String[] args) {
        String str = "eyedipadanadapideye";
        int length = str.length();
        String result ="";
        for (int i = length-1; i>=0; i--) {
            result+=str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
