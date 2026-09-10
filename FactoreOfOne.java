import java.util.Scanner;

public class FactoreOfOne{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Value : ");
    int n = sc.nextInt();

    for(int i=n/2 ; i>=1 ; i--){
        System.out.print("The Factor of the number is : "+i);
        break;
    }
    }
}