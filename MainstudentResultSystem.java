import java.util.Scanner;

class InvalidMarkException extends Exception{
    InvalidMarkException(String message){
        super(message);
    }
}

class Student{
    String name;
    int marks;

    void setMarks(int marks)throws InvalidMarkException {
        if(marks<0 || marks>100){
            throw new InvalidMarkException("Not Qualifyed");
        }else{
        System.out.println("Name : "+name+" Makrs : "+marks);
    }
}
}

public class MainstudentResultSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        Student st = new Student();

        try{
            if(marks<0 || marks>100){
                throw new InvalidMarkException("Not Qualified");
            }else{
                    st.setMarks(marks);
            }
        }catch(InvalidMarkException e){
            System.out.println(e);
        }finally{
            System.out.println("Result processing completed.");
        }
    }
}
