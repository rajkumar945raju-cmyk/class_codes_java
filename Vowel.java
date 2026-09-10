import java.util.Scanner;
public class Vowel{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String vol = "";
        int count = 0;
        for(int i=0 ; i < str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    count++;
                    vol += ch;
               }
        }
        System.out.println("The Vowel is : "+vol+" And no. is : "+count);
    }
}