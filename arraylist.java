import java.util.ArrayList;
import java.util.List;

public class arraylist{
    public static void main(String[] args) {
      ArrayList<String> list=new ArrayList<>();
      list.add("piyush");
      list.add("raju");
      list.add("saurabh");
      list.add("rathore");
      list.add("abhishek");
      System.out.println("The array list is :"+list);
      System.out.println("The element at index 2 is : "+list.get(1));  
      System.out.println("First element is :"+list.getFirst());
      System.out.println(list.isEmpty());
      System.out.println("to remove last :"+list.removeLast());
      list.addLast("shashank");
      System.out.println("The last element is :"+list.getLast());
      System.out.println("More options is : "+list.indexOf("saurabh"));//
      list.sort(null); // For sorting -->
      System.out.println(list);
      // for creating the clone list-->
      ArrayList<String> list2=new ArrayList<>(list); 

    }
}