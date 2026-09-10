class Employee{

    private String name;
    private int id;
    private double salary;
    private String dept;

    final String compalyname = "Tech Solutions";
    static int EmployeeCount = 0;

    public Employee(String name,int id,double salary,String dept){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
        EmployeeCount++;
    }

    // public void setdata(String name){
    //     this.name = name;
    // }
    // public String getname(){
    //     return name;
    // }

    // public void setid(int id){
    //     this.id = id;
    // }
    // public int getid(){
    //     return id;
    // }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+salary);
        System.out.println("DEPT : "+dept);
    }

}

public class MainEmpoloye{
    public static void main(String[] args) {
        Employee e1 = new Employee("Raju",199,25000,"AL/ML");
        e1.display();
    }
    
}
