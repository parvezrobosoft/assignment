package task5;

import java.util.Arrays;

public class StringBuilderAppend
{
    public static void main(String[] args) {

        String[] str = {"Hi", "how", "are", "you"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i< str.length; i++)
        {
            builder.append(str[i]);
            builder.append(" ");
        }



        System.out.println("builder :"+builder);


    }
}
