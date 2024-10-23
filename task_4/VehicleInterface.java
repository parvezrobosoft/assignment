package task_4;

interface Vehicle
{
    void start();
    void stop();
}

class Bike implements Vehicle
{
    public void start()
    {
        System.out.println("Your bike is starting... ");
    }
    public void stop()
    {
        System.out.println("Your bike is stopping... ");
    }
}

class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Your car is starting... ");
    }
    public void stop()
    {
        System.out.println("Your car is stopping... ");
    }
}

public class VehicleInterface {
    public static void main(String[] args)
    {
    Car honda = new Car() ;
    honda.start();
    honda.stop();
        System.out.println("");
    Bike hero = new Bike() ;
    hero.start();
    hero.stop();
    }
}
