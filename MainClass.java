abstract class Student{
    abstract void display();
}
class name extends Student{
    void display(){
        System.out.println("Let doing Java-Code!");
    }
}
public class MainClass{
    public static void main(String[]args){
        Student st = new name();
        st.display();
    }
}