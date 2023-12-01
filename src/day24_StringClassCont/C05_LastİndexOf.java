package day24_StringClassCont;

public class C05_LastİndexOf {
    public static void main(String[] args) {
        String str = "Doritos";
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("p"));
        System.out.println(str.lastIndexOf("o"));
    int initialLenght = str.length();
        System.out.println("initialLenght = " + initialLenght);

        int firstindex = str.indexOf("o");
        int lastindex = str.lastIndexOf("o");
        if (firstindex==lastindex){
            System.out.println(str.charAt(lastindex) + " bu harf kelimede tektir");

        }else {
            str= str.replace(""+str.charAt(lastindex),"");//drits
        }
        System.out.println("str = " + str);
        System.out.println("initialLenght = " + initialLenght);
    }
}
