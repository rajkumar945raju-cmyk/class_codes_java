import java.util.Scanner;

public class Persenatge{
    public static void main(String[] arge){

        System.out.print("Enter 1st number : ");
        Scanner _x1 = new Scanner(System.in);
        int x1 = _x1.nextInt();

        System.out.print("Enter 2nd number : ");
        Scanner _x2 = new Scanner(System.in);
        int x2 = _x2.nextInt();

        double sum = (x1+x2);
        double avg = sum/2;

        System.out.println(avg);

    }
}