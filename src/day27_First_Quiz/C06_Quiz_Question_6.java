package day27_First_Quiz;

public class C06_Quiz_Question_6 {
    public static void main(String[] args) {
        String str = "ey edip pide ye";
        int length = str.length();
        String result ="";
        for (int i = length-1; i>=0; i--) {
            result+=str.charAt(i);
        }
        if (result.equals(str)){
            System.out.println("girilen kelime palindrom.");
        }else{
            System.out.println("girilen kelime palindrom değil.");
        }

    }
}
