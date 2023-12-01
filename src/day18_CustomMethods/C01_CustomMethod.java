package day18_CustomMethods;

public class C01_CustomMethod {
    public static void main(String[] args) {
        System.out.println("Program has started");
        greetings();
        greetings();
        greetings();
        warmgreetings();
        String s = grettingsbutreturntype();
        System.out.println(s);
        C02_CustomMethodsPractice.helloWorld5Times();
    }

    public static void greetings() {
        System.out.println("Hello World!");
    }

    public static void warmgreetings() {
        greetings();
        System.out.println("Whats up guys!");
    }
    public static String grettingsbutreturntype(){
        String grettings = "life is good.";
        return grettings;
    }
}
