package day27_First_Quiz;

public class C04_Quiz_Question_4 {
    public static void main(String[] args) {
        System.out.println("faktoriyel(5) = " + faktoriyel(5));
    }
    public static int faktoriyel(int num){
        int faktoriyel =1;
        for (int i=1;i<=num;i++){
            faktoriyel=faktoriyel*i;
        }
        return faktoriyel;

    }
    }

