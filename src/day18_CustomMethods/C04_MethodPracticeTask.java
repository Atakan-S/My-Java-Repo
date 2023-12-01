package day18_CustomMethods;

public class C04_MethodPracticeTask {
    public static void main(String[] args) {
        circlearea2(4);
        System.out.println(circlearea2(4));
    }
    /**
     *has method calculates the area of a circle with given radius
     * @param radius
     */
   public static void circlearea(int radius){
      double area;
      area = Math.PI*Math.pow(radius,2);
       System.out.println("circle with a radius of "+radius+" has an area of area = " + area);
   }
    public static double circlearea2(int radius){
        double area;
        area = Math.PI*Math.pow(radius,2);
        return area;
    }
}

//    . create a method that can calculate the area of a circle