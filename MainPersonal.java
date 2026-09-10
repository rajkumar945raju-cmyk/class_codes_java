class Personal{
    String detail(String name, int age){
        return name + age;
    }
}
public class MainPersonal{
    public static void main(String[]args){
        Personal obj = new Personal();
        String result = obj.detail("Raju",21);

        System.out.println(result);
    }
}