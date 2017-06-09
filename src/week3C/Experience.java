package week3C;

import java.util.ArrayList;
import java.util.List;

public class Experience {

   private String ExName;
   private ArrayList<Experience> ExSubs;


   // constructor
   public Experience(String Exname) {
      this.ExName = ExName;
      ExSubs = new ArrayList<Experience>();
   }

   public void add(Experience x) {
      ExSubs.add(x);
   }

   public void remove(Experience x) {
      ExSubs.remove(x);
   }

   public ArrayList<Experience> getSubs(){
     return ExSubs;
   }

   public String toString(){
	   return (ExName);
    //  return ("Experience\t\r\n" + ExName);
   }   
}