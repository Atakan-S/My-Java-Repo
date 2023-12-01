package day27_First_Quiz;

public class C07_Quiz_Question_7 {
    public static void main(String[] args) {
        System.out.println("equalsizKontrol(\"aTa\",\"ATa\") = " + equalsizKontrol("aTa", "ATa"));
    }
    public static boolean equalsizKontrol (String str1,String str2){
        String str1low = str1.toLowerCase();
        String str2low = str2.toLowerCase();
        if (str1low.equals(str2low)){
            return true;
        }
  return false;
    }

}
