package week3C;

import java.util.ArrayList;
import java.util.List;

public class Education {

   private String EdName;
   private ArrayList<Education> EdSubs;
 //  ArrayList<String>Education = new ArrayList<String>();

   // constructor
   public Education(String Edname) {
      this.EdName = EdName;
      EdSubs = new ArrayList<Education>();
   }

   public void add(Education u) {
      EdSubs.add(u);
   }

   public void remove(Education u) {
      EdSubs.remove(u);
   }

   public ArrayList<Education> getSubs(){
     return EdSubs;
   }

   public String toString(){
      return (EdName);
     // return ("Education\t\r\n" + EdName);
   }   
}