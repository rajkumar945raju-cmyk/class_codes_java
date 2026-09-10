abstract class Vehicle{
    abstract void start();
    void stop(){
        System.out.println("Vehical stopped");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car start with a key");
    }
}

public class AbstractMain{
    public static void main (String[] args){
            Vehicle v = new Car();
            v.start();
            v.stop();
    }
}

