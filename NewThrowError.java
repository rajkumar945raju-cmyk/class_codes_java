class Vote{
    int age;

    public Vote(int age){
        this.age = age;
    }

    public void display(){
    if(age<18){
        throw new ArithmeticException("Person can't Not Drive Car");
    }else{
        System.out.println("Person can be Drive Car");
    }
}
}

public class NewThrowError {
    public static void main(String[] args) {
        Vote p1 = new Vote(12);
        p1.display();

        Vote p2 = new Vote(21);
        p2.display();
    }
}
