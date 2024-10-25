package task5;

import java.util.Arrays;

class StringMethods
{
    public void run(String str) {
        System.out.println("str.toLowerCase():" + str.toLowerCase());
        System.out.println("str.toUpperCase():" + str.toUpperCase());
        System.out.println("str.getBytes():" + Arrays.toString(str.getBytes()));
        System.out.println("str.length():" + str.length());
        System.out.println("str.charAt(1):" + str.charAt(1));
        System.out.println("str.concat(hi):" + str.concat(" hi"));
        System.out.println("str.contains(a):" + str.contains("a"));
        System.out.println("str.getClass()" + str.getClass());
        System.out.println("str.replace('a','u'):" + str.replace('a', 'u'));
        System.out.println();
        System.out.println();
    }
}
class StringBuilderMethods
{
    public void run(StringBuilder str) {
        System.out.println("str.length():" + str.length());
        System.out.println("str.charAt(1):" + str.charAt(1));
        System.out.println("str.append(hi):" + str.append(" hi"));
        System.out.println("str.getClass()" + str.getClass());
        System.out.println("str.replace():" + str.replace(1,3,"qqq"));
        System.out.println();
        System.out.println();
    }
}
class StringBufferMethods
{
    public void run(StringBuffer str) {
        System.out.println("str.length():" + str.length());
        System.out.println("str.charAt(1):" + str.charAt(1));
        System.out.println("str.append(hi):" + str.append(" hi"));
        System.out.println("str.getClass()" + str.getClass());
        System.out.println("str.replace():" + str.replace(1,3,"qqq"));
        System.out.println();
        System.out.println();
    }
}
public class defaultMethods {
    public static void main(String[] args) {

        String str = "Ramesh";
        StringMethods stringMethods=new StringMethods();
        stringMethods.run(str);

        StringBuilder sBuilder=new StringBuilder("Sunday");
        StringBuilderMethods builderMethods=new StringBuilderMethods();
        builderMethods.run(sBuilder);

        StringBuffer sBuffer=new StringBuffer("Beautiful");
        StringBufferMethods bufferMethods=new StringBufferMethods();
        bufferMethods.run(sBuffer);


    }
}
