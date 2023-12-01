package day20_Week04_Review;

public class C03_Task {
    public static void main(String[] args) {
        System.out.println(threeorfive(30));
        System.out.println(threeorfive(5));
        System.out.println(threeorfive(-10));
        System.out.println(threeorfive(3));
    }
    public static boolean threeorfive(int num){
       if (num>0){
        if (num%3==0||num%5==0){
            return true;
        }else{
            return false;
        }
    }else
        return false;
    }
}
/*
    create a method that return true if the given positive number is a multiple of 3 or a multiple of 5.
    Verilen pozitif sayı 3'ün veya 5'in katı ise true değerini döndüren metot yazın.
     */