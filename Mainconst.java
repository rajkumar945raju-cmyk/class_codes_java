class Student{
    String name;
    int age;
    String collage;
    int roll;

    Student(String name,int age,int roll,String collage){
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.collage = collage;
    }
}

public class Mainconst{
    public static void main(String[] args){
        Student s1 = new Student("Raju",21,199,"KIET");
    
        System.out.println(s1.name+" "+s1.age+" "+s1.collage+" "+s1.roll);
    }
}