import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee{
     String fullName;
     Long salary;
     String city;

    public Employee(String fullName,Long salary,String city){
        this.city=city;
        this.fullName=fullName;
        this.salary=salary;
    }
public String toString(){
     StringBuilder s= new StringBuilder();
     for(int i=0;i< fullName.length();i++){
         if(fullName.charAt(i)==' ') break;
         s.append(fullName.charAt(i));
     }
     return s.toString();
}
}
public class Question5 {
    public static void main(String[] args) {
      Employee s1=new Employee("Rohit Kumar Upadhyay",5001L,"Delhi");
      Employee s2= new Employee("Anant sharan Pandey", 4999L,"Lucknow");
      Employee s3=new Employee("Anurag Dwivedi",5001L,"Kanpur");
      Employee s4 =new Employee("Divesh Pandey",1000L,"Delhi");
        List<Employee> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
      List<Employee> s=list.stream().filter(emp-> Objects.equals(emp.city, "Delhi")&&emp.salary>5000).distinct().toList();
      System.out.println(s);

    }
}
