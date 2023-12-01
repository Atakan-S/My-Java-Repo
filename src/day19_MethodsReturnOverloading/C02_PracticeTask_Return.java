package day19_MethodsReturnOverloading;

public class C02_PracticeTask_Return {
    public static void main(String[] args) {
        System.out.println("evenNumber() = " + evenNumber());
        System.out.println("------------------------------");
        System.out.println("oddNumber() = " + oddNumber());
        System.out.println("------------------------------");
        System.out.println(areaOfCircle(5));
    }

    public static String evenNumber() {
        String result = "";
        for (int i = 0; i < 100; i += 2) {
            result += i + " ";


        }
        return result;
    }

    public static String oddNumber() {
        String result = "";
        for (int i = 1; i < 100; i += 2) {
            result += i + " ";


        }
        return result;
    }

    public static double areaOfCircle(int radius) {
        double area;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
