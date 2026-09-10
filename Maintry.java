import java.lang.Exception;

class Exp{

    int a = 2;
    int b = 3;
    int c = 0;

    public void add(){
        try{
            int ans = a+b+c;
            System.out.println(ans);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void div(){
        try{
            int res = b/c;
            System.out.println(res);
        } catch(ArithmeticException e){
            System.out.println("Error2 : "+e.getMessage());
        } catch(Exception e){
            System.out.println("Execution error : "+e);
        }finally{
            System.out.println("Code Done");
        }
    }
}

public class Maintry{
    public static void main(String[]args){
        Exp ex = new Exp();
        ex.div();
        ex.add();
    }
}
