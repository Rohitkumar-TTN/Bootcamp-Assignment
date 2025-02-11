import java.util.List;
import java.util.Optional;
class student{
   private  String FirstName;
   private String MiddleName;
   private String LastName;
    student(String firstName,String lastName){
        FirstName=firstName;
        LastName=lastName;
    }
    student(String firstName,String middleName,String lastName){
        FirstName=firstName;
        MiddleName=middleName;
        LastName=lastName;
    }
    String getMiddleName(){
        return MiddleName;
    }
}
public class Question4 {
    public static void main(String[] args) {
        student s1=new student("Anurag","Dwivedi");
        student s2=new student("Rohit","Kumar","Upadhyay");

        Optional<String> c=Optional.of(s2.getMiddleName());
      System.out.println("Returning the length of middlename with optional class object "+c);
        Optional<String> opt = Optional.ofNullable(s1.getMiddleName());
        System.out.println("to handle the null values of middlename we use ofNullable "+opt);

    }
}
