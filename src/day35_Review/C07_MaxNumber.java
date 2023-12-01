package day35_Review;

import java.util.Arrays;

public class C07_MaxNumber {
    public static void main(String[] args) {
        int[] nums={10,5,78,96,0,5};
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("-------------------");
        Arrays.sort(nums);
        System.out.println("nums[nums.length-1] = " + nums[nums.length - 1]);
    }
}
