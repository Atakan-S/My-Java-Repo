package day19_MethodsReturnOverloading;

public class C06_İnitials {
    public static void main(String[] args) {
        System.out.println("initials(\"atakan\",\"salik\") = " + initials("atakan", "salik"));

    }
    public static String initials(String firstname, String lastName){
        String result="";
        result = firstname.charAt(0)+"."+lastName.charAt(0)+".";
        return result;
    }
}
// atakan salik A.S. buna initial denir..