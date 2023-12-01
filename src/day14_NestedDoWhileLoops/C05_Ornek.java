package day14_NestedDoWhileLoops;

public class C05_Ornek {
    public static void main(String[] args) {
        for(int x =1;x<=6;x++){
            for (int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        for(int x =6;x>=1;x--){
            for (int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println("");
    }
}
}
