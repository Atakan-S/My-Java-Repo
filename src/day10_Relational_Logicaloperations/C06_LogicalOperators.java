package day10_Relational_Logicaloperations;

public class C06_LogicalOperators {
    public static void main(String[] args) {
        String name ="atakan";
        int age = 34;
        String citizenship = "Turkey";
        //+18 , Turkish
        boolean isEligibletoVote = age > 18 & citizenship == "Turkey";// hiçbir zaman string eşitliğini == operator ile kontrol etmeyiniz
        System.out.println(name+ " is eligible to vote : "+isEligibletoVote);
        
    }
}
