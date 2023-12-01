package day11_ControlFlowStatements;

public class C02_If {
    public static void main(String[] args) {


    int x=4;
    boolean a =(x<=5); // true
     if(a) {
         System.out.println(x + " beşe eşit yada büyüktür");
         System.out.println(x++);
     }
        System.out.println(x);
    }
}
