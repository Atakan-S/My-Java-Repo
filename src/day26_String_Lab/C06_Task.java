package day26_String_Lab;

public class C06_Task {
    public static void main(String[] args) {

        System.out.println("fiveChar(\"ataka\") = " + fiveChar("atakan"));
        System.out.println("fiveChar(\"atak\") = " + fiveChar("atak"));
        System.out.println("fiveChar(\"ata\") = " + fiveChar("ata"));
        System.out.println("fiveChar(\"at\") = " + fiveChar("at"));
        System.out.println("fiveChar(\"a\") = " + fiveChar("a"));
    }
    public static String fiveChar(String str) {
        if (str.length() >= 5) {
            return str.substring(0, 5);

        } else if (str.length() == 4) {
            return str.concat(".");
        } else if (str.length() == 3) {
            return str.concat("..");
        } else if (str.length() == 2) {
            return str.concat("...");
        }

        return str.concat("....");



    }
}
//Kullanıcıdan bir kelime veya söz alın ve ilk 5
// karakterini yazdırın. 5 karakterin altında bir kelime girdiği taktirde
// 5 karaktere nokta ile tamamlayın.
//Sabun Sabun Merhaba Merha Ali Ali..
//Hey Hey..
//Pi Pi...