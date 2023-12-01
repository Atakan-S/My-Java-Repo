package day20_Week04_Review;

public class C07_ReviewTask5 {
    public static void main(String[] args) {
        System.out.println("circlearea = " + circlearea(5));
    }
    public static double circlearea (double radius){
        double area;
        area = Math.PI*Math.pow(radius,2);
        return area;
    }
}
/*
create a method that can calculate the area of a circle
dairenin alanını hesaplayabilecek bir metot oluştur
 */