import java.util.Scanner;
public class OneD{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row :: ");
        int row = sc.nextInt();

        int arr[] = new int[row];
        System.out.print("Enter the array :: ");
        for(int i=0 ; i<row ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The Given array are :: ");
        for(int i=0 ; i<row ; i++){
            System.out.print(arr[i] );
            System.out.print(" ");
        }
    }
}