import java.util.Vector;

public class Mainvector{
    public static void main(String[] args) {
        Vector<String> vectorlist = new Vector<>();

        //vectorlist.add("C");
        vectorlist.add("C++");
        vectorlist.add("Java");
        vectorlist.add("Python");
        //vectorlist.add("JS");

        //vectorlist.addLast("PS-5");
        //vectorlist.addFirst("PS-1");

        //vectorlist.add(2,"Raju");
        //vectorlist.add(5,"Ranjan");

        //vectorlist.remove("PS-5");
        //vectorlist.remove(0);
        System.out.println("Vector List is : "+vectorlist);

        vectorlist.set(1,"Saurabh Yadav Ji");
        vectorlist.set(0,"Ranjan Ji");
        vectorlist.set(2,"Raju Ji");

        System.out.println("Vector List is : "+vectorlist);

    }
}
