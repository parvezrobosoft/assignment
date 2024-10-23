package task_4;
class Book
{
    String author;
    String title;
    float price;
    Book()
    {
        author="Anonymous";
        title="Story";
        price=100;
        print();
    }
    Book(String title)
    {
        author="Anonymous";
        this.title=title;
        price=100;
        print();
    }
    Book(String title,String author,float price)
    {
        this.author= author;
        this.title=title;
        this.price=price;
        print();
    }
    public void print()
    {
        System.out.println("author : "+author);
        System.out.println("title : "+title);
        System.out.println("price : "+price);
        System.out.println(" ");
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("GK");
        Book b3 = new Book("Wings of fire","Abdul Kalam",199);
    }
}