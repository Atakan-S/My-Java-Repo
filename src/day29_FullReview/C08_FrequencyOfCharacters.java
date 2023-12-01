package day29_FullReview;

public class C08_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAAABBBCDD", "A"));
    }
    public static int frequencyOfCharacters(String str, String ch){
       int result=0;
        for (int i = 0; i < str.length(); i++) {
            if (ch.equals(str.charAt(i)+"")){
                result++;
            }
        }
    return result;
    }
}
/*Bir String'den bir karakterin frekansını döndürebilecek bir yöntem yazın

Eski:
str = "AAAABBBCDD" ch = 'A'

Çıktı:
4*/