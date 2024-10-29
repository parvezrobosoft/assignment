package task6;

import java.util.ArrayList;
import java.util.List;

class Author
{
    private String name;
    private int age;

    Author(String name,int age)
    {
        this.name=name;
        this.age=age;
    }



    public String putName()
    {
        return name;
    }
    public int putAge()
    {
        return age;
    }

}

class Book
{
    int id;
    String title;
    Author author;

    Book(int id,String title,Author author)
    {
        this.id=id;
        this.title=title;
        this.author=author;
    }
}

public class BookDetails {
    static void filter(int age,List<Book> book)
    {
        System.out.println("books by author above age:");

        for (Book bk:book)
        {
            if(bk.author.putAge()>age)
            {
                System.out.println(bk.author.putName());
            }
        }


    }
    public static int getCount(int a, int b, List<Book> books)
    {
        int count=0;
        for (Book bk :books)
        {

                if (bk.author.putAge() > a && bk.author.putAge() < b)
                {
                    count++;
                }


        }
        return count ;
    }

    public static void main(String[] args) {


        Author author= new Author("Alice Smith",34);

        Book b1= new Book(1,"Java Programming",author);

        Author author1=new Author("Bob Jones",45);

        Book b2= new Book(2,"Python Basics",author1);

        List<Book> bookList=new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);




        filter(40,bookList);
        int count= getCount(30,40,bookList);
        System.out.println("Books by author btw 30 and 40 : "+count);

    }
}

