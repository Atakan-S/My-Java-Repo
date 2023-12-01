package day35_Review;

public class C10_CountOddEven {
    public static void main(String[] args) {
        int[] num1={5,8,45,26,78,99,13,21};
        int countEven=0;
        int countodd=0;

        for (int each1:num1) {
            if (each1%2==0){
                countEven++;
            }else {
                countodd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countodd = " + countodd);
    }
}
