package day32_Arrays_02;

public class C01_ForEachloop {
    public static void main(String[] args) {
        String [] arr =new String[4];//uzun array tanımlama.
        arr[0]="Hatice";
        arr[0]="Ayşe";
        arr[0]="Burcu";
        arr[0]="Atakan";
        System.out.println("str[0] = " + arr[0]);
        String [] arr1 ={"Hatice","Ayşe","Burcu","Atakan"};//kolay array tanımlama.
        for (String str:arr1) {//foreach ile yapımı
            System.out.println("str1 = " + str);
        }

    }
}
