interface Empoly{
    void Empinfo();
}

interface EmpSalary{
    void Salaryinfo();
}

//{ Agar class se start kroger to extends use krna hoga..
// =or
// Agar bina class ke start kiya ho to use implements...}

public class Maininterface implements Empoly,EmpSalary{
    String name;
    int age;
    double salary;

    //Constructor
    Maininterface(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //@Override
    public void Empinfo(){
        System.out.println("Empolyee Name : "+name);
        System.out.println("Empolyee Age : "+age);
    }

    //@Override
    public void Salaryinfo(){
        System.out.println("Employee Salary : "+salary);
    }

    public static void main(String[] args){
        Maininterface obj = new Maininterface("Ajay",25,35000.90);
        obj.Empinfo();
        obj.Salaryinfo();
    }
}