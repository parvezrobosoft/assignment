package task6;

import java.util.ArrayList;

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

    Book(int id,String title)
    {
        this.id=id;
        this.title=title;
    }
}

public class BookDetails {
    static void filter(int age,Book book[])
    {
        System.out.println("books by author above age:");

        for (Book value : book) {
            if (value.author.putAge() > age) {
                System.out.println(value.title);
            }
        }

    }
    public static int getCount(int a, int b, Book books[])
    {
        int count=0;
        for (int i = 0; i < books.length; i++)
        {
            if (books[i].author.putAge()>a && books[i].author.putAge()<b)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Book b1= new Book(1,"Java Programming");
        b1.author= new Author("Alice Smith",34);

        Book b2= new Book(2,"Python Basics");
        b2.author=new Author("Bob Jones",45);

        Book books[]=new Book[2];
        books[0]=b1;
        books[1]=b2;


        BookDetails.filter(40,books);
        int count= BookDetails.getCount(30,40,books);
        System.out.println("Books by author btw 30 and 40 : "+count);

    }
}

