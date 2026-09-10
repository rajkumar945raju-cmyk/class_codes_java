import java.util.Scanner;

public class Remender{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Numeretor : ");
        int num = sc.nextInt();

        System.out.print("Enter the Denominator : ");
        int deno = sc.nextInt();
        
        //Yaha Pr Modulus Operator Same kaam krta ha -->
        int rem = num%deno;

        System.out.print("Remenders of the "+num+" Divided to "+deno+" is : "+rem);
    }
}