import java.util.Scanner;

public class Consonantdetermination
{
    public static void main(String[] args){

        System.out.println("Enter a character");
        Scanner scanner = new Scanner(System.in);
        char str = scanner.next().charAt(0);


        switch (str)
        {
            case 'A','a','E','e','I','i','O','o','U','u':
                System.out.println("Given character is vowel");
                break;

            default:
                System.out.println("Given character is a consonant");

        }



    }
}
