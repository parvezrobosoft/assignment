package task6;

import java.util.ArrayList;

public class ArrayListCompare {
    public static void main(String[] args) {

        ArrayList<String> s =new ArrayList<String>();
        s.add("hi");
        s.add("how");
        s.add("are");
        s.add("you");
//        s.add("hi");

        int flag=0;
        int size=s.size();

        for(int i=0;i<size-1;i++)
        {
            for (int j = i+1; j <size; j++)
            {
              if(s.get(i) == s.get(j))
              {
                  flag=1;
              }
            }
        }

        if(flag==1)
        {
            System.out.println("List has duplicate element");
        }
        else
        {
            System.out.println("List does not have duplicate elements");
        }
    }
}
