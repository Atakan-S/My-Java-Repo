package day16_Branchibg_Statements;

public class C02_Teksayılar {
    public static void main(String[] args) {
        System.out.println("program başladı.");
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println("çift");
                continue;// contiune gordugu an aşşğıyı atlar ve başa doner
        }
            if (i > 10) {
            break;
            }
                System.out.println("i = " + i);
            }
        System.out.println("program bitti.");
        }


    }

