package day36_WrapperClasses;

public class C04_WrapperClass_Characters {
    public static void main(String[] args) {
        //Character.isLetter() --- harf olup olmadığını (daha genel)
        //Character.isDigit() -- sayı rakam olup omadığını
        //Character.isAlphabetic() --- harf olup olmadığını
        String str = "^+!j4546*/-a_|v-:!a ???()&+";
      String res="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
            res+=str.charAt(i);
            }
        }
        System.out.println("res = " + res);
        String str2 ="|''11'>>///M++>,,_//e%%&/'-&&r//%<>/)h>%//'9a+%^^^((b><###a678* +%&&/))<+J>>>" +
                ">56a##v||;;;a~>>> 4500001<<İ##n--//+%^^s>><<|478a12%%n" +
                "*-<<|>>012345l679--a**//##++34r``~~((ı[234]+||";
        String res2="";
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isUpperCase(str2.charAt(i))) {
                res2 += " ";
             }
                if (Character.isLetter(str2.charAt(i))){
                res2+=str2.charAt(i);


            }
            }
        System.out.println("res2 = " + res2);
    }

    }

