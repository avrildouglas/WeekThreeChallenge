package week3C;

import java.util.ArrayList;
import java.util.List;

public class Resume {

   private String fName, lName;
   private String email;

   ArrayList<String>Education = new ArrayList<String>();
   ArrayList<String>Experience = new ArrayList<String>();
   ArrayList<String>Skills = new ArrayList<String>();
   // constructor
   public Employee(String firName, String lstNameString, String Email) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
   //   subordinates = new ArrayList<Employee>();
   }

   public void add(Education u) {
      subordinates.add(e);
   }

   public void remove(Education e) {
      subordinates.remove(e);
   }

   public List<Education> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
   }   
}