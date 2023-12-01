package day37_Arraylist;

import java.util.ArrayList;

public class C04_ArrayTask {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);
        printListNumbers(listOfNums);
        System.out.println();
        System.out.println("sum(listOfNums) = " + sum(listOfNums));
        System.out.println("duplicateNumber(listOfNums) = " + duplicateNumber(listOfNums));

    }

    /**
     * 5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isili
     *         bir ArrayListe atın ve
     *         printListNumbers(listOfNums); methodu ile yazdıralım.
     *
     *
     * @param arrayList
     */
    public static void printListNumbers(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
    public static int sum(ArrayList<Integer> arrayList) {
        int res = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            res += arrayList.get(i);

        }
        return res;


    }

    /**
     * duplicate(listOfNums); methodu ile de değerleri dublicate
     *         edip list i döndürelim.
     * @param arrayList
     * @return
     */
    public static ArrayList<Integer> duplicateNumber(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrIntList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrIntList.add(arrayList.get(i));
            arrIntList.add(arrayList.get(i));
        }
        return arrIntList;
    }


}

/*
 "10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
toIntList(stringNums); methodu Integer bir arrayList e convert edip
döndürelim.
 *
 */
