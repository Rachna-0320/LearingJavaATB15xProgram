package ex_21_Collection_Framework_Queue_Map;

import java.util.ArrayList;
import java.util.List;

public class Lab0187_Comparator {
    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(3, "John", 100));
        list.add(new Employee2(1, "Alice", 134));
        list.add(new Employee2(5, "Bob", 234));

        System.out.println("Original List: " + list);

        // Sort by ID
        list.sort((e1, e2) -> Integer.compare(e1.id, e2.id));
        System.out.println("Sorted by ID: " + list);

        // Sort by Name
        list.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted by Name: " + list);

        // Sort by Salary
        list.sort((e1, e2) -> Integer.compare(e1.salary, e2.salary));
        System.out.println("Sorted by Salary: " + list);
    }
}

class Employee2 {
    Integer id;
    String name;
    Integer salary;

    public Employee2(Integer id, String name, Integer salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
