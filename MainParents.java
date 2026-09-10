class Parent{
    protected int age = 21;
}

class Child extends Parent{
    void display(){
        System.out.println("The Age of the Parent is : "+super.age);
    }
}

public class MainParents{
    public static void main(String[]args){
        Child ch = new Child();
        ch.display();
    }
}
