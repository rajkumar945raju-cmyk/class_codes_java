import java.util.Scanner;

public class Palindrome{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in) ;
       String str = sc.nextLine();

       String ch = new StringBuilder(str).reverse().toString();

       if(str.equals(ch)){
        System.out.println("Palindrome !");
       }else{
        System.out.println("Not Palindrome !");
       }
    }
}