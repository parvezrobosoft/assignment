package task6;

import java.util.*;

class Student
{
    int id;
    String name;
    float avg;
    List<Integer> grades;


    public Student( int id,String name, List<Integer> grades)
    {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
}

public class Grade {
    public static void main(String[] args) {


        ArrayList<Student> students =new ArrayList<>();


        Student s1 =new Student(1,"Alice", List.of(88, 92, 95));
        Student s2 =new Student(2,"Bob", List.of(78, 85, 82));

        students.add(s1);
        students.add(s2);

        Map<String, Float> stringMap=new HashMap<>();

        for (Student st:students)
        {
            int sum=0;
            for (int i: st.grades)
            {
                sum=sum+i;
            }
            st.avg=(float)sum/st.grades.size();
        }


        stringMap.put(s1.name,s1.avg);
        stringMap.put(s2.name, s2.avg);

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


            if (stringMap.get(name)<90 &&stringMap.get(name)>80)
            {
                System.out.println("set B (>80 , <90):");
                System.out.println(name+" : "+ stringMap.get(name));
            }


            if ( stringMap.get(name)<80)
            {
                System.out.println("set C (>80 , <90):");
                System.out.println(name+" : "+ stringMap.get(name));
            }
        }

    }
}
