package day16_Branchibg_Statements;

public class C06_Review {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print("B");
            for (int j = 0; j < 10; j++) {
               if (j>2){
                   continue;
               }
                if (j==5){
                   System.out.println("C");
                   break;
               }
                System.out.print("A");
            }
        }
    }
}
