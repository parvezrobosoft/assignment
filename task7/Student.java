package task7;

public class Student implements Comparable<Student>
{
    private String name ;
    private int rollNumber;
    private int grade;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade=" + grade ;
    }

    public int getRollNumber() {
        return rollNumber;
    }



    public int getGrade() {
        return grade;
    }

    public Student(String name, int rollNumber, int grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

    }

    @Override
    public int compareTo(Student o) {
        return this.grade -o.grade;
    }
}
