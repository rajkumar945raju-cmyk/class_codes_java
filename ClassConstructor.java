public class ClassConstructor{
    
    // instance variables non-static variable

    String name;
    int rollno;
    
    // parmetrized constructor

    ClassConstructor(String n, int r){
        this.name = n;
        this.rollno = r;
    }

    public void Display(){
        System.out.println("Name : "+name+"Roll no. "+rollno);
    }

    //instance methode

    public static void main(String[] args){

        // creating object for class

        ClassConstructor obj = new ClassConstructor("Raju ", 199);

        // accessing the object of the class

        obj.Display();

        System.out.print("Hello World");
    }
}