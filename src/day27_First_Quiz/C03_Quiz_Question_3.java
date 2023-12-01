package day27_First_Quiz;

public class C03_Quiz_Question_3 {
    public static void main(String[] args) {
       String str = "Merhaba";
       char ch ='a';
        System.out.println(str+" 'da "+frequency(str, ch)+" adet "+ch+" bulunmaktadır.");
    }
    public static int frequency(String str,char ch){
        int sayaç=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                ++sayaç;

            }

        }
    return sayaç;
    }
}
