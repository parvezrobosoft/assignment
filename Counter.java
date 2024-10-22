class object{
    static int n;
    static
    {
        n=0;
    }

    public object()
    {
        n++;
    }

    static void getCount()
    {
        System.out.println("objects created : "+n);
    }
}

public class Counter {
    public static void main(String[] args){
object o1=new object();
object o2=new object();
object o3=new object();
object o4=new object();
object.getCount();

    }
}
