import java.util.Objects;

 record Stud(int id, String name, String standard) {


    public Stud {
        Objects.requireNonNull(name, "Name cannot be null");
        Objects.requireNonNull(standard, "Standard cannot be null");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Stud student = (Stud) obj;
        return id == student.id &&
                name.equals(student.name) &&
                standard.equals(student.standard);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard);
    }
}

 class Main {
    public static void main(String[] args) {
        try {

            Student student1 = new Student(1, "Rohit", "10th Grade");
            Student student2 = new Student(2, "Anurag", "12th Grade");
            Student student3 = new Student(1, "Rohit", "10th Grade"); // Same as student1

            System.out.println(student1);
            System.out.println(student2);

            System.out.println("student1 equals student3? " + student1.equals(student3));

            System.out.println("HashCode of student1: " + student1.hashCode());
            System.out.println("HashCode of student3: " + student3.hashCode());


            Student student4 = new Student(3, null, "8th Grade");

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
