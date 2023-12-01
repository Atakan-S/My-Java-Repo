package day28_String_Lab_2;

public class çalısma {
    public static void main(String[] args) {
        System.out.println("stringE(\"hello\") = " + stringE("hello"));
    }
    public static String stringE(String str) {
        String result="";
        if(str.length()>2){
            for(int i = 0;i<3;i++){
               result+=str.substring(str.length()-2,str.length());

            }

        }else {
            for (int i = 0; i < 3; i++) {
                result += str;

            }
        }
        return result;



    }
    }
