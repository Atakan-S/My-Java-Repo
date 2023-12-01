package day26_String_Lab;

public class C05_Lab_5 {
    public static void main(String[] args) {
        System.out.println("kelime(\"atakan\",\"salik\",2,30) = " + kelime("atakan", "salik", 2, 30));
    }
    public static String   kelime(String str1,String str2,int kısaadet,int uzunadet){
        String result="";
        if (str1.length()>str2.length()){
            for (int i = 0; i < kısaadet; i++) {
               result+=str2;
            }
            for (int i = 0; i < uzunadet; i++) {
                result+=str1;
            }
            for (int i = 0; i < kısaadet; i++) {
                result+=str2;
            }
            }else{
            for (int i = 0; i < kısaadet; i++) {
                result+=str1;
            }
            for (int i = 0; i < uzunadet; i++) {
                result+=str2;
            }
            for (int i = 0; i < kısaadet; i++) {
                result+=str1;
        }

    }
return result;
    }
    }

//Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa, uzun
// kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.