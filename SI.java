import java.util.Scanner;

public class SI{
    public static void main(String[] args){


        System.out.print("Enter the value of principle : ");
        Scanner p = new Scanner(System.in);
        int principle = p.nextInt();

        System.out.print("Enter the time : ");
        Scanner t = new Scanner(System.in);
        int time = t.nextInt();

        System.out.print("Enter the rate : ");
        Scanner r = new Scanner(System.in);
        double rate = r.nextDouble();

        double si = (principle*time*rate)/100;

        System.out.print("Simple Intrest is : "+si);

    }
}