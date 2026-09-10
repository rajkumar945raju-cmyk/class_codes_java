import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year : ");
        int year = sc.nextInt();

        if((year%4==0 || year%400==0) && year%100!=0){
            System.out.print(year+" This year is a leap year");
        }else{
            System.out.print(year+" This is not a leap year");
        }

    }
}