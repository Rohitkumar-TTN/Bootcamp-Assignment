import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


class Employe {
    String name;
    int age;
    String designation;


    Employe(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employe e = (Employe) o;
        return age == e.age && name.equals(e.name) && designation.equals(e.designation);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }


    @Override
    public String toString() {
        return name + " (" + designation + ")";
    }


    public static void main(String[] args) {
        Map<Employe, Double> employeeSalaries = new HashMap<>();


        Employe emp1 = new Employe("Rohit", 22, "SDE");
        Employe emp2 = new Employe("Harsh", 23, "Manager");
        Employe emp3 = new Employe("Chari", 26, "Analyst");


        employeeSalaries.put(emp1, 70000.0);
        employeeSalaries.put(emp2, 90000.0);
        employeeSalaries.put(emp3, 60000.0);


        employeeSalaries.forEach((employee, salary) ->
                System.out.println(employee + " earns $" + salary)
        );
    }
}



