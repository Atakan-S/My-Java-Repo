package day24_StringClassCont;

public class C04_SubString {
    public static void main(String[] args) {
        String str = "iki tane bounty, bir tane Snickers";
       //             01234567890123456789012345678901234
        System.out.println(str.length());
        System.out.println(str.substring(0, 15));//iki tane bounty
        System.out.println(str.substring(17));//bir tane Snickers
        System.out.println(str.substring(17,33));//bir tane Snickers
        System.out.println(str.substring(17,34));//bir tane Snicker
        System.out.println(str.substring(17,str.length()));//bir tane Snickers
        System.out.println(str.substring(str.length() - 8));//snickers
        System.out.println(str.substring(str.length() - 4));//kers
        System.out.println(str.substring(str.length() - 1));//s
//ilk harf
        System.out.println(str.substring(0, 1));

    }
}
