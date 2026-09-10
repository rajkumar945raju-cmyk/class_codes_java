class Invalidageexception extends RuntimeException{
    Invalidageexception(String msg){
        super(msg);
    }
}


class Validateage extends Thread{
    int age=28;

    public void div(){
    try{
        int a = 10;
        int b = 0;
        int result = a/b;
    }catch(ArithmeticException e){
        System.out.println("Can't divide");
    }
    }

    public void run(){
        if(age<18){
            System.out.println("Not Eligiable for Vote");
        }else{
            System.out.println("Eligiable for Vote");
        }
    }
}

public class MainThread{
    public static void main(String[]args){
        Validateage t1 = new Validateage();
        t1.run();
        t1.div();
    }
}
