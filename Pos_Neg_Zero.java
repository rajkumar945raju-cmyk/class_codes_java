import java.util.Scanner;
public class Pos_Neg_Zero{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Negative Numbers!");
        }else if(num==0){
            System.out.println("Zero Numbers!");
        }else{
            System.out.println("Positive Numbers!");
        }
    }
}