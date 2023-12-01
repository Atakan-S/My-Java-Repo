package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C10_ArrayToArrayList {
    public static void main(String[] args) {
        String []names={"ali","veli"};
        ArrayList<String> namelist= new ArrayList<>(Arrays.asList(names));
       //2.yontem Collections.addAll(namelist,names);
        int [] nums={1,2,3};// primitivelerde asList kullanamayız!!!!
        Integer [] numss={1,2,3};
        ArrayList<Integer> numslist= new ArrayList<>(Arrays.asList(numss));


    }
}
