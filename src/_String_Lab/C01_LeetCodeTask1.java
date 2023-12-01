package _String_Lab;

public class C01_LeetCodeTask1 {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
      String s2 = s.trim();
int indx= s2.lastIndexOf(" ");
return s2.substring(indx,s2.length()).length()-1;
    }
}
