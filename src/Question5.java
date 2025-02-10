 class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;


    public Employee() {
    }
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "Employee [First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", Designation: " + designation + "]";
    }
}
class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anurag", "Dwivedi", 25, "Frontend Developer");
        System.out.println(emp1);


        Employee emp2 = new Employee("Rohit", "Kumar");
        emp2.setAge(30);
        emp2.setDesignation("Backend Developer");
        System.out.println(emp2);
    }
}
