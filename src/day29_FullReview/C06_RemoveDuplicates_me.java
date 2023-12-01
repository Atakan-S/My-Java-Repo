package day29_FullReview;

public class C06_RemoveDuplicates_me {
    public static void main(String[] args) {
        System.out.println("RemoveDuplicates(\"AABBCCBC\") = " + RemoveDuplicates("AABBCCDBC"));
    }
    public static String RemoveDuplicates(String str){
       String result ="";
        for (int i = 0; i < str.length()-1; i++) {
           char ch = str.charAt(i);
          if (ch==str.charAt(i+1)){
              result+=ch;
              str.replace(ch+"","");

          } else if (str.indexOf(ch)==str.lastIndexOf(ch)) {
              result+=ch;
          }

        }
    return result;
    }
    }

/*Çoğaltılan karakterleri bir String'den kaldırabilecek bir yöntem yazın

Eski:
giriş:
//AABBCCBC
                      01234567
Çıktı:
ABC

İpucu: Dizenin her karakterini başka bir Dize'ye ekleyebilirsiniz.
Durum: karakter, siz eklemeden önce henüz diğer String'in içinde yer almıyor*/