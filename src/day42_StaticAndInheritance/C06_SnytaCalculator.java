package day42_StaticAndInheritance;

public class C06_SnytaCalculator extends C05_AdvanceCalculator{
    public int mod(int num1,int num2){
        return num1%num2;
    }
    public int pow(int num1,int num2){
        return (int) Math.pow(num1,num2);
    }
}
