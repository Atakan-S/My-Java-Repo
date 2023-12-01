package day14_NestedDoWhileLoops;

public class C13_Task3 {
    public static void main(String[] args) {
int n =6;
        for (int x=1;x<=6;x++){
            for (int z=6;z>=x;z--){
                System.out.print(" ");
            }
            for (int y=1;y<=x;y++){

                System.out.print("* ");

                }

            System.out.println("");
        }
}
}

