package day16_Branchibg_Statements;

public class C09_NestedLoopBranching {
    public static void main(String[] args) {
        outloop:for (int i = 0; i < 3; i++) {
            System.out.print("A");
            inloop :for (int j = 0; j < 5; j++) {

                System.out.print("B");
            }
            System.out.println();
    }
    }
}
