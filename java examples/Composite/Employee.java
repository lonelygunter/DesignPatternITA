package Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates; // Design pattern Composite

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public void addSubordinates(Employee employee){
        subordinates.add(employee);
    }

    public void removeSubordinates(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Composite.Employee : [ Name: " + name + ", dept: " + dept + ", salary: " + salary + " ]");
    }
}
