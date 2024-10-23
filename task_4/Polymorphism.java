package task_4;

class A
{
    public void out()
    {
        System.out.println("Hi , i am class A");
    }
    public void out(String name)
    {
        System.out.println("Hi "+name+" ,i am class A");
    }
}
class B extends A
{
    public void out()
    {
        System.out.println("Hi, i am class B");
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
        A a=new A();
        a.out();
        a.out("Robo");

        B b = new B();
        b.out();
        b.out("Robo");

    }
}
