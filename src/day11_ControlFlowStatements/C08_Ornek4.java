package day11_ControlFlowStatements;

public class C08_Ornek4 {
    public static void main(String[] args) {
        int x = 50;
        System.out.println("x = " + x);
        int y = 0;
        if (x == 10) {
            y = 20;
        } else if (x == 20) {
            y = 30;
        } else if (x == 30) {
            y = 40;

        } else {
            y = 0;
        }
        System.out.println("y = "+y);
    }

}

/*
eğer x değeri 10 ise y ye 20 atansın
x değer 20 ise y ye 30
s değer 30 ise y ye 40
değil ise y  ye 0
 */