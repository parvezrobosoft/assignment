package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeComparator {
    public static void gradeSort(List<Student> studentList)
    {

        Collections.sort(studentList);

        studentList.forEach(System.out::println);

//        for (Student student : studentList)
//        {
//        System.out.println(student);
//        }


    }


    public static void main(String[] args) {

        Student s1 = new Student("Anil", 12, 3);
        Student s2 = new Student("Sunil", 21, 10);
        Student s3 = new Student("Mary", 17, 5);
        Student s4 = new Student("Vikyath", 26, 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

         gradeSort(studentList);



    }
}
