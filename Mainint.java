interface Car{
    void speed();
    void model();
    void rate();
}

class Electric implements Car{
    public void speed(){
        System.out.println("Top Speed with-in sec!");
    }
    public void rate(){
        System.out.println("Approxed 1 Lakhs");
    }
    public void model(){
        System.out.println("New 500-XR Modal");
    }
}
class Desial implements Car{
    public void model(){
        System.out.println("New Old Modal");
    }
     public void speed(){
        System.out.println("140km/h");
    }
    public void rate(){
        System.out.println("Approxed 1.9 Lakhs");
    }
}
class Petrol implements Car{
    public void rate(){
        System.out.println("Approxed 2.6Lakhs");
    }
    public void model(){
        System.out.println("New Modal");
    }
     public void speed(){
        System.out.println("210km/h");
    }
}
public class Mainint{
    public static void main(String[]args){
        Car c = new Electric();
        c.rate();
    }
}