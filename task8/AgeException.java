package task8;

class InvalidAgeException extends ArithmeticException
{
    public InvalidAgeException(String string)
    {
        super(string);
    }
}
public class AgeException {

    public static void ageChecker(int age)
    {
        try
        {

            if(age<0||age>120)
                throw new InvalidAgeException("enter correct age");
            else
                System.out.println(age);

        } catch (InvalidAgeException e) {
            throw new ArithmeticException("w");
        }


    }
    public static void main(String[] args)  {

        int age=190;

       try {
           ageChecker(age);
       }catch (Exception e){
           System.out.println("Enter 0-120");
       }


    }
}
