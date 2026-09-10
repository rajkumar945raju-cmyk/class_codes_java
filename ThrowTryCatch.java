class Drink{
    int age;

    public void display(int age){
    if(age<18){
        throw new ArithmeticException("You Can't Drink");
    }else{
        System.out.println("You Can Drink");
    }
}
}

public class ThrowTryCatch {
    public static void main(String[] args) {
        Drink p1 = new Drink();

        try{
        p1.display(12);
    }catch(ArithmeticException e){
        System.out.println("Error : "+e.getMessage());
    }
}
}
