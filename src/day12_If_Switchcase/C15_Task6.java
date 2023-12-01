package day12_If_Switchcase;

import java.util.Scanner;

public class C15_Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int button =1;
        for (int i = 1;i>0;i++){
            switch (button){
            case 1:
                System.out.println("for lighting, use switch");
                System.out.println( "Light is on.To on,turn button to 0.");
                button = scan.nextInt();
                break;
            case 0:
                System.out.println("for lighting, use switch.");
                System.out.println( "Light is off.To on,turn button to 1.");
                button = scan.nextInt();
                break;
        }
    }
}
}
