package day24_StringClassCont;

public class C03_StarsWithEndsWith {
    public static void main(String[] args) {
        String str ="Hersey cok guzel";
        str.startsWith("H");
        str.startsWith("h");
        System.out.println("str.startsWith(\"Her\") = " + str.startsWith("Her"));
        System.out.println("str.startsWith(\"Hers\") = " + str.startsWith("Hers"));
        System.out.println("str.startsWith(\"Herse\") = " + str.startsWith("Herse"));
        System.out.println("str.startsWith(\"Her sey\") = " + str.startsWith("Her sey"));
        System.out.println("str.startsWith(str) = " + str.startsWith(str));
        System.out.println("str.startsWith(\"\") = " + str.startsWith(""));
        System.out.println("str.startsWith(\" \") = " + str.startsWith(" "));
         System.out.println("---------------------------------");

        System.out.println("str.endsWith(\"l\") = " + str.endsWith("l"));
        System.out.println("str.endsWith(\"uzel\") = " + str.endsWith("uzel"));
    }
}
