import java.util.ArrayList;

public class Maincollection{
    public static void main(String[] args) {
        System.out.println("Collaction in java : ");
        ArrayList<String> student = new ArrayList<>();
        student.add("Raju");
        student.add("Ranjan");
        student.add("Prachi Bhabhi");
        System.out.println(student);

        for(String name:student){
            System.out.println("name is : "+name);
        }
    }  
}