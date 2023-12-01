package day19_MethodsReturnOverloading;

public class C07_MethodOverLoading {
public static void calculatearea(int side1,int side2){
    System.out.println(side1*side2);
}
public static void calculatearea(int radius){
    System.out.println(3.14*radius*radius);
}
public static void calculatearea(double radius){
    System.out.println(3.14*radius*radius);
}
public static void calculatearea(long radius){
    System.out.println(3.14*radius*radius);
}
}
