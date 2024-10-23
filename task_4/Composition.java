package task_4;
class PersonalDetails
{
    static int n=1000;
    int id;
    String name;
    PersonalDetails(String name, char gender)
    {
        if(gender=='M')
        {
            this.name = "Mr. " + name;
        }
        else
        {
            this.name = "Mrs. " + name;

        }
        id=n;
        n++;
    }
}
class Details
{
    String College="Joseph";
    public void showc()
    {
        System.out.println("College: "+College);
    }
}
class Employee extends Details
{
    String section;
    PersonalDetails details;
    public void show()
    {
        showc();
        System.out.println("Name: "+details.name);
        System.out.println("ID: "+'E'+details.id);
        System.out.println("Section: "+section);
        System.out.println(" ");
    }
}
class Student extends Details
{
    String cls;
    PersonalDetails details;
    public void show()
    {
        showc();
        System.out.println("Name: "+details.name);
        System.out.println("ID: "+'S'+details.id);
        System.out.println("Class: "+cls);
        System.out.println(" ");
    }
}
public class Composition {
    public static void main(String[] args)
    {
        Employee emp1 =new Employee();
        emp1.details=new PersonalDetails("Suresh",'M');
        emp1.section="Java";

        Student st1 =new Student();
        st1.details=new PersonalDetails("Ramya",'M');
        st1.cls="1 sem";


        emp1.show();
        st1.show();
    }
}
