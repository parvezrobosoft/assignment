package task_4;

abstract class Shape
{
    float area;
    abstract public void area();
}
class Circle extends Shape
{
    float r;
    Circle(float r)
    {
        this.r=r;
        area();
    }
    public void area()
    {
        area = 22 * r*r / 7;
        System.out.println("Circle Area : "+area);
    }
}
class Rectangle extends Shape
{
    float a;
    float b;
    Rectangle(float a,float b)
    {
        this.a=a;
        this.b=b;
        area();
    }
    public void area()
    {
        float area = a*b;
        System.out.println("Rectangle Area : "+area);
    }
}
public class Area {
    public static void main(String[] args)
    {
        Circle a = new Circle(7) ;
        Shape b = new Rectangle(3,4);
    }
}