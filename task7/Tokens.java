package task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tokens {
    List<String> t1=new ArrayList<>(10);


    public Tokens()
    {
       resetTokens();

    }

    @Override
    public String toString() {
        return
                "t1=" + t1 ;
    }

    public void resetTokens()
    {
        t1.clear();
        for (int i=0;i<10 ;i++)
        {
            t1.add("active");
        }
        System.out.println("TokenList "+t1);
    }
    public void inactive(int a)
    {
        t1.remove(a);
        t1.add(a,"inactive");
        System.out.println("TokenList now"+t1);
    }
    public void newGame()
    {
        resetTokens();
    }

}
