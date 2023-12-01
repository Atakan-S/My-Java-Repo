package day27_First_Quiz;

public class C01_Quiz_Question_1 {
    public static void main(String[] args) {
        String str = "atakan salik!!";
        int length = str.length();
        String result ="";
        for (int i = length-1; i>=0; i--) {
            result+=str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}

