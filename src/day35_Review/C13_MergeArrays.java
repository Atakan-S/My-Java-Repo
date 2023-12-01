package day35_Review;

import java.util.Arrays;

public class C13_MergeArrays {
    public static void main(String[] args) {
        String [] group1 ={"ali","veli"};
        String [] group2 ={"aliş","veliye"};

        String [] groups1_2= new String[group1.length+group2.length];
        for (int i = 0,j=group2.length; i < groups1_2.length/2; i++,j++) {
            groups1_2[i]=group1[i];
            groups1_2[j]=group2[i];
        }
        System.out.println("Arrays.toString(groups1_2) = " + Arrays.toString(groups1_2));
    }
}
