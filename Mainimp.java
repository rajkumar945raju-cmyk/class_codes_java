class Mytask implements Runnable{
    public void run(){
        for(int i=0 ; i<10 ; i++){
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Number is  : Raju");
        }
    }
}

public class Mainimp{
    public static void main(String[] args) {
        Mytask obj = new Mytask();

        Thread t1 = new Thread(obj);

        t1.start();

        for(int i=0 ; i<10 ; i++){
            System.out.println("Number is : "+i);
        }
    }
}
