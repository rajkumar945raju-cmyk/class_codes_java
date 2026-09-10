class Student{
    String name = "RAJU SINGH";
    int age;
    String branch;

    public void detail(int age,String branch){
        System.out.println(this.name+" "+age+" "+branch);
    }
}
class CSE extends Student{
    int roll ;
    String collage = "KIET";
    public void display(int roll){
        System.out.println(super.name+" "+roll+" "+this.collage);
    }
}
class AI extends CSE{
    int room;
    public void  rm(int room){
        System.out.println(super.name+" "+super.collage+" "+room);
    }
}
public class Maininheri{
    public static void main(String[] args){
        AI a = new AI();
        
        a.detail(21,"CSE");
        System.out.println("Take a Space!\n");
        a.display(199);
        System.out.println("Take a Space\n");
        a.rm(506);
    }
}