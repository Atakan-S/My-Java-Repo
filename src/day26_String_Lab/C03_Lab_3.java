package day26_String_Lab;

public class C03_Lab_3 {
    public static void main(String[] args) {
        System.out.println("convert(\"atakan\",\"a\") = " + convert("atakan", "a","e"));
        System.out.println("trim(\"   harun merhaba nasılsın   \") = " + trim("   harun merhaba nasılsın   "));
    }
    public static String convert (String kelime , String x,String y){
     return kelime.replaceFirst(x,y);
}
public static String trim(String str){
    int start =0;
    int end=0;
        for (int i = 0; i < str.length()-1; i++) {
       if (str.charAt(i)!=' '){
           start=i;
           break;
       }
    } for (int i = str.length()-1; i >= 0; i--) {
       if (str.charAt(i)!=' '){
           end=i;
           break;
       }
    }
return str.substring(start,end+1);
    }
}
//Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
// yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
// ilk bulduğu yeri değiştiren metodu yazınız.
//(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba

//trim(String str) şeklinde bir metot yazın trim gibi çalışsın
// ve string döndürsün.  İçerisinde string in hazır metodu
// olan trim metodunu kullanmayın.
// "   harun merhaba nasılsın   "