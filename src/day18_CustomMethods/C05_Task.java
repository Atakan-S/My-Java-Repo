package day18_CustomMethods;

public class C05_Task {
    public static void main(String[] args) {
        oddnumbers();
        System.out.println("-------------------------");
        evennumbers();
        System.out.println("-------------------------");
        eligiblebyalcohol(21);
        System.out.println("-------------------------");
        eligibleToVote(21, "TR");
        System.out.println("-------------------------");
        System.out.println(dolarConvertTurkLıras(30));
        System.out.println("-------------------------");
        calculateIsStudentGrade(61);
        System.out.println("-------------------------");
    }

    /**
     * method that prints odd numbers
     */
    public static void oddnumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    /**
     * method to print even numbers
     */
    public static void evennumbers() {
        for (int i = 0; i < 100; i += 2) {

            System.out.print(" " + i);
        }
        System.out.println();
    }

    /**
     * Method that gives approval for alcohol consumption
     * @param age
     */
    public static void eligiblebyalcohol(int age) {
        if (age == 21) {
            System.out.println("this person is eligible to buy alcohol  ");
        } else
            System.out.println("this person is not eligible to buy alcohol  ");
    }

    /**
     * method that gives consent to vote
     * @param age
     * @param nationality
     */
    public static void eligibleToVote(int age, String nationality) {
        if (age >= 20 && nationality.equalsIgnoreCase("TR")) {
            System.out.println("You are eligible to vote!");
        } else
            System.out.println("You are not eligible to vote!");
    }

    /**
     * method to convert dollar to turkish lira
     * @param dolar
     * @return
     */
    public static double dolarConvertTurkLıras(int dolar) {
        double result;
        result = dolar * 26.85;
        return result;
    }

    /**
     * Method for calculating student grades
     * @param grade
     */
    public static void calculateIsStudentGrade(int grade) {
        if (grade >= 90) {
            System.out.println("student's score A");
        } else if (grade >= 80) {
            System.out.println("student's score B");
        } else if (grade >= 70) {
            System.out.println("student's score C");
        }else if (grade >= 60) {
            System.out.println("student's score D");
        }else if (grade < 60) {
            System.out.println("student's score F");
        }

    }
}

