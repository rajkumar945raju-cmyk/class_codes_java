import java.util.Scanner;

public class Number5{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num : ");
        int num = sc.nextInt();

        if(num%5==0){
            System.out.print("Number is divided by 5");
        }else{
            System.out.print("Number is not divided by 5");
        }
    }
}