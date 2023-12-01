package day11_ControlFlowStatements;

public class C07_If_ElseIf {
    public static void main(String[] args) {
        /*
        A VE B iki adet int sayıyı karşılaştırın
        Abüyüktür B den
        B büyüktür A dan
        A  ve B eşittir

         */
        int a = 20;
        int b = 20;

        if (a > b) {
            System.out.println("a büyüktür b ");

        } else if (a == b) {
            System.out.println("a b ye eşittir");

        } else {
            System.out.println("b büyüktür a");

        }
        System.out.println("Program finished");
    }

}
