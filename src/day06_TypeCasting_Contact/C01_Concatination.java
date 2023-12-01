package day06_TypeCasting_Contact;

public class C01_Concatination {
    public static void main(String[] args) {
        String str1= null;
        String str2="";
        String a = "Merhaba";
        String b = "Dünya"; // hem decleration hemde assingmet
        String c = a + " " + b;
        int i=10;

        System.out.println(c+ " bugün nasılsın.");
        //System.out.println(i+3+8+a+2+5+"dünya"); burada string ifadeden sonra java sayısal işlleme devam  edemez o yuzden aşşagıdakı gibi parantez
        // içine alarak işlem önceliği vermeyliyiz buradakı sonuç 21Merhaba25dünya olacaktır
        System.out.println(i+3+8+a+(2+5)+"dünya");
        System.out.println(i+3+8+a+(2+5)+7+"dünya");



    }

}
