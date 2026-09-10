abstract class Car{
    abstract void fuel();
    abstract void isbreak();
    abstract void speed();
}

class Desial extends Car{
    public void fuel(){
        System.out.println("Use Desial!");
    }
    public void isbreak(){
        System.out.println("very Good.");
    }
    public void speed(){
        System.out.println("Make top speed with-in a sec.");
        }
}

class Electric extends Car{
    public void fuel(){
        System.out.println("Not Used!");
    }
    public void isbreak(){
        System.out.println("Good.");
    }
    public void speed(){
        System.out.println("Average");
    }
}

public class Mainabs{
    public static void main(String[]args){
        Car c1 = new Desial();
        Car c2 = new Electric();

        c1.fuel();
        c1.isbreak();
        c1.speed();

        c2.fuel();
        c2.isbreak();
        c2.speed();
    }
}