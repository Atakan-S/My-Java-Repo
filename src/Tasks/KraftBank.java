package Tasks;

import java.util.Random;
import java.util.Scanner;

public class KraftBank {
private  int customerId;
private  String customerFullName;
boolean isSms;
int customerAccount;
private String customerPass;
String CustomerFullName2char;
int count=0;
Random random= new Random();

    public int getRandom() {
       return random.nextInt(1000,9999);
    }

    public KraftBank(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        this.CustomerFullName2char=customerFullName.substring(0,2);
    }

public String CustomerPassAdd(){
   return this.customerPass=customerId+CustomerFullName2char+getRandom();
}
public int addMoney(int money){
     int x=  customerAccount+money;
return customerAccount=x;
    }
    {
        this.customerPass=CustomerPassAdd();
    }

    @Override
    public String toString() {
        return "KraftBank{" +
                "customerId=" + customerId +
                ", customerFullName='" + customerFullName + '\'' +
                ", isSms=" + isSms +
                ", customerAccount=" + customerAccount +
                ", customerPass='" + customerPass + '\'' +
                '}';
    }

    public void setCustomerFullName(String customerFullName) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("lütfen şifreyi girin");
        String sifre= scanner.nextLine();
        if (sifre.equalsIgnoreCase(customerPass)){
        this.customerFullName = customerFullName;
    }else {
            System.err.println("şifre yanlış full name değiştirilemedi");
        }

    }

    public boolean isSms() {
        return isSms;
    }

    public void setSms(boolean sms) {
        isSms = sms;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public int getCustomerAccount() {
        return customerAccount;
    }
}
