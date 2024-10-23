package task_4;

class Animal
{
    public void sound()
    {
        System.out.println("I AM ANIMAL");
    }
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("BOW BOW BOW");
    }
}
class Cat extends Animal
{
    public void sound()
    {
        System.out.println("MEOW MEOW");
    }
}
public class AnimalSound {
    public static void main(String[] args)
    {
Dog dog=new Dog();
dog.sound();
Cat cat =new Cat();
cat.sound();
    }
}
