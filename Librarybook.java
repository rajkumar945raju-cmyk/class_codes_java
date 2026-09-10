class Books{
    private String title;
    private String author;
    private double price;
    private int ISBN;
    public String library = "Sunrise Public Library";
    int count_book = 0;

    Books(String title,String author,double price,int ISBN){
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        count_book++;
    }

    public void setbook(String title){
        this.title = title;
    }
    public String getbook(){
        return title;
    }
}

public class Librarybook{
    public static void main(String[] args){
        Books bk = new Books("Gandhi","Mohan",200.00,199);
        System.out.println(bk.count_book);
        
    }
}
