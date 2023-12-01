package day15_Week03_Review;

public class C03_Fınra {
    public static void main(String[] args) {
for (int x = 1;x<=100;x++){
    if (x%15==0){
        System.out.print("FINRA ");
    } else if (x%5==0) {
        System.out.print("RA ");
    } else if (x%3==0) {
        System.out.print("FIN ");
    }else{
        System.out.print(x+" ");
    }
}
    }
}
    /*Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print
    "FINRA" instead of the number, for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers
     which are a multiple of 5, print "RA" instead of the number.

        ex:
        output:
        1    2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

     */