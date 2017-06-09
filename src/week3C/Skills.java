package week3C;

import java.util.ArrayList;
import java.util.List;

public class Skills {

   private String SkName;
   private ArrayList<Skills> SkSubs;


   // constructor
   public Skills(String SkName) {
      this.SkName = SkName;
      SkSubs = new ArrayList<Skills>();
   }

   public void add(Skills k) {
      SkSubs.add(k);
   }

   public void remove(Skills k) {
      SkSubs.remove(k);
   }

   public ArrayList<Skills> getSubs(){
     return SkSubs;
   }

   public String toString(){
	 return (SkName);
    //  return ("skills\t\r\n" + SkName);
   }   
}