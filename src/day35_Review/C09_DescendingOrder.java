package day35_Review;

import java.util.Arrays;

public class C09_DescendingOrder {
    public static void main(String[] args) {
        int[] numbers={5,9,76,42,3,14};
       Arrays.sort(numbers);
        int lenght= numbers.length;

        int[] reversed=new int[numbers.length];
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=numbers[i];

        }
        System.out.println("Arrays.toString(reversed) = " + Arrays.toString(reversed));
    }
}
