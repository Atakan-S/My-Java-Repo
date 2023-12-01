package day12_If_Switchcase;

import java.util.Scanner;

public class C17_Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.");
   int kat = scan.nextInt();
   scan.nextLine();
        switch (kat) {
            case 1:
                System.out.println("Lütfen Gitmek istediğiniz odayı seçin(resepsion, güvenlik ve hizmetli odası)");
                String oda = scan.nextLine();
             if (oda.equalsIgnoreCase("resepsiyon")){
                 System.out.println("resepsion : tüm işlemleriniz için bekleriz");
             } else if (oda.equalsIgnoreCase("Güvenlik")) {
                 System.out.println("Güvenlik : profosyonel bir hizmettir");
             } else if (oda.equalsIgnoreCase("hizmetli odası")) {
                 System.out.println("Oda hizmetleri : temizlik ve taşıma hizmetleri için 101\n" +
                         "dahili hattan ulaşabilirsiniz");
             }
             break;
            case 2:
                System.out.println("Lütfen Gitmek istediğiniz odayı seçin (yemekhane, dinlenme salanu ve Room1,Room2)");
                String oda2 = scan.nextLine();
               if (oda2.equalsIgnoreCase("Yemekhane")){
                   System.out.println("Yemekhane : kahvaltı 08-11\n" +
                           "öğle yemeği 12-15\n" +
                           "akşam yemeği 18-21");
               } else if (oda2.equalsIgnoreCase("Dinlenme salonu")) {
                   System.out.println("Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir");
               } else if (oda2.equalsIgnoreCase("Room1")) {
                   System.out.println("Room1: ekonomik oda");
               }else if (oda2.equalsIgnoreCase("Room2")) {
                   System.out.println("Room2: ekonomik oda");
               }
                break;
            case 3:
                System.out.println("Lütfen Gitmek istediğiniz odayı seçin (Room3,Room4,Room5,Room6 )");
                String oda3 = scan.nextLine();
                if (oda3.equalsIgnoreCase("Room3")) {
                    System.out.println("Room3: standart oda");
                }else if (oda3.equalsIgnoreCase("Room4")) {
                    System.out.println("Room4: standart oda");
                }else if (oda3.equalsIgnoreCase("Room5")) {
                    System.out.println("Room5: özel  oda");
                }else if (oda3.equalsIgnoreCase("Room6")) {
                    System.out.println("Room6: özel  oda");
                }
                    break;
            default:
                System.out.println("yanlış girdiniz tekrar deneyiniz");

   }

   }
   }


