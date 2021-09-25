package Composite;

import java.util.Iterator;
import java.util.List;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Adriana", "Main", 30000);

        Employee headMarketing = new Employee("Roberto", "Marketing", 20000);
        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Alessandro", "Marketing", 10000);

        Employee headDevelopment = new Employee("Luigi", "Development", 20000);
        Employee dev1 = new Employee("Ilaria", "Development", 10000);
        Employee dev2 = new Employee("Giovanni", "Development", 10000);

        ceo.addSubordinates(headMarketing);
        ceo.addSubordinates(headDevelopment);

        headMarketing.addSubordinates(clerk1);
        headMarketing.addSubordinates(clerk2);

        headDevelopment.addSubordinates(dev1);
        headDevelopment.addSubordinates(dev2);

        System.out.println(ceo);

        List<Employee> ceoSubordinates = ceo.getSubordinates();
        Iterator<Employee> ceoSubIter = ceoSubordinates.iterator();

        while (ceoSubIter.hasNext()) {
            Employee e = ceoSubIter.next();
            System.out.println(e);

            List<Employee> headSubordinates = e.getSubordinates();
            Iterator<Employee> headSubIter = headSubordinates.iterator();
            
            while (headSubIter.hasNext()) {
                System.out.println(headSubIter.next());
            }
        }
    }
}
