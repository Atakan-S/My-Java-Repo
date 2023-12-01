package day30_Week06_Review;

public class C06_Retrieve {
    public static void main(String[] args) {
       String letters ="";
       String digits="";
       String specialchars ="";
       String str ="mn@#123Ab!";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>=48&&ch<=57 ){
                digits+=ch;
            } else if (ch>=65 && ch<=90 || ch>=97 && ch<=122) {
                letters +=ch;
            }else
                specialchars+=ch;

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialchars = " + specialchars);
    }

    }

