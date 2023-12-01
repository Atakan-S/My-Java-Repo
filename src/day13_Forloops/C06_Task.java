package day13_Forloops;

public class C06_Task {
    public static void main(String[] args) {
        // 1 den 100 e kadar yazdır
        for (int c = 1;c<=100;c++){
            System.out.println(c);}
        System.out.println("--------------------------");
       // 15 ten 100 e kadar yan yana yazdır
        for (int i = 15;i<=100;i++){
            System.out.print(i+"\t");
        }
        System.out.println("---------------------------");
        // 100 den gerıye saydır
        for (int a = 100;a>=1;a--){
            System.out.println(a);}
        System.out.println("--------------------------");
        // çift sayıları yazdır 0 dan 100 e
        for (int d = 2;d<100;d+=2){
            System.out.print(d);}
        System.out.println("--------------------------");
        for (int f = 1;f<100;f++){
            if(f%2==1){
            System.out.print(f);}
            System.out.println("---------------");
            int sum = 0;
            for (int x=1;x<100;x++){
                sum+=x;

            }
            System.out.println("sum = " + sum);
    }
}
}
