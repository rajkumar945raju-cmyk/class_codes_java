import java.io.FileReader;
import java.io.IOException;
class Exp{
    public void Book() throws IOException,ArithmeticException{
        FileReader file = new FileReader("data.txt");
        
        file.close();
    }
}

public class IO {
    public static void main(String[] args) {
        Exp B = new Exp();
        try{
            B.Book();
        }catch(IOException e){
            System.out.println("IOException : "+e);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception : "+e);
        }
    }
    
}
