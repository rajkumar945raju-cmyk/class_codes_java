interface Student{
    void detail();
    
}
class Student1 implements Student{
    public void detail(){
        System.out.println("KIET");
    }
}
class Student2 implements Student{
    public void detail(){
         System.out.println(21199);
    }
}
public class Mainpoly{
    public static void main(String[] args){
        Student s1 = new Student1();
        Student s2 = new Student2();
        s1.detail();
        s2.detail();
    }
}