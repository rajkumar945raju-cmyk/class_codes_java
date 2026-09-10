import java.util.Scanner;

public class Area_circle{
    public static void main(String[] args){

        // ye Scanner baar baar nhi likhna hota h bas ek baar
        System.out.print("Enter the value of Radius : ");
        Scanner r = new Scanner(System.in);
        double radius = r.nextDouble();

        double pi = 3.14;

        double area = pi*radius*radius;

        System.out.print("The Area of Circle is : "+area);


    }
}