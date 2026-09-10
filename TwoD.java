import java.util.Scanner;
public class TwoD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row :: ");
        int row = sc.nextInt();

        System.out.print("Enter the col :: ");
        int col = sc.nextInt();

        System.out.println("Enter the array :: ");
        int arr[][] = new int[row][col];

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array are :: ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}