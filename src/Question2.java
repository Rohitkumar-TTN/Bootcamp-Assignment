import java.util.Objects;


     record Studen(int id, String name, String standard) {


        public Studen {
            Objects.requireNonNull(name, "Name cannot be null");
            Objects.requireNonNull(standard, "Standard cannot be null");
        }
    }

    public class Question2 {
        public static void main(String[] args) {
            try {

                Studen student1 = new Studen(1, "Rohit", "10th Grade");
                Studen student2 = new Studen(2, "Anurag", "12th Grade");
//                Studen student3 = new Studen(3, null, "8th Grade");

                System.out.println(student1);
                System.out.println(student2);
                Studen student3 = new Studen(3, null, "8th Grade");

            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


