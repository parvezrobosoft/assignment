package task7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparator
{
    public static void employeeSort(List<Employee> employeeList)

    {
    Collections.sort(employeeList);
    for (Employee employee:employeeList)
    {
        System.out.println(employee);
    }

    }
    public static void main(String[] args) {

            Employee e1 = new Employee(15, 30000);
            Employee e2 = new Employee(9, 50000);
            Employee e3 = new Employee(13, 15000);
            Employee e4 = new Employee(7, 50000);

                List<Employee> employeeList = new ArrayList<>();
                employeeList.add(e1);
                employeeList.add(e2);
                employeeList.add(e3);
                employeeList.add(e4);

                employeeSort(employeeList);





    }
}
