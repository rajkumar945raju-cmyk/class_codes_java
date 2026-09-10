class Shape{
    void area(){
        System.out.println("Area is : ");
    }
}

class Circle extends Shape{
    double radius;
    double PI = 3.14;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void area(){
        double ans = radius*radius*PI;
        System.out.println(ans);
    }
}

class Rectangle extends Shape{
    int length;
    int bredth;

    Rectangle(int length,int bredth){
        this.length = length;
        this.bredth = bredth;
    }

    @Override
    void area(){
        int ans = length*bredth;
        System.out.println(ans);
    }
}

public class Mainarea {
    public static void main(String[] args) {
        Shape sh1 = new Circle(2.0);
        sh1.area();

        Shape sh2 = new Rectangle(12,12);
        sh2.area();
    }
}
