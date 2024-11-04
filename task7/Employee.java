package task7;

public class Employee implements Comparable<Employee>
{
    int id;
    int salary;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", salary=" + salary ;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary-o.salary<1)
            return -1;
        if (this.salary-o.salary>1)
            return 1;
        else
            return this.id-o.id;
    }
}
