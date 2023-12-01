package day24_StringClassCont;

public class C08_UniqChars {
    public static void main(String[] args) {
        String str ="AABCCDDDE";
        String result ="";//BE
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        if (str.indexOf(ch)==str.lastIndexOf(ch))//unique mi ?
        {
            result+= ch;//unique ise ekle.
        }
        }
        System.out.println("result = " + result);
    }
}
/*Write a program that can return the unique characters from a String

        Ex:    input:AABCCD
        output:BD
        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
        */