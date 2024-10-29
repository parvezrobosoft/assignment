package task6;

import java.util.*;

class Student
{
    int id;
    String name;
    int grades[];

    Student(int id,String name,int grades[])
    {
        this.id=id;
        this.name=name;
        this.grades=grades;
    }
}

public class Grade {
    public static void main(String[] args) {


        ArrayList<Student> students =new ArrayList();


        Student s1 =new Student(1,"Alice", new int[]{88, 92, 95});
        Student s2 =new Student(2,"Bob", new int[]{78, 85, 82});

        students.add(s1);
        students.add(s2);

        Map<String, Integer> stringMap=new HashMap<>();

        stringMap.put(s1.name, Arrays.stream(s1.grades).sum()/s1.grades.length);
        stringMap.put(s2.name, Arrays.stream(s2.grades).sum()/s2.grades.length);

        for (String name:stringMap.keySet())
        {
            System.out.println(name+" : "+ stringMap.get(name));
        }

        for (String name:stringMap.keySet())
        {


            if (stringMap.get(name)>90)
            {
                System.out.println("set A (>90):");
                System.out.println(name+" : "+ stringMap.get(name));
            }


            if ((int) stringMap.get(name)<90 && (int) stringMap.get(name)>80)
            {
                System.out.println("set B (>80 , <90):");
                System.out.println(name+" : "+ stringMap.get(name));
            }


            if ( (int) stringMap.get(name)<80)
            {
                System.out.println("set C (>80 , <90):");
                System.out.println(name+" : "+ stringMap.get(name));
            }



        }

    }
}
