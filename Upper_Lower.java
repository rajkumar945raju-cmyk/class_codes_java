import java.util.Scanner;

public class Upper_Lower{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans1 = str.toUpperCase();
        String ans2 = str.toLowerCase();

        System.out.println("Choose Lowercase or Uppercase : Up(1) // Lo(2)");
        int op = sc.nextInt();

        if(op==1){
            System.out.println("Upper case is : "+ans1);
        }else if(op==2){
            System.out.println("Lower case is : "+ans2);
        }else{
            System.out.println("Enter the valid input");
        }
    }
}