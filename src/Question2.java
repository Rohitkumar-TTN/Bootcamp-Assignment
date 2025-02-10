import java.util.*;
class Employee implements Comparable<Employee> {
    Double age, salary;
    String firstName, lastName;
    public Employee(String firstName, String lastName, Double age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee other) {
        return (firstName+ " " + lastName).compareTo(other.firstName+ " " + other.lastName);
    }
    public String toString() {
        return  firstName + " " + lastName + " | Age:" + age + " | Salary:" + salary;
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary.compareTo(e2.salary);
    }
}
 class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anurag", "Dwivedi", 21.0, 70000.0));
        employees.add(new Employee("Anurag", "Chaubey", 22.0, 60000.0));
        employees.add(new Employee("Rohit", "Kumar",23.0, 65000.0));
        Collections.sort(employees);              // Natural Sort
        System.out.println("Sorted by Name: " + employees);
        employees.sort(new SalaryComparator());   // Custom Sort
        System.out.println("Sorted by Salary: " + employees);
    }
}
