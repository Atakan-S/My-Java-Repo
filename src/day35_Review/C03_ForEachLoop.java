package day35_Review;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        String str = "I love java";
        // For each loop: Data Structure : Array-Collections-Map
        int[] num1 ={5,78,46,42};
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
        }
        System.out.println();
        for (int each:num1) {
            System.out.print(each + " ");
        }
    }
}
