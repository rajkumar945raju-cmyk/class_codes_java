import java.util.Scanner;

class invalidAgeException extends RuntimeException{
    invalidAgeException(String message){
        super(message);
    }
}

class Age extends Thread{
    int age;

    Age(int age){
        this.age = age;
    }

    public void run() throws invalidAgeException{
    try{
        if(age<18){
            throw new invalidAgeException("You can't able to Drive");
        }else{
            System.out.println("You Can Drive : "+age);
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}

public class Mainage {
    public static void main(String[] args) {

        System.out.print("Enter the Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        Age A = new Age(age);

        Thread t1 = new Thread(A);

        t1.start();
    }
}
