package _String_Lab;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_LeetCodeTask2 {
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                if (nums[i]>max){
                    max=nums[i];
                }
            }
        }
        for (int i1 = 0; i1 < nums.length; i1++) {
              if (nums[i1]>0){
               sum += nums[i1];
            }
            }
        sum+=max;
        return sum;
    }
}
