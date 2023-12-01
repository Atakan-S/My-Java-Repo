package day18_CustomMethods;

public class C03_MethodsWithParameters {
    public static void main(String[] args) {
        oddoreven((int) 5.5);
        System.out.println("-------------------");
        ageOfPerson(2001);
        System.out.println("-------------------");
        printNumbers(31,100);
    }

    /**
     * this function checks a number is odd number or even number
     *
     * @param number
     */
    public static void oddoreven(int number) {
        if (number % 2 == 0) {
            System.out.println("a " + number + " is even.");
        } else {
            System.out.println("a " + number + " is odd.");
        }
    }

    /**
     *  this method displays the age of the person from the birthYear
     * @param birtYear
     */
    public static void ageOfPerson(int birtYear) {
        int age = 2023 - birtYear;
        System.out.println("Your age is " + age);
    }

    /**
     * a method that can print all the numbers between X and Y
     * @param minNumber
     * @param maxNumber
     */
    public static void printNumbers(int minNumber,int maxNumber){
    for (int i = minNumber+1 ; i <maxNumber ; i++) {
        System.out.print(" "+i);
    }
}

}

//     a function that can check if a number is odd number or even number
//     a method that can display the age of the person from the birthYear
//     a method that can print all the numbers between X and Y