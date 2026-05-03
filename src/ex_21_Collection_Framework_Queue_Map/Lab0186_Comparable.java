package ex_21_Collection_Framework_Queue_Map;

import java.util.*;
public class Lab0186_Comparable {
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Amit");
        Employee e2 = new Employee(1, "Pramod");
        Employee e3 = new Employee(5, "Ravi");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println("Before Sorting: " + employeeList);

        // Sort based on id
        Collections.sort(employeeList);
        System.out.println("After Sorting: " + employeeList);
    }
}

class Employee implements Comparable<Employee>{
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String printDetails(){
        return id + " - " + name;
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id ;
    }
}