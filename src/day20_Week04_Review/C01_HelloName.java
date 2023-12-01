package day20_Week04_Review;

public class C01_HelloName {
    public static void main(String[] args) {
        System.out.println(helloName("bob"));
    }
    public static String helloName (String name){
    String message = "Hello "+name+"!";
    return message;
    }



}
/*
Create a method that given string name, e.g "Bob", return a greeting of the form "Hello Bob!".
helloName ("Bob") -> "Hello Bob!"
helloName ("Alice") -> "Hello Alice!"
helloName ("X") -> "Hello X!"
 */