package day24_StringClassCont;

import day23_StringClass.C05_Task;

import java.util.Scanner;

public class C09_task {
    public static void main(String[] args) {
        System.out.println("atakan = " + nameThree("atakan"));
        System.out.println("---------------------------");
        nameOnThree("saadettin");
        System.out.println("---------------------------");
        System.out.println(nameSurnameMnp2("atakan", "salik"));
        System.out.println("---------------------------");
        nameSurnameMnp3("atakan","salik");
        System.out.println("---------------------------");
        System.out.println("\"atakan\",\"salik\" = " + nameSurnameMnp4("atakan", "salik"));
        System.out.println("---------------------------");
        System.out.println("(\"min\",\"e\") = " + stringMnp5("min", "e"));
        System.out.println("---------------------------");
        javayıSeviyormuyum();
        System.out.println("---------------------------");
        msgmnp6();
        System.out.println("---------------------------");
        System.out.println("msgReturn = " + msgReturn());
    }

    public static String nameThree(String name) {
        String result = "";
        for (int i = 0; i < 3; i++) {
           result+=name.substring(name.length() - 3);
        }
        return result;
    }
    public static String msgReturn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("çocuk bayramı ile ilgili bir cümle söyleyin");
        String msg = scan.nextLine();
       String msg2 = "Ne hoş bir insan";
        if (msg.contains("sev")){
            return msg2;
        }
    return "sev yok";
    }
    public static void nameOnThree(String name) {
        int lenght = name.length()/2;
        System.out.print(name+" = "+name.charAt(lenght - 1));
        System.out.print(name.charAt(lenght));
        System.out.print(name.charAt(lenght + 1));
        System.out.println();


    }
    public static String nameSurnameMnp2(String name,String surname){
        int nameLenght = name.length();
        int surnameLenght = surname.length();
        int x = nameLenght-surnameLenght;
        if (nameLenght>surnameLenght){
            name = name.substring(0,nameLenght-x);

          return name.concat(surname);
        }else
            surname = surname.substring(0,surnameLenght+x);
        return name.concat(surname);


    }
    public static void nameSurnameMnp3(String name,String surname){
        int surnameLenght = surname.length();
        String nameChar = ""+(name.charAt(0));
        for (int i = 0; i <surnameLenght-1 ; i++) {
           String surChar = ""+surname.charAt(i);
            if (nameChar.equalsIgnoreCase(""+surChar)){
               surname = surname.replace(""+surChar,"");
                System.out.println(name+" "+surname);
            }
        }
    }
    public static String nameSurnameMnp4(String name,String surname){
        String namefirst3 = name.substring(0, 2);
        String surnmlast3 = surname.substring(surname.length()-3,surname.length());
        return namefirst3.concat(surnmlast3);
    }
    public static String stringMnp5(String klm1,String klm2){
        if (klm1.length()>klm2.length()){
            return klm2 + klm1.concat(klm2);
        }
    return klm1 + klm2.concat(klm1);
    }
    public static void javayıSeviyormuyum(){
        String cümle = "javayı Seviyor muyum?";
        int lenght = cümle.length();
        int res = 0;
        char y = 'y';
        for (int i = 0; i < lenght-1; i++) {
            char ch = cümle.charAt(i);
            if (ch==y){
                ++res;

            }

        }
    System.out.println("javayı Seviyor muyum? daki y sayısı = "+res);
    }
    public static void msgmnp6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("bir mesaj girin");
        String msg = scan.nextLine();
        String res = "";
        int lenght = msg.length();
        char a = 'a',e='e',ı='ı',i= 'i', o ='o',ö ='ö',u ='u',ü ='ü';
        for (int j = 0; j < lenght-1; j++) {
            char ch = msg.charAt(j);
        if (ch==a){
            res += ",a";
        }else if (ch==e){
            res += ",e";
        }else if (ch==ı){
            res += ",ı";
        }else if (ch==i){
            res += ",i";
        }else if (ch==o){
            res += ",o";
        }else if (ch==ö){
            res += ",ö";
        }else if (ch==u){
            res += ",u";
        }else if (ch==ü){
            res += ",ü";
        }
        }
        System.out.println("res = " + res);
    }

    }

