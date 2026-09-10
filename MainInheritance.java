import java.io.*;

class Employee{
    int salary = 60000;
}

class Engineer extends Employee{
    int benefits = 10000;
    void display(){
        System.out.println(salary+benefits);
    }
}

public class Maininheritance{
    public static void main(String[] args){
        Engineer e = new Engineer();
        e.display();
    }
}