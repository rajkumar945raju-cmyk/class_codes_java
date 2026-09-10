class product{
    String name;
    int price;
    String category;

    product(String name){
        this.name = name;
        price = 0;
        category = "General";
    }

    product(String name,int price,String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display(){
        System.out.println("Name = "+name+"\nPrice = "+price+"\nCategory = "+category);
    }
}

public class Mainproduct{
    public static void main(String[]args){
        product pd = new product("Raju");
        pd.display();
    }
}